package javaprgms;
import bridgelabz.utility.utility;
public class SumOfThree 
{
	
		public static void main(String[] args)
		{
		System.out.println("enter the size of an array");
		int a=utility.getint();
		int[] arr=new int[a];
		System.out.println("enter the array elements");
		for(int m=0;m<arr.length;m++)
		{
			arr[m]=utility.getint();
		}
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				for(int k=j+1;k<arr.length;k++) 
				{
					if((arr[i]+arr[j]+arr[k])==0)
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
					else
					{
						System.out.println("invalid numbers entered");
					}
				}
			}
		}
		}
		}

