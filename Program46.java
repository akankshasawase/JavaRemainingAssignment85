import java.util.Scanner;
public class Program46
{
	public static void main(String args[])
	{
      double principle,rate,time,compoundinterest,compounded;
	  Scanner o= new Scanner(System.in);
	
   System.out.println("enter principle amount:");
    principle=o.nextDouble();
   System.out.println("enter rate of interest:");
    rate=o.nextDouble();
   System.out.println("enter the time:");
   time=o.nextDouble();
   compoundinterest=principle*(Math.pow((1+rate/100),time))-principle;
    compounded=principle*(Math.pow((1+rate/100),time));
    
	System.out.println("The interest after compound for amount"+principle+"for"+time+"years @"+rate+"% is:" +compoundinterest);
 System.out.println("The total amount after compounded  for amount"+principle+"for"+time+"years @"+rate+"% is:" +compounded);
   
	}
}