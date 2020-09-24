import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        //ソースコードの個数
        int n = sc.nextInt();
        //i個目のソースコードの個数
        int m = sc.nextInt();
        //整数
        int c = sc.nextInt();
        
        //整数列B
        int[] b = new int[m];
        
        for(int i = 0;i < m;i++){
            b[i] = sc.nextInt();
        }
        
        //カウンタ
        int count = 0;
        
        //対象数列
        int[] a = new int[m];
        
        for(int i = 0;i < n;i++){
            int sum = 0;
            for(int j = 0;j < m;j++){
                a[j] = sc.nextInt();
                sum += a[j] * b[j];
            }
            
            if(sum + c > 0){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
