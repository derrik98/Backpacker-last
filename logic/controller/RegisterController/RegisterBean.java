package controller.RegisterController;

public class RegisterBean {

	private String name;
    private String surname;
    private String password;
    private String email;
    private String identificatorNumber;

    public RegisterBean() {
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean validate() throws Exception {
        // controllo sintattico
    	System.out.println("registerbean " + email + password);
    	
        if (email == null || email.equals("") || password.equals(null) || password.equals("") || name.equals("") || surname.equals("")) {
            return false;
        }
        System.out.println(email + password);
        RegisterBean utenteRegistrato = RegisterController.getInstance().createProfile(name, surname, password, email);
        return utenteRegistrato != null;

    }

	
}
