package javaWork3;

public class Student extends User {
	private String email;
	private String password;
	
	public Student() {	
	}
	public Student (String name, String lastName, String email, String password) {
		super(name, lastName, email, password);
	}
}
