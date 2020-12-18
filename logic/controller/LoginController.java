package controller;

import java.util.List;

import entity.User;
import entity.UserDAO;

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
        // Esegui accesso al DB per verificare se username e password sono corretti
        // Se sono corretti allora restituisci nome e cognome
    	//System.out.println(username+password);
    	LoginBean loginBean;
//        UserDB userdb = new UserDB("C:\\Users\\danie\\OneDrive\\Desktop\\Università\\ISPW\\Progetto Finale\\trunk\\resources\\userDB.txt");
//        System.out.println(userdb.toString());
//        if(userdb.checkCredential(email, password) == true) {
//        	loginBean = new LoginBean();
//        	System.out.println("utente trovato");
//        	//loginBean.setUsername(username);
//        	//loginBean.setPassword(password);
//        }
//        else {
//            loginBean = null;
//            System.out.println("utente non trovato");
//        }
        // Altrimenti restituisci null
    	
    	List<User> list = UserDAO.retrieiveByUsername(email);

    	if(list.size() != 0) {
    		loginBean = new LoginBean();
    		for (User user1 : list) {
    			System.out.println(user1.toString() + "+++++++++++++++++++++");	
    			
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
