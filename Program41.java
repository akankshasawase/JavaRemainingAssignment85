import java.util.Scanner;
public class Program41
{
	public static void main(String args[])
	{
		 String FName,LName;
		 Scanner o = new Scanner(System.in);
    System.out.println("enter a first name:");
    FName=o.nextLine();
    System.out.println("enter a last name:");
    LName=o.nextLine();
  System.out.println(LName+ " " +FName);
	}
}