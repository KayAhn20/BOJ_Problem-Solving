package 지능형기차;
// 2455번 문제 시물레이션  10분만에 풀음   

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int temp = 0;
		for(int i=0; i<8; i++) {
			arr[i] = sc.nextInt();
		}
		int max=1;
		for(int i=1; i<=6; i++) {
			if(i%2!=0) {
				temp = arr[i]-arr[i+1];
				arr[i+1] = temp;
				if(temp>max) {
					max = temp;
				}
			}else {
				temp = arr[i]+arr[i+1];
				arr[i+1] = temp;
				if(temp>max) {
					max=temp;
				}
			}
		}
		System.out.println(max);
		
	}
}
