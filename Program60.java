import java.util.Scanner;
public class Program60
{
	public static void main(String args[])
	{
      Scanner o=new Scanner(System.in);
	  int startyear,endyear,i;
     System.out.println("enter start year:");
     startyear=o.nextInt();
     System.out.println("enter end year:");
     endyear=o.nextInt();
    for(i=startyear;i<=endyear;i++)
    {
        if((0==i%4)&&(0!=i%100)||(0==i%400))
           {
               System.out.println("\n Leap year is"+i);
           }

    }
	}
}