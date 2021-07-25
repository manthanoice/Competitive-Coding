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
		    int r1 = sc.nextInt();
		    int w1 = sc.nextInt();
		    int c1 = sc.nextInt();
		    int r2 = sc.nextInt();
		    int w2 = sc.nextInt();
		    int c2 = sc.nextInt();
		    int x = 0;
		    int y = 0;
		    if(r1>r2)
		        x++;
		    else
		        y++;
		    if(w1>w2)
		        x++;
		    else
		        y++;
		    if(c1>c2)
		        x++;
		    else
		        y++;
		    String s = (x>y)?"A":"B";
		    System.out.println(s);
		}
	}
}
