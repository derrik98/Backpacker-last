package entity;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.StandardOpenOption;

public class UserDB {

private String database;
public static String username;
public static String password;

public UserDB(String inFile){
	this.database = inFile;
	//this.outFile = outFile;
}

public boolean addUser() throws Exception {
	if(this.chkOut()) {
		
		BufferedWriter out;
		out = new BufferedWriter(new FileWriter(this.database, true));
		PrintWriter p = new PrintWriter(out);
		p.append("cittttttttttttttttaa"+"\n");
		
		
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
		String user ;			
	    while ((user = in.readLine()) != null){
	    	
	    	username = user.substring(9, user.indexOf(","));
	    	System.out.println(username);
	    	password = user.substring(20+username.length(), user.length());
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
	return (f.exists() && f.canRead());
}

public static void main(String args[]) throws Exception {
	String dest = "C:\\Users\\danie\\OneDrive\\Desktop\\prova.txt";
	
	UserDB me = new UserDB(dest);
	//boolean status = me.readUser();
	boolean status = me.addUser();
	if (!status)
		System.out.println("The file " + me.database + " has not been copied.");
	else
		System.out.println("Done.");
}
}
