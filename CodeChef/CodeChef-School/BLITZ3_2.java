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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int time = 180;
		while(t-->0){
		    StringTokenizer str = new StringTokenizer(br.readLine());
		    int n= Integer.parseInt(str.nextToken());
		    int a= Integer.parseInt(str.nextToken());
		    int b= Integer.parseInt(str.nextToken());
		    System.out.println(2*(time+n)-a-b);
        }
	}
}


//Don't use scanner class lol
