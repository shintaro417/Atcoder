import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // マスの番号
        int n = sc.nextInt();
        //料金所マスの合計
        int m = sc.nextInt();
        
        //最初のマス
        int start = sc.nextInt();
        
        //料金所マスの判定 0:料金マスじゃない 1:料金マス
        int[] a = new int[n + 1];
        Arrays.fill(a,0);
        
        for(int i = 0;i < m;i++){
            int num = sc.nextInt();
            a[num] = 1;
        }
        
        int count1 = 0;
        
        for(int i = start; i < n;i++){
            if(a[i + 1] == 1){
                count1++;
            }
        }
        
        int count2 = 0;
        
        for(int i = start; i > 0;i--){
            if(a[i - 1] == 1){
                count2++;
            }
        }
        
        int ans = Math.min(count1,count2);
        
        System.out.println(ans);
        
        sc.close();
    }
}
