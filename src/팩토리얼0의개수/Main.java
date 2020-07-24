package 팩토리얼0의개수;


// 1676번 문제 ;; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int count = 0;
		count+=T/5;
		System.out.println(count);
		count+=T/25;
		System.out.println(count);
		count+=T/125;
		System.out.println(count);
	}
}