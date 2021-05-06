package javaWork2;



public class Main {

	public static void main(String[] args) {
		
		System.out.println("Kodlama.io Sitemize Hoþgeldiniz..");
		
		Course course1 = new Course ("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT", "Engin Demiroð", 21.04, 12.06);
		CourseManager CourseManager1 = new CourseManager();
		CourseManager1.courseInformationJava(course1);
		
		Course course2 = new Course ("Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð", 09.01, 12.04);
		CourseManager CourseManager2 = new CourseManager();
		CourseManager2.courseInformationCSharp(course2);
		
		
		Course [] courses = {course1, course2};
		for(Course cours: courses) {
			System.out.println(cours.courseName);
		}


	}
}
