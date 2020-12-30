package controller;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class CityFromCountry extends JSONFactory{

	@Override
	public boolean getJSON(String city, String country) throws JSONNotFound {
		JSONObject json;
		try {
			json = readJsonFromUrl("https://maps.googleapis.com/maps/api/geocode/json?address=" + city + "&components=country:" + country + "&key=AIzaSyDKAl31fAwxbDImIXXOxSre5uma5WdOgHg");
			System.out.println(json.getString("status"));
			if(!json.getString("status").equals("OK")) {
				throw new JSONNotFound();
			}
		} catch (IOException | JSONException j) {
			System.out.println("erro");
		}		return true;
		
	}

}
