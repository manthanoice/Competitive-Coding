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
    //Gotta fix the code, some error
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int even = 0;
		    int odd = 0;
		    int answer = 0;
		    for(int i=2; i*i<=n; i++){
		        while(n%i==0){
		            n/=i;
		            if(i%2==0)
		                even++;
		            else
		                odd++;
		        }
		    }
		    if(n>1){
		        if(n%2==0)
		            even++;
		        else
		            odd++;
		    }
		    if(a>=0 && b>=0){
		        System.out.println((a*odd)+(b*even));
		        continue;
		    }
		    else if(a>=0 && b<0){
		        if(odd==0)
		            answer=0;
		        else if(even==0)
		            answer=b;
		    }
		    else if(a<0 && b>=0){
		        answer=b*even;
		        if(odd==0)
		            answer+=a;
		    }
		    else if(a<0 && b<0){
		        if(odd==0)
		            answer+=a;
		        else if(even==0)
		            answer+=b;
		    }
		    System.out.println(answer);
		}
	}
}
