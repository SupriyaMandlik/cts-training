package Exam;

import java.util.ArrayList;
public class ArrayListStudent {
	public static void main(String[] args) {
		ArrayList<Student> students =  new ArrayList<>();

		Student std1 = new Student(01, "Supriya", 77.0);
		Student std2 = new Student(02, "Ram", 53.0);
		Student std3 = new Student(03, "Ramesh", 23.5);
		Student std4 = new Student(04, "Suresh", 84.7);
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		System.out.println("Nimish gets "+ grades(std1) + ".");
		System.out.println("Nitin gets "+ grades(std2) + ".");
		System.out.println("Ramesh gets "+ grades(std3) + ".");
		System.out.println("Sanjay gets "+ grades(std4) + ".");
	}


	public static String grades(Student student) {
			if (student.getMarks() >= 80) {
				return "Distinction";
			}else if(student.getMarks() >= 60 && student.getMarks() <=79 ) {
				return "First Class";
			}else if(student.getMarks() >= 50 && student.getMarks() < 60) {
				return "Second Class";
			}else {
				return "Fail";
			}
	}
}