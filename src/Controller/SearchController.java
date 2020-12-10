package Controller;

import graphic.HomeGraphicInterface;

public class SearchController {
	
	private static SearchController INSTANCE = null;
	
	private SearchController() {}

    public static SearchController getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new SearchController();
        }

        return INSTANCE;
    }

    public InterfaceBean getInput(String country, String city, String address) {
        // Esegui accesso al DB per verificare se username e password sono corretti
        // Se sono corretti allora restituisci nome e cognome
        InterfaceBean interfaceBean;
        //if (Math.random() > 0.1) {
            interfaceBean = new InterfaceBean();
            interfaceBean.setCountry(HomeGraphicInterface.country);
            interfaceBean.setCity(HomeGraphicInterface.city);
       // } else {
            interfaceBean = null;
        //}
        // Altrimenti restituisci null
        return interfaceBean;

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
