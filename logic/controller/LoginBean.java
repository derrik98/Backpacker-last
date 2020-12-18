package controller;

public class LoginBean {

	 	private String email;
	    private String password;

	    private String nome;
	    private String cognome;

	    public LoginBean() {
	    }

	    public String getUsername() {
	        return email;
	    }

	    public void setUsername(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCognome() {
	        return cognome;
	    }

	    public void setCognome(String cognome) {
	        this.cognome = cognome;
	    }

	    public boolean validate() throws Exception {
	        // controllo sintattico
	    	System.out.println("loginbean" + email + password);
	    	
	        if (email == null || email == "" || password == null || password == "") {
	            return false;
	        }
	        System.out.println(email + password);
	        LoginBean utenteTrovato = LoginController.getInstance().login(email, password);
//	        if(utenteTrovato==null)
//	            return false;
//	        return true;
	        return utenteTrovato != null;

	    }

	
}
