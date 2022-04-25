import java.util.Scanner;
public class Program49
{
	public static void main(String args[])
	{
     double d,la1,la2,lo2,lo1,er,r;
		 Scanner o = new Scanner(System.in);

    System.out.println("enter latitude of coordinate 1:");
    la1=o.nextDouble();
    System.out.println("enter latitude of coordinate 2:");
     la2=o.nextDouble();
   System.out.println("enter longitude of coordinate 1:");
     lo1=o.nextDouble();
   System.out.println("enter longitude of coordinate 2:");
     lo2=o.nextDouble();
     r=3.14159/180;
     la1=la1*r;
     la2=la2*r;
     lo1=lo1*r;
     lo2=lo2*r;
     er=6371.01;
     d=er*Math.acos((Math.sin(la1)*Math.sin(la2))+(Math.cos(la1)*Math.cos(la2)*Math.cos(lo1-lo2)));
    System.out.println("The distance between those point is:"+d);
	}
}