package controller;

public class LoginBean {

	    private String password;
	    private String email;
	    private boolean logged;

	    public LoginBean() {
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

	    public boolean getLogged() {
			return logged;
		}

		public void setLogged(boolean logged) {
			this.logged = logged;
		}

		public boolean validate() throws Exception {
	    	System.out.println("loginbean" + getLogged() + getEmail() + getPassword());
	    	
	        if (email == null || email.equals("") || password.equals(null) || password.equals("")) {
	            return false;
	        }
	        System.out.println(email + password);
	        LoginBean utenteTrovato = LoginController.getInstance().login(password, email);
	        return utenteTrovato != null;

	    }

	
}
