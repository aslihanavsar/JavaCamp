package javaWork3;

public class StudentManager extends UserManager {	
	public void login(Student student) {
		System.out.println(student.getName() + " " + student.getLastName() + " giri�iniz ba�ar�l�.");
		}
	public void addCourse (Student student) {
		System.out.println(student.getName() + " " + student.getLastName() + " kursa kaydoldu.");
	}
		
	}