package javaprgms;
import bridgelabz.utility.utility;
import java.util.Random;

public class flipcoin 
{
static int num;
static float heads;
static float tails;
public void main(String[]args)
{
	flipcoin r=new flipcoin();
	System.out.println("enter the number of flips");
	int num=utility.getint();
	for(int i=1;i<=num;i++)
	{
		double a=Math.random();
		System.out.println(a);
		if(a>0.5)
		{
			heads++;
			
			
		}
		else if(a<0.5)
		{
		tails++;
		}
		System.out.println(heads);
		System.out.println(tails);
		float headpercentage=(heads/num)*100;
		float tailpercentage=(tails/num)*100;
		System.out.println(heads);
		System.out.println(tails);
				}
}		
}		

