package inheritance;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {


		public static void main(String args[]) throws FileNotFoundException,IOException
		{
			String path="C:\\Users\\admin\\eclipse-workspace\\cts-training\\src\\inheritance\\FileOutputSream.java";

			FileOutputStream out=new FileOutputStream(path,true);

		String message="CTS Trainigng Pune";
			byte b[]=message.getBytes();
			out.write(b);
			out.close();

		}
	}

