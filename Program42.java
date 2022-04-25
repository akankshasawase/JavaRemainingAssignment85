import java.util.Scanner;
public class Program42
{
	public static void main(String args[])
	{
		char c;
		 
		 Scanner o = new Scanner(System.in);
		 System.out.println("enter a character:");
         String str=o.next();
		 c=str.charAt(0);
         System.out.println("ASCII value of given character is:"+c+" "+(int)c);
    }
}