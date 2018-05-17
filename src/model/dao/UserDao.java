package model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


import model.User;

public class UserDao {
// must be singleton
	
	private static UserDao instance = new UserDao();
	
	private UserDao() {}
	
	public static synchronized UserDao getInsnce() {
		return instance;
	}
	
	
	public synchronized void addUser(User u) throws SQLException {
		// insert new user into db
		String sql = "INSERT INTO users (name, username, password) VALUES (?,?,?)";
		
		PreparedStatement pstm = DBManager.getInsnce().getConnection().prepareStatement(sql);
			pstm.setString(1, u.getName());
			pstm.setString(2, u.getUsername());
			pstm.setString(3, u.getPass()); // TODO hash password 
		pstm.execute();
	}
	
	
	
	public ArrayList<User> getAllUsers(){
		return null;
		
	}

	public synchronized boolean validLogin() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
