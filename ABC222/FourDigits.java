import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num =sc.nextInt();

		if(num >= 1000) {
			System.out.println(num);
		}else if(num >= 100) {
			System.out.println("0" + num);
		}else if(num >= 10){
			System.out.println("00" + num);
		}else {
			System.out.println("000" + num);
		}

		sc.close();
	}

}


