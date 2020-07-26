package 곱셈;
// 분할정복으로 풀어야 된다 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		int z = Integer.parseInt(str[2]);
		int temp = y-1;
		long result=1;
		if(temp>0) {
			while(temp-->0) {
				result *= x%z;
				result %= z;
			}
		}else {
			result = x%z;
		}
		bw.write(result + "\n");
		bw.close();
		br.close();
	}
}
