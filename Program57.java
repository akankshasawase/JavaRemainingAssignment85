import java.util.Scanner;
public class Program57
{
	public static void main(String args[])
	{
		int n;
    int factorial=1;
	Scanner o= new Scanner(System.in);
    System.out.println("enter positive no:");
    n=o.nextInt();
    if(n==0)
    {
  System.out.println("Error");
    }
    else
    {
        for(int i=1;i<=n;++i)
        {
            factorial=factorial*i;

        }
       System.out.println("factorial of" +n+ "="+factorial);
    }
	}
}