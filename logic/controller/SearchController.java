package controller;

import java.io.IOException;
import org.json.JSONException;

public class SearchController {
	
	//private static String country;
	//private static String city;
	//private static String address;
	
	private static SearchController INSTANCE = null;
	
//	private SearchController(String country, String city, String address) {
//		SearchController.country = country;
//		SearchController.city = city;
//		SearchController.address = address;
//	}

    public static SearchController getInstance() {
        if(INSTANCE==null) {
            //INSTANCE = new SearchController(country, city, address);
            INSTANCE = new SearchController();
        }

        return INSTANCE;
    }
    

    public InterfaceBean getInput(String country, String city, String address) throws IOException, JSONException, JSONNotFound {
    	InterfaceBean interfacebean;
    	System.out.println(country + city + address);
    	JSONFactory firstcheck = new CityFromCountry();
    	if(firstcheck.getJSON(city, country)==true) {
    		interfacebean = new InterfaceBean(address, city, country);
    		
    	}
    	else {
    		interfacebean = null;
    		throw new JSONNotFound();
    	}
    		//JSONFactory secondcheck = new CityFromCountry();
    		//if(secondcheck.getJSON(city, country));
    	//}
    	
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
