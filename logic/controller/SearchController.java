package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.json.JSONException;

public class SearchController {
	
	
	private static SearchController INSTANCE = null;
	private InterfaceBean interfacebean;
	public static ResultBean resultbean = new ResultBean().getInstance();
	private MonumentFromAddress mfa = new MonumentFromAddress().getInstance();

    public static SearchController getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new SearchController();
        }
        return INSTANCE;
    }
    

    public InterfaceBean getInput(String country, String city, String address) throws IOException, JSONException, JSONNotFound {
    	//InterfaceBean interfacebean;
    	//System.out.println(country + city + address);
    	JSONFactory firstCheck = new CityFromCountry();
    	firstCheck.convertString(address);
    	if(firstCheck.getJSON(city, country)) {
    		interfacebean = new InterfaceBean(country, city, address);
    		interfacebean.setCountry(country);
    		interfacebean.setCity(city);
    		JSONFactory secondCheck = new AddressFromCity();
    		if(secondCheck.getJSON(address, city)) {
				interfacebean.setAddress(address);
				searchMonuments();
				createItinerary(mfa.getMonuments());
				createItinerary(mfa.getMonuments());
				  //JSONFactory thirdCheck = new MonumentFromAddress();
				  //if(thirdCheck.getJSON(address, "monument")) {
				  //interfacebean.setMonuments(MonumentFromAddress.monuments); } else {
				  //interfacebean = null; 
				 // }
				 
    		}
//    		else {
//    			interfacebean = null;
//    		}	
    	}
    	else {
    		interfacebean = null;
    	}
		return interfacebean;
    }
    
    public List<String> searchMonuments() throws JSONNotFound{
    	mfa.getJSON(interfacebean.getAddress(), "monuments");
    	System.out.println("MONUMENTI" + mfa.getMonuments());
    	resultbean.setMonuments(mfa.getMonuments());
		return mfa.getMonuments();
    	
    }
    
	@SuppressWarnings("null")
	public List<String> createItinerary(ArrayList<String> attraction){	
    	Random num = new Random();
    	ArrayList<String> copyList = attraction;
    	ArrayList<String> itinerary = new ArrayList<String>();
    	for(int i = 0; i <= 5; i++) {
    		//int index = num.nextInt(copyList.size());
    		int index = num.nextInt(10);
    		System.out.println(copyList.get(index));
    		itinerary.add(copyList.get(index));
    		copyList.remove(index);
    	}
    	System.out.println(itinerary);
    	resultbean.setItinerary(itinerary);
    	System.out.println(resultbean.getItinerary());
		return itinerary;
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
