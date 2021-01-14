import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        
        int ans = 0;
        int count = 0;
        
        for(int i = 0;i < val.length();i++){
            char temp = val.charAt(i);
            if(temp == 'A' || temp == 'C' || temp == 'G' || temp == 'T'){
               count++;
            }else{
                count = 0;
            }
            
            if(ans < count){
                ans = count;
            }
        }
        System.out.println(ans);
    }
}
