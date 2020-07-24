package 타일링2xn2;

// #11727 문제 
//
//	DP 문제 
//
//
import java.util.Scanner;

public class Main {
	static int[] arr = new int[1001];
	
	
	public static int dp(int x) {
		if(x==0 || x==1) {
			return 1;
		}
		if(arr[x]>0) {
			return arr[x];
		}
		arr[x] = dp(x-2)*2 + dp(x-1);
		arr[x] = arr[x]%10007;
		return arr[x];
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(dp(x));
	}
}
