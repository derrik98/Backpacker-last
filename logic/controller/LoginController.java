package controller;

import java.util.List;

import entity.GenericUser;
import entity.GenericUserDAO;

public class LoginController {

	private static LoginController INSTANCE = null;

    private LoginController() {}

    public static LoginController getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new LoginController();
        }

        return INSTANCE;
    }

    public LoginBean login(String password, String email) throws Exception {
    	LoginBean loginBean;     
    	
    	List<GenericUser> list = GenericUserDAO.retrieiveByUsername(email);

    	if(list.size() != 0) {
    		loginBean = new LoginBean();
    		for (GenericUser user : list) {
    			System.out.println(user.toString() + "+++++++++++++++++++++");	
    			loginBean.setEmail(user.getEmail());
            	loginBean.setPassword(user.getPassword());
    			
    			}
    	}
    	else {
    		System.out.println("nuovo utente");
    		//UserDAO.addUser(new User(nome, cognome, password, email));
    		loginBean = null;
    	}
		
		//UserDAO.addUser(user);
    	
    	
    	
        return loginBean;

    }
	
}
