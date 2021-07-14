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
		    String s = sc.next();
		    int n = s.length();
		    String s1 = s.substring(0,n/2);
		    String s2 = (n%2==0)?s.substring(n/2):s.substring((n/2)+1);
		    char c1[] = s1.toCharArray();
		    char c2[] = s2.toCharArray();
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		    String answer = (Arrays.equals(c1,c2))?"YES":"NO";
		    System.out.println(answer);
		}
	}
}
