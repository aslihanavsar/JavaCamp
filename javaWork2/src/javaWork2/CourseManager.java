package javaWork2;


public class CourseManager {
	
	public void courseInformationJava(Course course) {
		System.out.println("Kurs: " + course.courseName);
		System.out.println("Eðitmen: " + course.educatorName);
		System.out.println("Kursun Baþlangýç Tarihi: " +course.courseStartDate);
		System.out.println("Kursun Bitiþ Tarihi: " +course.courseEndDate);
		
	}
	public void courseInformationCSharp(Course course) {
		System.out.println("Kurs: " + course.courseName);
		System.out.println("Eðitmen: " + course.educatorName);
		System.out.println("Kursun Baþlangýç Tarihi: " +course.courseStartDate);
		System.out.println("Kursun Bitiþ Tarihi: " +course.courseEndDate);
		
	}
	
	public void singUpForCourse (Course course) {
	System.out.println(course.courseName + " kursuna kaydoldunuz.." );
		
	}
	public void deleteTheCourse (Course course) {
		System.out.println(course.courseName + " kursundan ayrýldýnýz..");
	}
}
		