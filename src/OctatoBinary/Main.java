package OctatoBinary;
// 1212번 문제 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = {"000","001","010","011","100","101","110","111"};
		String s = br.readLine();
		int[] arr = new int[s.length()];
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<arr.length; i++) {
			arr[i] = s.charAt(i)-48;
			sb.append(str[arr[i]]);
		}
		if(sb.charAt(0)=='0'&& sb.charAt(1)=='0') {
			sb.delete(0, 2);
			System.out.println(sb);
		}
		else if(sb.charAt(0)=='0') {
			sb.deleteCharAt(0);
			System.out.println(sb);
		}
		else {
			System.out.println(sb);
		}
	}
}