package 사탕선생고창영;
/*
 * 
 *  2547번 문제 2주 걸려서 풀었다 
 *  해법은 수를 받자마자 나눠주는것 
 * 
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int big_x = sc.nextInt();
		
		
		while(big_x-->0) {
			long num =0;
			int x = sc.nextInt();
			int temp = x;
			while(x-->0) {
				num += sc.nextLong();
				num = num%temp;
			}
			if(num==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
