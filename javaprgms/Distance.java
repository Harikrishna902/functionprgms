package javaprgms;
import bridgelabz.utility.utility;

public class Distance 
{
public double val (int x,int y) 
{
	

  double a=Math.sqrt((x*x)+(y*y));
  return a;
}
  public static void main(String []args)
  {
	  System.out.println("enter the number");
	  int a=utility.getint();
	  System.out.println("enter the the number");
	  int b=utility.getint();
	 Distance d=new Distance();
	 double l=d.val(a,b);
	  System.out.println("value of distance " +l);
	  
	  
	  
  }
}
