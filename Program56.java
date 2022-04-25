import java.util.Scanner;
public class Program56
{
	public static void main(String args[])
	{
		int total=0,n;
		Scanner o= new Scanner(System.in);
		System.out.println("Enter a nummber up to which user want to add:");
		n=o.nextInt();
    for(int x=1;x<=n;x++)
    {
        total=total+x;
    }
 
    System.out.println("\n Add 1to value of n:" +total);
	}
}