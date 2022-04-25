import java.util.Scanner;
public class Program44
{
	public static void main(String args[])
	{
       double s,area;
	  Scanner o= new Scanner(System.in);
	
 System.out.println("enter the value of side of equilateral triangle:");
  s=o.nextDouble();
  area=(Math.sqrt(3))/4*(s*s);
System.out.println("Area of equilateral triangle is:"+area);
	}
}