package jdbcapi;
import java.util.Scanner;
public interface SumOfDigits {
	    public static void main(String[] args){
	         int num,sum=0,input,lastdigit,count=0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter a number:");
	       
	        num=sc.nextInt();
	        input=num;
	        while(input!=0){
	            lastdigit=input%10;
	            sum=sum+lastdigit;
	            input/=10;
	        }
	             System.out.printf("Sum of digits of number is %d", sum);
	   sc.close();

	    
	    while(sum!=0){
	        sum=sum/10;
	        count++;
	    }
	     System.out.printf("\ncount:"+count);

	} 
	    }

