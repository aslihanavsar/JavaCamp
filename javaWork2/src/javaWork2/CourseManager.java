package javaWork2;


public class CourseManager {
	
	public void courseInformationJava(Course course) {
		System.out.println("Kurs: " + course.courseName);
		System.out.println("E�itmen: " + course.educatorName);
		System.out.println("Kursun Ba�lang�� Tarihi: " +course.courseStartDate);
		System.out.println("Kursun Biti� Tarihi: " +course.courseEndDate);
		
	}
	public void courseInformationCSharp(Course course) {
		System.out.println("Kurs: " + course.courseName);
		System.out.println("E�itmen: " + course.educatorName);
		System.out.println("Kursun Ba�lang�� Tarihi: " +course.courseStartDate);
		System.out.println("Kursun Biti� Tarihi: " +course.courseEndDate);
		
	}
	
	public void singUpForCourse (Course course) {
	System.out.println(course.courseName + " kursuna kaydoldunuz.." );
		
	}
	public void deleteTheCourse (Course course) {
		System.out.println(course.courseName + " kursundan ayr�ld�n�z..");
	}
}
		