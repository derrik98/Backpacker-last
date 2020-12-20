package controller;

import java.util.List;

import entity.User;
import entity.UserDAO;

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
//      UserDB userdb = new UserDB("C:\\Users\\danie\\OneDrive\\Desktop\\Università\\ISPW\\Progetto Finale\\trunk\\resources\\userDB.txt");
//      System.out.println(userdb.toString());
//      if(userdb.checkCredential(email, password) == true) {
      	loginBean = new RegisterBean();
//      	System.out.println("utente trovato");
      	loginBean.setEmail(email);
      	loginBean.setPassword(password);
//      }
//      else {
//          loginBean = null;
//          System.out.println("utente non trovato");
//      }
      // Altrimenti restituisci null
  	
  	//List<User> list = UserDAO.retrieiveByUsername(email);

//  	if(list.size() != 0) {
//  		loginBean = new LoginBean();
//  		for (User user1 : list) {
//  			System.out.println(user1.toString() + "+++++++++++++++++++++");	
//  			
//  			}
//  	}
//  	else {
  		System.out.println("nuovo utente");
  		UserDAO.addUser(new User(nome, cognome, password, email));
  //		loginBean = null;
  	//}
		
		//UserDAO.addUser(user);
  	
  	
  	
      return loginBean;
	}
	
}
