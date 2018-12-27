package javaprgms;



public class PrimeNum
{
   public static void main (String[] args)
   {	
	   System.out.println("Prime numbers from 1 to 1000 are :");
      for (int i = 1; i <= 1000; i++)         
       { 		  	  
          int count=0; 	  
          for(int j=2;j<i-1;j++)
	  {
             if(i%j==0)
	     {
 		count = count + 1;
	     }
	  }
	  if (count ==0)
	  {
	     
	    System.out.println(i+"");
	  }	
       }	
       
      
   }
}