package 큐2;

/*
 * 
 * 
 * String 비교는 .equals(); 

 * 한줄에 하나씩이니까 bw.write(result + "\n");
 * 인터렉티브 문제가 아니라면 출력 하나하나마다 flush를 할 필요는 없습니다. 
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;



public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		int push = 0;
		while(x-->0) {
			String[] str = br.readLine().split(" ");
			if(str[0].equals("push")) {
				q.offer(Integer.parseInt(str[1]));
				push = Integer.parseInt(str[1]);
			}else if(str[0].equals("pop")) {
				if(q.isEmpty()) {
					bw.write(-1+"\n");
				}
				else {
					bw.write(q.poll()+"\n");
				}
			}else if(str[0].equals("size")) {
				bw.write(q.size()+"\n");
			}else if(str[0].equals("empty")) {
				if(q.isEmpty()) {
					bw.write(1+"\n");
				}else {
					bw.write(0+"\n");
				}
			}else if(str[0].equals("front")) {
				if(q.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(q.peek()+"\n");
				}
			}else {
				if(q.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(push+"\n");
				}
			}
			
		}
		bw.close();
	}
}
