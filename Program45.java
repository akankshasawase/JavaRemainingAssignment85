import java.util.Scanner;
public class Program45
{
	public static void main(String args[])
	{
        int principle,rate,time,interest;
	  Scanner o= new Scanner(System.in);
	
   System.out.println("enter principle amount:");
    principle=o.nextInt();
  System.out.println("enter rate of interest:");
    rate=o.nextInt();
   System.out.println("enter the time:");
   time=o.nextInt();
    interest=(principle*rate*time)/100;
    System.out.println("The simple interest for amount"+principle+"for"+time+"years @"+rate+"% is:"+interest);
	}
}