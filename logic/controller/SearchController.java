package controller;

import java.io.IOException;
import org.json.JSONException;

public class SearchController {
	
	
	private static SearchController INSTANCE = null;
	

    public static SearchController getInstance() {
        if(INSTANCE==null) {
            //INSTANCE = new SearchController(country, city, address);
            INSTANCE = new SearchController();
        }

        return INSTANCE;
    }
    

    public InterfaceBean search(String country, String city, String address) throws IOException, JSONException, JSONNotFound {
    	InterfaceBean interfacebean;
    	System.out.println(country + city + address);
    	JSONFactory firstCheck = new CityFromCountry();
    	if(firstCheck.getJSON(city, country)==true) {
    		interfacebean = new InterfaceBean(country, city, address);
    		JSONFactory secondCheck = new AddressFromCity();
    		if(secondCheck.getJSON(address, city)) {
				
				  JSONFactory thirdCheck = new MonumentFromAddress();
				  if(thirdCheck.getJSON(address, "monument")) {
				  interfacebean.setMonuments(MonumentFromAddress.monuments); } else {
				  interfacebean = null; }
				 
    		}
    		else {
    			interfacebean = null;
    		}	
    	}
    	else {
    		interfacebean = null;
    	}
		return interfacebean;
    	}
	

	public void searchAttraction() {
		
	}
	
	public void searchRestaurants() {
		
	}
	
	public void getResult() {
		
	}
	
	public void setResult() {
		
	}
	
	public void showResultOnMap() {
		
	}
	
	public void getCountry() {
		
	}
	
	public void getCity() {
		
	}
	
	public void getAddress() {
		
	}
	
}
