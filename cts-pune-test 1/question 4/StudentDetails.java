package Exam;	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.List;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.List;

	public class StudentDetails {
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StudentRetreive td =new StudentRetreive();
			List<Subject> list = td.getAllStudent();
			System.out.println("Enter Student rollno");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter student Name");
			String nm = br.readLine();
			System.out.println("Enter student marks in English");
			int en = Integer.parseInt(br.readLine());
			System.out.println("Enter student marks in Maths");
			int mt = Integer.parseInt(br.readLine());
			System.out.println("Enter student marks in Science");
			int sc = Integer.parseInt(br.readLine());
			Subject std = new Subject(id, nm, en,mt,sc);
			td.addStudent(std);
			System.out.println("Display detais of all student:");
			System.out.println("Details:");
			list.forEach(System.out::println);
		}
}