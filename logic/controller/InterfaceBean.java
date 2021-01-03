package controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import org.json.JSONException;

public class InterfaceBean{
	
	private String country;
	private String city;
	private String address;
	private List<String> monuments;
	


	public InterfaceBean() {
		
	}

	public InterfaceBean(String country, String city, String address) {
		this.country = country;
		this.city = city;
		this.address = address;
		System.out.println(country + city + address);
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		System.out.println(country);
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println(city);
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public boolean validate() throws IOException, JSONException, JSONNotFound {
        // controllo sintattico
        if (country == "" || city == "" || address == null) {
        	System.out.println(country + city + address);
            return false;
        }

        InterfaceBean datiCorretti = SearchController.getInstance().search(this.getCountry(), this.getCity(), this.getAddress());
        System.out.println("provafatta" + city);//FARE COME LA VALIDATE
        System.out.println(country);
        /*if(utenteTrovato==null)
            return false;
        return true;*/
        return datiCorretti != null;

    }

	public List<String> getMonuments() {
		return monuments;
	}

	public void setMonuments(List<String> monuments) {
		this.monuments = monuments;
	}
	

}
