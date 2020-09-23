import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = 0;
        int total = 1;
        
        while(total < b){
            total += a - 1;
            ans++;
        }
        
        System.out.println(ans);
    }
}
