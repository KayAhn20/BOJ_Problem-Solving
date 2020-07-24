package 나는행복합니다;
//
//
// 14652번 문제
//	조금 많이 생각해보기, 이런 문제는 대부분 / 나 % 를 이용해서 푸는 문제들이 많다.
// 처음에 배열로 풀었는데 메모리 초과남. 
// 
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(k/m + " " +k%m);
	}
}
