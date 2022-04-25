import java.util.Scanner;
public class Program50
{
	public static void main(String args[])
	{
       int b1,b2;
	   int i=0,r=0;
       int sum[]=new int[20];
	Scanner o = new Scanner(System.in);
System.out.println("enter 1st binary number:");
    b1=o.nextInt();
  System.out.println("enter 2nd binary number:");
    b2=o.nextInt();
    while(b1!=0||b2!=0)
    {
        sum[i++]=(int)((b1%10+b2%10+r)%2);
        r=(int)((b1%10+b2%10+r)/2);
        b1=b1/10;
        b2=b2/10;
    }
    if(r!=0)
    {
        sum[i++]=r;

    }
    i--;
  System.out.print("The sum of two binary number is:");
    while(i>=0)
    {
        System.out.print(sum[i--]);

    }
	}
}