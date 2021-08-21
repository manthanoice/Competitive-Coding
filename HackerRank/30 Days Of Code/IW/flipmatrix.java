import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[][] = new int[2*n][2*n];
            int x = arr.length;
            int sum = 0;
            for(int i=0; i<x; i++){
                for(int j=0; j<arr[0].length; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    int n1 = arr[i][(2*n)-j-1];
                    int n2 = arr[i][j];
                    int n3 = arr[(2*n)-i-1][j];
                    int n4 = arr[(2*n)-i-1][(2*n)-j-1];
                    sum+=Math.max(n1, Math.max(n2, Math.max(n3,n4)));
                }
            }
            System.out.println(sum);
        }
    }
}
