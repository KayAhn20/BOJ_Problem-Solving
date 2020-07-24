package 링;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static double PI = Math.PI;
	public static int gcd(int first, int second) {
		if(second==0){
			return first;
		}else {
			return gcd(second, first%second);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pre_test= Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int test = pre_test-1;
		int first = Integer.parseInt(st.nextToken());
		int result = 2*first;
		while(test-->0) {
			int while_first = Integer.parseInt(st.nextToken());
			int while_result = 2*while_first;
			int divider = gcd(result, while_result);
			int top=result/divider;;
			int bottom=while_result/divider;;
			System.out.println(top+"/"+bottom);
		}
	}
}
