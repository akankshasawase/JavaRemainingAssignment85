
//import java.util.stream.Stream;
import java.util.Scanner;
public class Program53
{
	public static void main(String args[])
	{
       int x,y,length;
	   int sum;
		 Scanner o = new Scanner(System.in);
		 
    System.out.println("enter two integers:");
    x=o.nextInt();
    y=o.nextInt();
	sum=x+y;
	String s=String.valueOf(sum);
	
     length=s.length();
	 System.out.println("Addition of two integers are:"+sum);
		  
	 
          System.out.println("No of digit of sum value is:"+length);
		  
	}
}

    