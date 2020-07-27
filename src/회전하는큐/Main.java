package 회전하는큐;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int pick = sc.nextInt();
		int l_c =0;
		int r_c =0;
		Deque <Integer> test_deque = new ArrayDeque<Integer>();
		for(int i=1; i<=total; i++) {
			test_deque.addLast(i);
		}
		System.out.println(test_deque);
		for(int i=0; i<pick;i++) {
			test_deque.addLast(sc.nextInt());
		}
		while(test_deque.isEmpty()!=true) {
		}
	}
}
