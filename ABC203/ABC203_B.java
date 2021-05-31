import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//フロア数
		int n = sc.nextInt();
		//室数
		int k = sc.nextInt();

		int ans = 0;
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= k;j++) {
				int room = i * 100 + j;
				ans += room;
			}
		}

		System.out.println(ans);


		sc.close();
	}
}
