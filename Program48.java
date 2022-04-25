import java.util.Scanner;
public class Program48
{
	public static void main(String args[])
	{
       double area,s,n;
		 Scanner o = new Scanner(System.in);
		
        System.out.println("enter a side of Polygoan:\n");
        n=o.nextDouble();
		 System.out.println("enter a length of polygon:\n");
         s=o.nextDouble();
        area=(n*(s*s))/(4.0*Math.tan((Math.PI/n)));
         System.out.println("The area of Polygoan is:"+area);
	}
}