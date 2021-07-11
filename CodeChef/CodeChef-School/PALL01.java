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
		    int answer = 0;
		    int n = sc.nextInt();
		    int temp = n;
		    while(n!=0){
		        int r = n%10;
		        answer = (answer*10)+r;
		        n/=10;
		    }
		    String s = (answer==temp)?"wins":"loses";
		    System.out.println(s);
		}
	}
}
