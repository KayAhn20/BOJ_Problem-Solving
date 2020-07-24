package 프린터큐;
/*
 * 
 *  1966번 문제 
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(x-->0) {
			LinkedList<Integer> queue = new LinkedList<Integer>();
			LinkedList<Integer> index = new LinkedList<Integer>();
			int total = sc.nextInt();
			int select = sc.nextInt();
			int temp = 0;
			int count =0;
			int num_count=0;
			for(int i =0; i< total; i++) {
				queue.add(sc.nextInt());
				index.add(i);
			}
			temp = queue.get(select); // temp 에  큐.indexOf(select)를 넣어줘 찾기 편하게 
			for(int i=0; i< total; i++) {		// 전체를 돌면서 temp 보다 큰수의 갯수를 센다  
				if(queue.get(i)>=temp) {
					num_count++;
					
				}
			}
			System.out.println(queue);
			System.out.println(index);
			
			
			System.out.println(queue);
			System.out.println("num count is" + num_count);
			while(true) {
				if(queue.peek()<temp && index.peek()!=select) { // 작거나 인덱스가 맞지 않는 경우 
					queue.add(queue.poll());
					index.add(index.poll());
					System.out.println(queue);
					System.out.println(index);
				}else if(queue.peek()>temp && index.peek()!=select ) { // 크거나 인덱스가 맞지 않는 경우 
					queue.poll();
					index.poll();
					count++;
					num_count--;
					System.out.println(queue);
					System.out.println(index);
				}else if(queue.peek()==temp && index.peek()==select && num_count==1) { //  인덱스와 큐가  같은경우 
					++count;
					num_count--;
					System.out.println(num_count);
					System.out.println(count);
					break;
	
				}else if(queue.peek()==temp && index.peek()==select && num_count!=1) {
					queue.add(queue.poll());
					index.add(index.poll());
				}
			}			
		}		
	}
}
