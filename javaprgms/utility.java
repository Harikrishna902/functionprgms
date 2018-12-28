package bridgelabz.utility;

import java.util.Scanner;

public class utility 
{
static Scanner sc=new Scanner(System.in);
public static int getint()
{
	return sc.nextInt();
	
}
public static double getdouble()
{
	return sc.nextInt();
	
}
public String getstring1()
{
	return sc.next();
	
}
public String getstringwords()
{
	return sc.nextLine();
	
}
public static float getfloat()
{
	return sc.nextLong();
	
}
public static byte getBytes() {
	return sc.nextByte();

}
public static void roots(double a,double b,double c)
{
	double delt=((b*b)-(4*a*c));
	double root1=((-b+(Math.sqrt(delt))/4*a));
	double root2=((-b-(Math.sqrt(delt))/4*a));
	System.out.println("root1 equation" + root1);
	System.out.println("root2 equation" + root2 );
	
}
public static double windchil(double t, double v)
{
	double w=35.74+0.6215+(0.4275*t-35.75)*Math.pow(v,0.16);
	return w;

}



}


