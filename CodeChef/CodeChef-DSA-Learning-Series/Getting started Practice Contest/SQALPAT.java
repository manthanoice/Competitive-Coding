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
        int n = sc.nextInt();
        int count=0;
        for(int i=1; i<=n; i++){
        	if(i%2!=0){
        		for(int j=1; j<=5; j++){
        			count++;
        			System.out.print(count+" ");
        		}
        	}
        	else{
        		int temp = count+1;
        		for(int j=count+5; j>=temp; j--){
        			count++;
        			System.out.print(j+" ");
        		}
        	}
        	System.out.println();
        }
	}
}
