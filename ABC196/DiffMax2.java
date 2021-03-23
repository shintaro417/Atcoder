import java.util.*;

//x - yを最大化したいので、xをできるだけ大きく、yをできるだけ小さくする。
//x,yはそれぞれ独立して選べるので、x=b,y=cの時に最大値を取れる
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        System.out.println(b - c);
    }
}
