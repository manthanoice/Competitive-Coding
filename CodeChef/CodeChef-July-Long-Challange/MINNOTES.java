/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static long gcd(long a, long b)
    {
        if(a==0)
            return b;
        return gcd(b%a, a);
    }
    static long gcdcFinal(List<Integer> arr)
    {
        long result = 0;
        for (long nums: arr){
            result = gcd(result, nums);
            if(result==1)
            {
               return 1;
            }
        }
        return result;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            long sum=0;
            for(int i=0;i<n;i++)
            {
                int value=sc.nextInt();
                a[i]=value;
                sum+=value;
            }
            long ans=Long.MAX_VALUE;
            if(n==1)
              ans=1;
            else{
                long g[]=new long[n];
                long f[]=new long[n];
                long b[]=new long[n];
                long temp=a[0];
                f[0]=temp;
                for (int i=1; i<n; i++){
                    temp=gcd(temp,a[i]);
                    f[i]=temp;
                }
                temp=a[n-1];
                b[n-1]=temp;
                for (int i=n-1; i>=0; i--){
                    temp=gcd(temp,a[i]);
                    b[i]=temp;
                }
                g[0]=b[1];g[n-1]=f[n-2];
                for (int i=1; i<n-1; i++){
                    g[i]=gcd(f[i-1],b[i+1]);
                }
                for (int i=0; i<n; i++){
                    ans=Math.min(ans,((sum-a[i])/g[i])+1);
                }
            }
        System.out.println(ans);
        }
    }
}
