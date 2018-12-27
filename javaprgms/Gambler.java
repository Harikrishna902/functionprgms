package javaprgms;

import bridgelabz.utility.utility;

public class Gambler 
{
public static void main(String[] args)
{

	System.out.println("enter the $stake value");
	 int stake=utility.getint();
	 System.out.println("enter the goal value");
	 int goal=utility.getint();
	 System.out.println("enter the no of trails");
	     int trails=utility.getint();
	     int bets=0;
	     int wins=0;
	    
	     for(int i=0;i<trails;i++)
	     {
	    	int cash=stake;
	    	while(cash>0 && cash<goal)
	    	{
	    		bets++;
	    	if(Math.random()<0.5)
	    		cash++;
	    	
	    	else
	    	
	    		cash--;
	    	}
	    	if(cash==goal)
	    	
	    		wins++;
	    	}
	    	System.out.println();
	    	System.out.println(wins+"wins of"+trails);
	    	System.out.println("Percent of games won = " + 100.0 * wins / trails);
	    	System.out.println("Avg bets ="+1.0* bets/trails);
	    	
	    	}
	     }
	     



