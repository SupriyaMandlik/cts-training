import java.util.Scanner;

public class Add {
public static void main(String[] args) {
  int n ,sum;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
for (sum=0;n!=0;n/=10)
{
	sum+=n%10;	
}
System.out.println("sum of the digit " +sum);
	
}
}
