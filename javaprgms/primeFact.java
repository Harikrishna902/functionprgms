package javaprgms;

import bridgelabz.utility.utility;

public class primeFact 
{
	public static void main (String[] args)
	{
		System.out.println("enter the number");
		int num=utility.getint();
		for( int i=2;i<num;i++)
		{		
	while(num%i==0)
	{
		System.out.println(i+"");
		num=num/2;
		
	}
}
		if(num>2)
		{
			System.out.println(num);
		}
	}
		}

