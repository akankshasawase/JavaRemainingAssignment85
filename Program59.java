
import java.util.Scanner;
public class Program59
{
	public static void main(String args[])
	{
   Scanner o = new Scanner(System.in);
    double s1,s2,s3;
    char result;
    String s="not";
    do
    {
        System.out.println("enter three sides:");
       s1=o.nextDouble();
	   s2=o.nextDouble();
	   s3=o.nextDouble();
	   
        if(s3*s3==((s1*s1)+(s2*s2)))
        {
            s="";

        }
     System.out.println("entered triangle is "+s+"rightangled: Do u want to check another(y/n):");
        result=o.next().charAt(0);

    }while(result!='n'&&result!='n');
    s1=o.nextDouble();
	
	}
}