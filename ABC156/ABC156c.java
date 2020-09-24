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
        
        //iは集会が開かれる座標(範囲は昇順ソートしたx[0]~x[x.length - 1]まで、つまりx1~xnの間)
        for(int i = x[0]; i <= x[x.length - 1];i++){
            //集会が開かれる座標iにおける消費体力の総和
            int num = 0;
            for(int j = 0;j < n;j++){
                //各住人が座標iにたどり着くために消費する体力を足しこむ
                num += Math.pow(x[j] - i,2);
            }
            //消費体力の総和を比べて小さいほうをansに代入
            ans = Math.min(ans,num);
            
            //以下同じ作業を繰り返して最小の値を求めていく
        }
        
        System.out.println(ans);
    }
}
