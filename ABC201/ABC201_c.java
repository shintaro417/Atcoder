package aoj.itp1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();

		int used = 0; //"o"の個数
		int unused = 0; //xの個数
		int unknown = 0; //?の個数

		for(int i = 0;i < string.length();i++) {
			if(string.charAt(i) == 'o') {
				used++;
			}else if(string.charAt(i) == 'x') {
				unused++;
			}else {
				unknown++;
			}
		}

			//usedが5以上　あるいは　used+unknownが0個の場合は0で終了
			if(used > 4) {
				System.out.println(0);
				return;
			}else if(used + unknown < 1) {
				System.out.println(0);
				return;
			}

			/**
			 * ?の扱い
			 * ?のうち何個をoにして使うのか全探索する
			 * add個をoにすると oになっている個数はadd + usedとなる()
			 * どの数を?からoしたかという部分で組み合わせ計算が発生するので、入れ替えによる組み合わせ計算xC(unknown,add)として計算する
			 */

			/**
			 * 二項係数c(a,b) -> aCb
			 * ライブラリを作ろう
			 */

			/**
			 * oになっている個数で場合分け
			 * oが1個 -> 1111みたいなやつが一通り
			 * oが2個 -> 1112みたいなやつが2 * 4通り(どちらを1にするかで2通り、置き方が4通り)　1122みたいな奴がC(4,2)通り
			 * oが3個 -> 1123みたいなやつが3 * 4 * 3通り(ダブって使う数字をどれにするかで3通り、置き方でC(4,1) * C(3,1)通り)
			 * oが4個 -> 1234みたいなやつが4!通り
			 */

			int ans = 0;

			for(int add = 0;add < unknown + 1;add++) {
				if(add + used == 0)continue;
				if(4 < add + used)continue;
				int cnt = add + used;

				if(cnt == 1) ans += 1 * comb(unknown, add);
				else if(cnt == 2)ans += (2 * 4 + comb(4,2)) * comb(unknown, add);
				else if(cnt == 3)ans += 3 * 4 * 3 * comb(unknown, add);
				else if (cnt == 4) ans += 4 * 3 * 2 * comb(unknown, add);
			}

			System.out.println(ans);


		sc.close();
	}


	/**
	 * 二項係数のメソッド
	 * @param n //全体の数
	 * @param k //nから選ぶ個数
	 * @return 計算結果
	 *
	 * メソッドの流れを理解しておくこと
	 */
	static long comb(int n, int k) {
        if(n < k) {
            int t = n;
            n = k;
            k = t;
        }
        if(k == 0) {
            return 1;
        }else if(n == k) {
            return 1;
        }else {
            return comb(n - 1, k - 1) * n / k;
        }
    }

}
