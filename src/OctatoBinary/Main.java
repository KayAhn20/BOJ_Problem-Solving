package OctatoBinary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		if(x==0) {
			System.out.println("000");
			return ;
		}
		Queue<Integer> q = new LinkedList<Integer>();
		int temp = 0;
		while (x != 0) {
			temp = x % 10;
			q.offer(temp);
			x /= 10;
		}
		int[] arr = new int[q.size()];
		int[] nums = new int[q.size()];
		arr[0]=1;
		for(int i=1; i<arr.length; i++) {
			arr[i] = (int)(Math.pow(8, i));
		}
		for(int i=0; i< nums.length; i++) {
			nums[i] = q.poll();
		}
		int total=0;
		for(int i=0; i<nums.length;i++) {
			total+= arr[i]*nums[i];
		}
		StringBuilder sb =  new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		
		while(total!=1) {
			if(total%2==0) {
				stack.push(0);
				total=total/2;
				if(total==1) {
					stack.push(1);
				}
			}else {
				stack.push(1);
				total=total/2;
				if(total==1) {
					stack.push(1);
				}
			}
		}
			
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb);
	}
}
