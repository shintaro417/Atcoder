import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        
        //a,bが定まればcが一意に決まる。(cを探索する必要はなし)　　aを固定した時bの値は(n - 1) / a個になるためaをfor文で回して、各aに対して取りうるbの値を足していく。
        for(long a = 1; a <= n;a++){
            ans += (n - 1) / a;
        }
        
        System.out.println(ans);
    }
}
