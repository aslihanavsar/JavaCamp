package javaWork2;



public class Main {

	public static void main(String[] args) {
		
		System.out.println("Kodlama.io Sitemize Ho�geldiniz..");
		
		Course course1 = new Course ("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT", "Engin Demiro�", 21.04, 12.06);
		CourseManager CourseManager1 = new CourseManager();
		CourseManager1.courseInformationJava(course1);
		
		Course course2 = new Course ("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�", 09.01, 12.04);
		CourseManager CourseManager2 = new CourseManager();
		CourseManager2.courseInformationCSharp(course2);
		
		
		Course [] courses = {course1, course2};
		for(Course cours: courses) {
			System.out.println(cours.courseName);
		}


	}
}
