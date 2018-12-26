package javaprgms;

import bridgelabz.utility.utility;
public class LeapYear
{
	public  boolean  leapYear(int n)
	{
		if(n>1000)
		{
		   if(n % 4 == 0)
		   {
		      return  true;
		   }
	   
		}
		return false;
		

		
	}
	public static void main(String[]args)
	{
		
		System.out.println("enter leap year");
		int n=utility.getint();
		boolean result=leapyear(n);
		if(result)
		{
			System.out.println("Year:"+ n+ " is a leap year");
		}
		else
		{
			System.out.println("Year:"+ n+ " is not a leap year");
		}
	}
	private static boolean leapyear(int n) {
				return false;
	}
	
	}



	