package 최소공배수;
// 1934번 문제 
import java.util.Scanner;

public class Main {
	public static int gcd_cal(int first, int second) {
		if(second==0) {
			return first;
		}else {
			return gcd_cal(second, first%second);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println((x*y)/gcd_cal(x,y));
		}
	}
}
