package controller;

import java.io.IOException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MonumentFromAddress extends JSONFactory{
	
	public static List<String> monuments;
	
	@Override
	public boolean getJSON(String address, String type) throws JSONNotFound {
		monuments = null;
		JSONObject json;
		try {
			json = readJsonFromUrl("https://maps.googleapis.com/maps/api/place/textsearch/json?query=" + type + "+in+" + address + "&radius=7000&type=tourist_attraction&key=AIzaSyDKAl31fAwxbDImIXXOxSre5uma5WdOgHg");
			JSONArray a = (JSONArray) json.get("results");
			
			for(int i = 0; i < a.length(); i++) {
				JSONObject o = a.getJSONObject(i);
				JSONArray arr = o.getJSONArray("name");
				System.out.print(arr);
				monuments.add(arr.toString());
			}
				
			System.out.println(json);
			
			if(!json.getString("status").equals("OK")) {
				throw new JSONNotFound("Non sono presenti monumenti in questa zona");
			}
		}
		catch (IOException | JSONException e) {
			e.printStackTrace();
		}
		return true;
	}
}
