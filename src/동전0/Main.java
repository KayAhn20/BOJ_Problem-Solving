package 동전0;
/*
 * 
 *  11047 그리디 문제  통과 
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		/*
		arr[0]=1;
		arr[1]=5;
		for(int i=2; i<N; i++) {
			if(i%2==0) {
				arr[i]=2*arr[i-1];
			}else {
				arr[i]=5*arr[i-1];
			}
		}
		*/
		for(int i=0; i<N; i++) {
			arr[i]= Integer.parseInt(br.readLine());
		}
		int temp=0;
		while(K!=0) {
			for(int i=N-1; i>=0; i--) {
				if(K-arr[i]>=0) {
					temp++;
					K = K-arr[i];
					break;
				}
			}
		}
		System.out.println(temp);
	}
}
