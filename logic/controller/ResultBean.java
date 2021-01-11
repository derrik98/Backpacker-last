package controller;

import java.util.ArrayList;
import java.util.List;

public class ResultBean {
	
	private static ResultBean INSTANCE = null;

	private ArrayList<String> monuments = new ArrayList<String>();
	private ArrayList<List<String>> itinerary = new ArrayList<List<String>>();
	
	public ResultBean() {
	}

	public ResultBean getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new ResultBean();
        }
        return INSTANCE;
    }
	
	public ArrayList<List<String>> getItinerary() {
		//System.out.println(itinerary);
		return itinerary;
	}

	public void setItinerary(ArrayList<String> itinerary) {
		//this.itinerary = itinerary;
		this.itinerary.add(itinerary);
	}

	

	public List<String> getMonuments() {
		return monuments;
	}

	public void setMonuments(ArrayList<String> monuments) {
		this.monuments = monuments;
	}
	
}
