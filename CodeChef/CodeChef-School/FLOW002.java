import java.util.Scanner;

class FLOW002{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans=0;
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            ans=a%b;
            System.out.println(ans);
        }   
    }
}
