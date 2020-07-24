package 피보나치함수;

import java.util.Scanner;
// 시간이 2초 넘어감. 다른 사람들 보니까 DP로 풀었다.. 따라해 보기로 한다.
public class Main {
	static int zero;
	static int one;
	public static int fib(int x) {
		
		if(x==0) {
			zero++;
			return 0;
		}else if(x==1) {
			one++;
			return 1;
		}else {
			return fib(x-1)+fib(x-2);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int x = sc.nextInt();
			Main main = new Main();
			main.fib(x);
			System.out.println(zero+" "+one);
			zero=0;
			one=0;
		}
	}
}
