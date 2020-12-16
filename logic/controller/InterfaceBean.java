package controller;

public class InterfaceBean {
	
	private String country;
	private String city;
	private String address;
	
	//IL CONTROLLER DOVREBBE ESSERE IL LISTENER
	
	public InterfaceBean() {
		
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
	
	
	public boolean validate() {
        // controllo sintattico
        if (country == "" || city == "" || address == null) {
            return false;
        }

        InterfaceBean datiCorretti = SearchController.getInstance().getInput(country, city, address);
        //System.out.println(city);
       // System.out.println(country);
        /*if(utenteTrovato==null)
            return false;
        return true;*/
        return datiCorretti != null;

    }
	

}
