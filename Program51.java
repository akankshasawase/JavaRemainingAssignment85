import java.util.Scanner;
public class Program51
{
	public static void main(String args[])
	{
      int n,firstdigit,lastdigit,digits,swappedNo;
		 Scanner o = new Scanner(System.in);
		 
    System.out.println("Enter a number:");
     n=o.nextInt();
     lastdigit=n%10;
     digits=(int)Math.log10(n);
     firstdigit=(int) (n/Math.pow(10,digits));
     swappedNo=lastdigit;
     swappedNo *=(int)Math.round(Math.pow(10,digits));
     swappedNo+=n%(int)Math.round(Math.pow(10,digits));
     swappedNo-=lastdigit;
     swappedNo+=firstdigit;
    System.out.println("Number after swapping first and last digit:"+swappedNo);
	}
}