package NN;
//2016 고려대학교 신입생 프로그래밍 경시대회 C번  #11944번 문제 
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = N;
		int M = sc.nextInt();
		while(temp-->0) {
			sb.append(N);
		}
		if(sb.length()>=M) {
			System.out.println(sb.substring(0, M));
		}else {
			System.out.println(sb);
		}
		
	}
}
