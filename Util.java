import java.util.*;

/**
*Javaで使える考え方をまとめる。
/
/**
*HashMap(辞書型)配列を昇順ソートする方法
*/
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
        
        for(int i = 0;i < n;i++){
            String str = sc.next();
            int d = sc.nextInt();
            treeMap.put(d,str);
        }
        
        for(int key: treeMap.keySet()){
            System.out.println(treeMap.get(key));
        }
    }
}
/**
* 配列内の重複チェック
*/
    public void strDoubleCheck{
        String[] ans = {"HND","NRT","KIX","NGO","NGO"};
        
        Set set = new HashSet(); //重複確認方法
        for(String strCheck: ans){
            //setに追加してみて、追加できなかった場合　戻り値はboolean
            if(!set.add(strCheck)){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
