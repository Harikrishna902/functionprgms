package javaprgms;
import bridgelabz.utility.utility;

public class Harmonic 
{
public static double value;
public static void main(String []args)
{
System.out.println("enter the number");
int a=utility.getint();
double val=0.0;
for(int i=1;i<=a;i++)
{
	val=val+(1.0/i);
}



	if(a>0)
 	{
		System.out.println("The Harmonic Value for the number is: "+a);
 	}
	else
	{
		System.out.println("The number should be greater than zero");
	}
}
}

	
	