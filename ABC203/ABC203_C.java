import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long k = sc.nextLong();

		long a = k;

		//treemapはキーを自動ソートしてくれる
		Map<Long, Long> map = new TreeMap<Long, Long>();

		for(int i = 0;i < n;i++) {
			long c = sc.nextLong(); //村の番号 キー
			long d = sc.nextLong(); //もらえるお金　バリュー
			long val = 0; //合計金額
			if(map.containsKey(c)) { //キーに値がすでに存在していた場合
				val = map.get(c);
				val += d;//金額をたしこむ
			}else {
				val = d;
			}

			map.put(c, val);
		}

		for(long b : map.keySet()) {
			if(a >= b) {//所持金が村の位置以上の時
				a = a + map.get(b); //所持金を追加
			}
		}

		System.out.println(a);

		sc.close();
	}
}

