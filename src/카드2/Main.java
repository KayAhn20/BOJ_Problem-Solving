package 카드2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=1; i<=x; i++) {
			q.offer(i);
		}
		while(q.size()!=1) {
			q.remove(q.peek());
			q.offer(q.poll());
		}
		System.out.println(q.poll());
	}
}
