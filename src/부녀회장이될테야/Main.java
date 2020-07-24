package 부녀회장이될테야;
// # 2775 ;;
import java.util.*;
import java.io.*;

public class Main {

	private static int cal (int k, int n) {
		if(k==0) {
			return n;
		}else if(n==0) {
			return 0;
		}else {
			return cal(k,n-1) + cal(k-1, n);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine()); // Test case T.
		while(T-->0) {
			int k = Integer.parseInt(br.readLine()); //층;;
			int n = Integer.parseInt(br.readLine()); // 호수 ;;
			System.out.println(cal(k,n));
		}
		
		
	}
}
