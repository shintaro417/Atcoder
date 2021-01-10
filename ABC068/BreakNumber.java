package ABC068;

import java.util.Scanner;

public class BreakNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 1;
        int max = 0;

        for(int i = 2;i <= n;i+=2){
            int count = 0;
            int num = i;
            while(num % 2 == 0){
                num = num / 2;
                count++;
            }
            if(max < count){
                max = count;
                ans = i;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}