package javaprgms;

import bridgelabz.utility.utility;

public class Power 
{
	public static void main(String[] args) 
	{
		

		System.out.println("Enter a number:");
		int num=utility.getint();
        if((num>=0)&&(num<=31))
        {
         for(int i=1;i<=num;i++)
        System.out.println("Power of 2^"+num+" is: "+(Math.pow(2, i)));
        System.out.println();
        }
        else
        {
        System.out.println("number is invalid");
        }
        
	}
}



