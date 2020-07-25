package 일이삼더하기4;
// 못풀음 
import java.util.Scanner;

public class Main {
	static int[] arr;
	static int[] dp;
	public static int cal(int x) {
		if(x==1) {
			return 1;
		}
		if(dp[x]>0) {
			return dp[x];
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		arr = new int[x];
		dp = new int[x+1];
		for(int i=0; i<x; i++) {
			arr[i] = sc.nextInt();
		}
	}
}
