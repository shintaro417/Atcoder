import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int ans = 1000000;
        
        for(int i = 0;i < n;i++){
            x[i] = sc.nextInt();
        }
        
        Arrays.sort(x);
        
        for(int i = x[0]; i <= x[x.length - 1];i++){
            int num = 0;
            for(int j = 0;j < n;j++){
                num += Math.pow(x[j] - i,2);
            }
            ans = Math.min(ans,num);
        }
        
        System.out.println(ans);
    }
}
