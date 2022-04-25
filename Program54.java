import java.util.Scanner;
public class Program54
{
	public static void main(String args[])
	{
     int a,b,c;
	  Scanner o = new Scanner(System.in);
	System.out.println("enter 3 sides of right triangle:");
	 
    a=o.nextInt();
    b=o.nextInt();
	c=o.nextInt();
     
   if(((a+b)>c)&&((b+c)>a)&&((a+c)>b))
   {
  System.out.println("yes");
   }
   else
  {
  System.out.println("No");
  }
	}
}