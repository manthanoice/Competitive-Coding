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
// 		int answer = 0; did stupid mistake of defining answer outside while, don't do this baka! :D
		while(t-->0){
		    int n = sc.nextInt();
		    int answer = 0;
		    int remainder = 0;
		    while(n!=0){
		        remainder = n%10;
		        answer = answer*10+remainder;
		        n/=10;
		    }
		    System.out.println(answer);
		}
	}
}
