package 홍익대학교;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int result =0;
		if(x>=1946 && x<=1000000) {
			result = x-1946;
		}
		System.out.println(result);
	}
	
}
