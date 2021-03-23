import java.util.*;

//xを文字列として受け取る
//xに小数点が入っているなら少数の手前まで出力する
//xに小数点がないならそのまま出力する。
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int result = str.indexOf(".");
        
        if(result >= 0){
            String ans = str.substring(0,result);
            System.out.println(ans);
        }else{
            System.out.println(str);
        }
    }
}
