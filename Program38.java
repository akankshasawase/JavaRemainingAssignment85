import java.util.Scanner;
public class Program38
{
	public static void main(String args[])
	{
      int num,i;
	  Scanner o= new Scanner(System.in);
    System.out.println("enter a number:");
    num=o.nextInt();
    for(i=1;i<=10;i++)
    {
     int x= num*i;
    System.out.println(+num+ "*" +i+ "="+x);

    }
	}
}