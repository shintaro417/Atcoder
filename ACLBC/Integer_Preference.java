import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
        // Your code here!
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        if(b >= c && d >= a){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
