package controller;

import entity.UserDB;

public class LoginController {

	private static LoginController INSTANCE = null;

    private LoginController() {}

    public static LoginController getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new LoginController();
        }

        return INSTANCE;
    }

    public LoginBean login(String username, String password) throws Exception {
        // Esegui accesso al DB per verificare se username e password sono corretti
        // Se sono corretti allora restituisci nome e cognome
    	//System.out.println(username+password);
    	LoginBean loginBean;
        UserDB userdb = new UserDB("C:\\Users\\danie\\OneDrive\\Desktop\\Universit�\\ISPW\\Progetto Finale\\trunk\\resources\\userDB.txt");
        System.out.println(userdb.toString());
        if(userdb.checkCredential(username, password) == true) {
        	loginBean = new LoginBean();
        	loginBean.setUsername(username);
        	loginBean.setPassword(password);
        }
        else {
            loginBean = null;
        }
        // Altrimenti restituisci null
        return loginBean;

    }
	
}
