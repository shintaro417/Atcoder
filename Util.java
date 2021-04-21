import java.util.*;

/**
*Javaで使える処理方法をまとめる。
/
/**
*HashMap(辞書型)配列を昇順ソートする方法
*/
public class Main {
    public static void main(String[] args) {
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

/**
* 重複したキーに紐づけられた値を合計して、valueで降順ソートする処理
*
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //行数
        
        Map<String,Integer> map = new TreeMap<String,Integer>();
        
        for(int i = 0;i < n;i++){
            String key = sc.next();
            int value = sc.nextInt();
            //putメソッドの戻り値はvalueかnull
            Integer lastValue = map.put(key,value);
            
            if(lastValue != null){
                map.put(key,value + lastValue);
            }
            
        }
        
        Map<String,Integer> ans = sortMapByValue(map);
        
        for(String key : ans.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        
    }
    
    //降順ソート
    public static LinkedHashMap<String, Integer> sortMapByValue(Map<String, Integer> map) {
        //map.entrySet -> 対象となるMapオブジェクトのセットビューを返す。
        // セットビュー　-> 対象となるMapのkeyとvalueの組の一覧
        List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
        /**
        * Collections.sort(List<T> list,Comparator<? super T> c) -> 数値を降順/昇順にソートする。
        * @param list ソートされるリスト。
        * @param c リストの順序を決定するコンパレータ。null値は、要素の自然順序付けが使用されることを示す。
        */
        //二つの値を比較する。
        // compareTo() -> このオブジェクトが指定されたオブジェクトより小さい場合は負の整数、等しい場合はゼロ、大きい場合は正の整数
        Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
    
        //ソートしたものを入れなおす
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}


/**
* 重複したキーに紐づけられた値を合計して、valueで降順ソートする処理
*　-> 別解
*/

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Character, Integer> map = new HashMap<>();
    
    for (int i=0; i<n; i++) {
      char c = sc.next().charAt(0);
      int v = sc.nextInt();
      //containsKey -> キーが重複しているかチェックする。
      if (map.containsKey(c))
          //重複していたら、今存在する組に足しこむ
        map.put(c, map.get(c) + v);
      else
        map.put(c, v);
    }

    //HashMapに格納されている値を配列に入れる。
    List<Integer> ll = new ArrayList<>(map.values());
    //数値を降順ソートするには一旦昇順ソートにしてから降順ソートにする！！
    Collections.sort(ll); //昇順ソート
    Collections.reverse(ll); //降順ソート
    
    for (int v : ll)
      for (Character c : map.keySet())
        if (map.get(c) == v) //キーから取得したvalueと降順ソートした値が同じなら、出力
          System.out.println(c + " " + v);
  }
}
