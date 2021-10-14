import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//人数
		int num =sc.nextInt();

		//基準点
		int point = sc.nextInt();

		//生徒の得点
		int[] a = new int[num];

		for(int i = 0;i < num;i++) {
			a[i] = sc.nextInt();
		}

		//不可となった学生の数
		int ans = 0;

		for(int p : a) {
			if(p < point) {
				ans++;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}


