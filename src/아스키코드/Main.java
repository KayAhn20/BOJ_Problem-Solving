package 아스키코드;
// 백준 문제 11654;; 
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ascii = sc.next();
		int result = ascii.charAt(0);
		System.out.println(result);
	}
}
