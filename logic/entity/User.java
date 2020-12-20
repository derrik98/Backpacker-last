package entity;

import java.sql.SQLException;
import java.util.List;

public class User {
	
	private int id;
	private String name;
	private String surname;
	private String email;
	private String password;
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public User(String name, String surname, String password, String email) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
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
	
	public static void main(String args[]) throws Exception {

		User user = new User("Timmy", "Turner", "bise", "bise@alice.it");
		//User user = new User("simoa", "dErrco", "biser", "deriiy");

		try {
			List<User> list = UserDAO.retrieiveByUsername(user.getEmail());

			for (User user1 : list) {
				System.out.println(user1.toString());			
				}
			
			UserDAO.addUser(user);
			//UserDAO.removeUserById(user);
		} catch (SQLException se) {
			// Errore durante l'apertura della connessione
			se.printStackTrace();
//		} catch (ClassNotFoundException driverEx) {
//			// Errore nel loading del driver
//			driverEx.printStackTrace();
//		} //catch (DuplicatedRecordException dre) {
//			try {
//				System.out.println("Album already present.\n Removing old item.");
//				UserDAO.removeUserById(user);
//				System.out.println("Replacing with the new item.");
//				UserDAO.addUser(user);
//			} catch (Exception e) {
//				e.printStackTrace();
//		//	}
		}
	}

	
}
