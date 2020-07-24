package 알파벳찾기;


// 백준 문제  10809 
import java.util.Scanner;
public class Main {
       public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             String input = sc.next();
             
             for (char c = 'a' ; c <= 'z' ; c++)
                    System.out.print(input.indexOf(c) + " ");
       }
}