package 줄세우기;
// 위상정렬 문제   ( 순서가 정해져있는 작업을 차례로 수행해야 할때 그 순서를 결정해 주기위해 사용하는 알고리즘 
import java.util.Scanner;

public class Main {
	static int temp =0;
	public static void set(int[] num, int[] index, int move) {
		temp = num[move];
		
	}
	public static void push(int[] index, int move) {
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		int[] num = new int[x];
		int[] index = new int[x];
		num[0] = 0;
		for(int i =1; i<x; i++) {
			num[i] = sc.nextInt();
		}
		for(int i =0; i<=x; i++) {
			index[i] = i+1;
		}
		
	}
}
