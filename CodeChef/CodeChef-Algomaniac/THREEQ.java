/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int count1 = 0;
		    int count2 = 0;
		    int arr[] = new int[6];
		    for(int i=0; i<6; i++)
		        arr[i]=sc.nextInt();
		    for(int i=0; i<3; i++){
		        if(arr[i]==1)
		            count1++;
		    }
		    for(int i=3; i<6; i++){
		        if(arr[i]==1)
		            count2++;
		    }
		    if(count1==count2)
		        System.out.println("Pass");
		    else
		        System.out.println("Fail");
		}
	}
}
