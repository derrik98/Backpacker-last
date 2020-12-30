package controller.RegisterController;

import entity.GenericUser;
import entity.GenericUserDAO;

public class RegisterController {

	private static RegisterController INSTANCE = null;
	
    private RegisterController() {}

    public static RegisterController getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new RegisterController();
        }

        return INSTANCE;
    }
    

	public RegisterBean createProfile(String nome, String cognome, String password, String email) throws Exception {
		RegisterBean loginBean;
  		System.out.println("nuovo utente");
  		if(GenericUserDAO.addUser(new GenericUser(nome, cognome, password, email))== true) {
  			System.out.println("utente aggiunto");
  			loginBean = new RegisterBean();
  			loginBean.setEmail(email);
  	      	loginBean.setPassword(password);
  		}
  		else {
  			System.out.println("utente non aggiunto");
  			loginBean = null;
  		}
      return loginBean;
	}
	
}
