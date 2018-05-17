package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	private static final String DB_IP = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_NAME = "usersdb";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "123asd";
	
	private static DBManager instance = new DBManager();
	private Connection con = null;
	
	private DBManager() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		}
		
		System.out.println("Driver is loaded!");
		//create the connection
		try {
			con = DriverManager.getConnection("jdbc:mysql://"+DB_IP+":"+DB_PORT+"/"+DB_NAME,DB_USER, DB_PASS);
		} 
		catch (SQLException e) {
			System.out.println("Error connecting to Database - " + e.getMessage());
		}
	}
	
	public static synchronized DBManager getInsnce() {
		return instance;
	}
	
	
	public Connection getConnection() {
		return con;
	}
}
