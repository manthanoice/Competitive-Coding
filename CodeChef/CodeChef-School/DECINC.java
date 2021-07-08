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
		n=(n%4==0)?++n:--n;  //var = condition ? (true)if : (false)else it makes sense, doesn't it!
		System.out.println(n);
	}
}
