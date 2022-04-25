public class Program37
{
	public static void main(String args[])
	{
      int nm1=1;
	  while(true)
	  {
		  ++nm1;
		  if((nm1%3)==0)
		  {
			  continue;
		  }
		  if((nm1==50))
		  {
			  break;
		  }
		  if((nm1%2)==0)
		  {
			  nm1+=3;
		  }
		  else
		  {
			  nm1-=3;
		  }
		  System.out.print(+nm1+" ");
	  }
	}
}