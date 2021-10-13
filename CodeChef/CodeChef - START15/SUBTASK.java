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
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++)
		        arr[i] = sc.nextInt();
		    int sum = 0;
		    int sum2 = 0;
		    for(int i=0; i<n; i++)
		        sum+=arr[i];
		    if(sum==n)
		        System.out.println(100);
		    else{
		        for(int i=0; i<m; i++)
		            sum2+=arr[i];
		        if(sum2==m)
		            System.out.println(k);
		        else
		            System.out.println(0);
		    }
		}
	}
}
