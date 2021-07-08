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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int arr[] =  new int[a];
		    for(int i=0; i<a; i++){
		        arr[i]=sc.nextInt();
		        int x = arr[i];
		    }
		    int sum[] =  new int[33];
		    for(int i=0; i<a; i++){
		        int x = arr[i];
		        int j = 32;
		        while(x!=0){
		            sum[j]+=x%2;
		            j--;
		            x/=2;
		        }
		    }
		    int ans = 0;
		    for(int i=0; i<33; i++){
		        if(sum[i]%b==0)
		            ans+=sum[i]/b;
		        else{
		            ans+=sum[i]/b;
		            ans+=1;
		        }
		    }
		    System.out.println(ans);
		}
	}
}
