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
            float a = sc.nextInt();
            if(a<1500)
                System.out.println(a*2);
            else{
                float answer = ((a*98)/100);
                float x = a-answer;
                float final_answer = (2*answer)+x+500;
                System.out.println(final_answer);
            }
        }
	}
}
