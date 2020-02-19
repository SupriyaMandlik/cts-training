package inheritance;
import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		int count = 0,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number till 1s should be counted:");
	
		n=sc.nextInt();
		System.out.println("Enter the number ");
	int	a=sc.nextInt();
		sc.close();
		
	    for(int i = a; i<=n ; i++)
	    {
	        String number = String.valueOf(i);
	        while(number.contains("1"))
	        {
	            number= number.substring(number.indexOf("1")+1);
	            count ++;
	        }
	    }
	    System.out.println("The count is :"+count);
		
	}
}
