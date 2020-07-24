package 회전하는큐;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int l_c =0;
		int r_c =0;
		Deque <Integer> test_deque = new ArrayDeque<Integer>();
		for(int i=0; i<y;i++) {
			test_deque.addLast(sc.nextInt());
		}
		while(test_deque.isEmpty()!=true) {
		}
	}
}
