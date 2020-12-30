package entity;

public class RestaurateurUser {

	private int id;
	private String name;
	private String surname;
	private String email;
	private String password;
	private int identificationNumber;
	
	public RestaurateurUser() {
	}
	
	public RestaurateurUser(String name, String surname, String password, String email, int identificationNumber) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.identificationNumber = identificationNumber;
	}
	
	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public int getId() {
		return id;
	}
		
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
    public String toString(){
		return this.surname + " \"" + this.password + "\" (" + this.email + this.name +")";    	
    }
	
}
