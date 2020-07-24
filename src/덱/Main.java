package 덱;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 
 * 10866번 문제 
 * 
 */
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		Deque <Integer> deque = new ArrayDeque<Integer>();
		String[] str = new String[2];
		while(x-->0) {
			str =  br.readLine().split(" ");
			if(str[0].equals("push_front")) {
				deque.addFirst(Integer.parseInt(str[1]));
			}else if(str[0].equals("push_back")) {
				deque.addLast(Integer.parseInt(str[1]));
			}else if(str[0].equals("pop_front")) {
				if(deque.isEmpty()) {
					bw.write("-1"+"\n");
				}else {
					bw.write(deque.pollFirst()+"\n");
				}
			}else if(str[0].equals("pop_back")) {
				if(deque.isEmpty()) {
					bw.write("-1"+"\n");
				}else {
					bw.write(deque.pollLast()+"\n");
				}
			}else if(str[0].equals("size")) {
				bw.write(deque.size()+"\n");
			}else if(str[0].equals("empty")) {
				if(deque.isEmpty()) {
					bw.write("1"+"\n");
				}else {
					bw.write("0"+"\n");
				}
			}else if(str[0].equals("front")) {
				if(deque.isEmpty()) {
					bw.write("-1"+"\n");
				}else {
					bw.write(deque.peekFirst()+"\n");
				}
			}else if(str[0].equals("back")) {
				if(deque.isEmpty()) {
					bw.write("-1"+"\n");
				}else {
					bw.write(deque.peekLast()+"\n");
				}
			}
			
		}
		bw.flush();
		
		
	}
}