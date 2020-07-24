package 카드구매하기2;
//다시 풀어봐야댐..... 
// 풀어서 통과 

//
//	DP문제 
//
//

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 총 구하려는 카드의 수
		int[] a = new int[n + 1]; // 카드의수+1만큼 배열 설정
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();		//a[]  = 1 5 6 7
		}
		int[] d = new int[n + 1];		// d[] = 0 0 0 0 0
		for(int i= 1; i<=n;i++) {		// 최솟값을 구해야 함으로 전부 10000으로 채워준뒤 시작      
			d[i] = 10000;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (d[i] > d[i - j] + a[j]) {		
					d[i] = d[i - j] + a[j];
				}
			}
		}

		System.out.println(d[n]);

	}
}
