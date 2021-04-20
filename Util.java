import java.util.*;


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
