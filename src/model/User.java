package model;

public class User {
	
	private int id;
	private String name;
	private String pass; 
	private String username;
	
	
	public User(String name, String username, String pass) {
		this.name = name;
		this.pass = pass;
		this.username = username;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}
	
	public String getPass() {
		return pass;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
