package 일이삼더하기;
// 1,2,3 더하기 # 9095번 

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0) {
			int x = sc.nextInt();
			int[] arr = new int[11];
			// x = 1,  1;
			// x = 2,  1+1,2;
			// x = 3,  1+1+1, 1+2, 2+1, 3; 
			
			arr[1]=1; // 1을 넣을 경우 경우의 수 1가지(1)
			arr[2]=2; // 2를 넣을 경우 경우의 수 2가지(1+1, 2)
			arr[3]=4; // 3을 넣을 경우 경우의 수 3가지 (1+1+1, 1+2, 2+1, 3)
			for(int i=4; i<=x; i++) { 
				arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
			}
			System.out.println(arr[x]);
		}		
	}

}
