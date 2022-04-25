import java.util.Scanner;
public class Program43
{
	public static void main(String args[])
	{
       float km,met,cent;
	  Scanner o= new Scanner(System.in);
	 
     System.out.println("enter distance in centimeter:");
     cent= o.nextFloat();
     met=(cent/100);
     km=(cent/100000);
     System.out.println("The distance in meter is:"+met);
     System.out.println("The distance in kilometer is:"+km);
	}
}