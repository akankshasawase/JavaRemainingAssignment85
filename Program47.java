import java.util.Scanner;
public class Program47
{
	public static void main(String args[])
	{
	    double area,s;
		 Scanner o = new Scanner(System.in);
		
    System.out.println("enter a side of hexagon:\n");
    s=o.nextDouble();
    area=(3*Math.sqrt(3)*Math.pow(s,2))/2.0;
     System.out.println("The area of hexagon is:"+area);
	}
}