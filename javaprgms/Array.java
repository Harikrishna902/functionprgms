package javaprgms;

import bridgelabz.utility.utility;

public class Array
{
public static void main(String[] args)
{
System.out.println("enter the rows");
int a=utility.getint();
System.out.println("enter the colums");
int b=utility.getint();
int  arr[][]=new int[a][b];
System.out.println("enter the elements");

for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr.length-1;j++)
	{	
	arr[i][j]=utility.getint();
	}
}
	for(int k=0;k<=arr.length-1;k++)
	{
	 for (int l=0;l<=arr.length-1;l++)
	 {
		 System.out.print(arr[k][l]+" ");
		 
	 }
		 System.out.println();
	} 
		
}

}



