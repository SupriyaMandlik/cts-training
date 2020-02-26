package com.cts.training.serialization;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
public class SerializationDemo {

	public static void serialize(Employee employee,String path)
	{
		try {
			FileOutputStream fout=new FileOutputStream(path);
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			ObjectOutputStream oos=new ObjectOutputStream(bout);
			oos.writeObject(employee);
			oos.close();
			bout.close();
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static Object deserialize(String filePath)
	{
		try {
			FileInputStream fin=new FileInputStream(filePath);
			BufferedInputStream bin=new BufferedInputStream(fin);
			ObjectInputStream oin=new ObjectInputStream(bin);
			Object obj=oin.readObject();
			oin.close();
			return obj;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}return null;
	}
	public static void main(String args[])
	{
	//Employee employee=new Employee(101,"nikita","mumbai","developer",22,34,896852);
    //  serialize(employee,"employee.txt");
    //    System.out.println("object saved successfully");
		Employee employee=(Employee)deserialize("employee.txt");
		System.out.println(employee);
	}
}