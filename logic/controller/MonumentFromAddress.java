package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MonumentFromAddress extends JSONFactory{
	
	private static MonumentFromAddress INSTANCE = null;
	public static ArrayList<String> monuments = new ArrayList<String>();
	
	public MonumentFromAddress getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new MonumentFromAddress();
        }
        return INSTANCE;
    }
	
	public MonumentFromAddress() {
		
	}
	
	public static void setMonuments(ArrayList<String> monuments) {
		MonumentFromAddress.monuments = monuments;
	}

	
	
	public ArrayList<String> getMonuments() {
		return monuments;
	}



	@Override
	public boolean getJSON(String address, String type) throws JSONNotFound {
		JSONObject json;
		try {
			json = readJsonFromUrl("https://maps.googleapis.com/maps/api/place/textsearch/json?query=" + type + "+in+" + convertString(address) + "&radius=7000&type=tourist_attraction&language=it&key=AIzaSyDKAl31fAwxbDImIXXOxSre5uma5WdOgHg");
			JSONArray a = (JSONArray) json.get("results");
			System.out.println(a.length());
			for(int i = 0; i < a.length(); i++) {
				JSONObject o = a.getJSONObject(i);
				System.out.println(o.get("name"));
				monuments.add(o.get("name").toString());
				//monuments.add(i, o.get("name").toString());
			}
				
			//System.out.println(json);
			
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
