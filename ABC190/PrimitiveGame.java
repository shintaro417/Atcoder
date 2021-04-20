import java.util.Scanner;

public class Main{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  if(c==0){
    if(a>=b+1){
    System.out.println("Takahashi");
    }else{
    System.out.println("Aoki");
    }
  }else{
    if(b>=a+1){
        System.out.println("Aoki");
    }else{
        System.out.println("Takahashi");
    }
  }

}
}
