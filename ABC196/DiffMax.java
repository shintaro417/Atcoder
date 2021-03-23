import java.util.*;

//全組み合わせを考えると200*200通りくらい→大体4*10**4くらいで全探索できる
//すべての組み合わせを確認して最大値を出す
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int max = -1000;
        
        for(int i = a;i <= b;i++){
            for(int j = c;j <= d;j++){
                max = Math.max(max,i - j);
            }
        }
        
        System.out.println(max);
        
        sc.close();
    }
}
