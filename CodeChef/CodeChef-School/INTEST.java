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
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
        int k = sc.nextInt();
        int answer = 0;
	
		while(t-->0){
		    int x = sc.nextInt();
            
		    if(x%k==0){
		        answer++;
		    }
		}
		System.out.println(answer);
	}
}
