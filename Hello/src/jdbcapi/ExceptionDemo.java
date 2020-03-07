package jdbcapi;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
	public void readData() throws IOException
	{
		FileReader fr=new FileReader("enmpData.txt");
		int i=fr.read();
		System.out.println(i);
	}
	public void task2() throws IOException
	{
		readData();
	}
	public static void main(String...args) {
		 ExceptionDemo  ed = new  ExceptionDemo();
		 try {
			 ed.task2();
			 
		 }catch (IOException e) {
		 }
		 System.out.println("end of main");
		 }
	}

