package javaprgms;

import bridgelabz.utility.utility;

public class Windchill
{
	public static void main(String[] args) 
	{
	System.out.println("enter the values of v and t");
	double t=utility.getdouble();
	double v=utility.getdouble();
    double w=utility.windchil(t,v);
    System.out.println("temparature ="+t);
    System.out.println("wind speed ="+v);
    System.out.println("wind chill ="+w); 
	}
}























