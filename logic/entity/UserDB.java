ackage entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class UserDB {

private String database;
public static String username;
public static String password;

public UserDB(String inFile){
	this.database = inFile;
	//System.out.println(database);
	//this.outFile = outFile;
}

public boolean checkCredential(String user, String pass) throws Exception {
	
	if (this.chkIn()){
		BufferedReader in; 
		in = new BufferedReader(new FileReader(this.database));

		String line;
		while ((line = in.readLine()) != null){
	    	username = line.substring(9, line.indexOf(","));
	    	System.out.println(username);
	    	if(user.compareTo(username) == 0) {
	    		password = line.substring(20+username.length(), line.length());
	    		System.out.println(password);
		    	if(pass.compareTo(password) == 0) {
		    		return true;
		    	}
	    	}
		}
		in.close();
	}
	return false;
}

public boolean addUser(String username, String passwourd) throws Exception {
	if(this.chkOut()) {
		
		BufferedWriter out;
		out = new BufferedWriter(new FileWriter(this.database, true));
		PrintWriter p = new PrintWriter(out);
		p.append("username:" + username + ", password:"+ passwourd + "\n");
		
		
		p.close();		
		out.close();
		return true;
	}
	return false;
}


public boolean readUser() throws Exception {
	if (this.chkIn()){
		BufferedReader  in; 
		in = new BufferedReader(new FileReader(this.database));
//		BufferedOutputStream  out;
//		out = new BufferedOutputStream(
//			      new FileOutputStream(this.outFile));
//		
		String user;			
	    while ((user = in.readLine()) != null){
	    	
	    	username = user.substring(9, user.indexOf(","));
	    	System.out.println(username);
	    	password = user.substring(9+username.length()+11, user.length());
	    	System.out.println(password);
			//out.write(b);
		}
		
		in.close();
		//out.close();
		return true;
	}
	return false;
}

private boolean chkOut() {
	File f = new File(this.database);
	return ( f.exists() && f.canWrite());
}

private boolean chkIn() {
	File f = new File(this.database);
	System.out.println("system checked");
	return (f.exists() && f.canRead());
}

//public static void main(String args[]) throws Exception {
//	String dest = "C:\\Users\\danie\\Dropbox\\Il mio PC (DESKTOP-5PBHKRJ)\\Desktop\\ProgettoISPW\\trunk\\resources\\userDB.txt";
//	
//	UserDB me = new UserDB(dest);
//	//boolean status = me.readUser();
//	//boolean sta = me.addUser("stefano", "rango");
//	boolean status = me.checkCredential("stefano", "rango");
//	if (!status)
//		System.out.println("The file " + me.database + " has not been copied.");
//	else
//		System.out.println("Done.");
//}
}
