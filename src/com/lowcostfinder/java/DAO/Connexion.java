package com.lowcostfinder.java.DAO;
import java.sql.*;

public class Connexion {

	String url="jdbc:mysql//localhost:3306/bdd";
	String user="moussa";
	String password="moussa";
	Connection connexion=null;
	
	public Connexion(){
	try{
		connexion=DriverManager.getConnection(url, user, password);
	}
	catch (SQLException e){
		
	}finally{
		
	}
	}

}
