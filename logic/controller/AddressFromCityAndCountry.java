package controller;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AddressFromCityAndCountry extends JSONFactory{
	

	@Override
	public boolean getJSON(String address, String city) {
		JSONObject json;
		try {
			json = readJsonFromUrl("https://maps.googleapis.com/maps/api/place/autocomplete/json?input=" + address + "&types=geocode&key=AIzaSyDKAl31fAwxbDImIXXOxSre5uma5WdOgHg");
			JSONArray a = (JSONArray) json.get("predictions");
			JSONObject o = a.getJSONObject(0);
			JSONArray arr = o.getJSONArray("terms");
			JSONObject ob = arr.getJSONObject(2);
			
			if(ob.get("value").equals(city)) {
				return true;
			}
			
					System.out.println(json);
					System.out.println(a);
					System.out.println(o);
					System.out.println(arr);
					System.out.println(ob);
					System.out.println(ob.get("value"));
		} catch (IOException | JSONException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
}
