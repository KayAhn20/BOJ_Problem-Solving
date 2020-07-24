package 숫자의합;
// 백준 문제  11720 아스키 코드 사용해 풀어야 됬었던... String -> char -> int 순으로... 하,,.,
import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        int sum=0;
        String line = scan.next();
        
        for(int i=0; i<num; i++) {            
            sum += line.charAt(i)-'0';
        }
        
        System.out.println(sum);
    }
}