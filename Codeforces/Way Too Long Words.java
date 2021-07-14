import java.util.*;
 
public class WTLW{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->-1){
            String s = sc.nextLine();
            if(s.length()>10)
                System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(s.length()-1));
            else
                System.out.println(s);
        }
    }
}
