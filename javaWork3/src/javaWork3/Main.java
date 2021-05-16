package javaWork3;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Aslıhan", "Avşar", "aslihanavsar0@hotmail.com", "a123456");
		User user2 = new User("Sümeyye", "Sabırlı", "sumeyyesabirli0@hotmail.com", "s123456");
		User user3 = new User("Özgür", "Güney", "ozgrgny@hotmail.com", "1907og");
		
		Student student1 = new Student("Aslıhan", "Avşar", "aslihanavsar0@hotmail.com", "a123456");
		Student student2 = new Student("Sümeyye", "Sabırlı", "sumeyyesabirli0@hotmail.com", "s123456");
		Student student3 = new Student("Özgür", "Güney", "ozgrgny@hotmail.com", "1907og");
		
		Instructor instructor = new Instructor();
		instructor.setName("Engin");
		instructor.setLastName("Demiroğ");
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		User users [] = {user1, user2, user3 };
		userManager.multiaddd(users);
				
		StudentManager studentManager = new StudentManager();
		studentManager.login(student1);
		studentManager.addCourse(student2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse();
		instructorManager.updateCourse();
	}

}
