package 요세푸스문제0;


// 11866 번 문제 
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> t = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[x];
		for(int i =1; i<=x ; i++) {
			q.offer(i);
		}
		// 1,2,3,4,5,6,7 
		sb.append("<");
		while(x-->0) {
			for(int i=1;i<y; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()+", ");
			
			
		}
		
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		System.out.println(sb);
		
	}
}
