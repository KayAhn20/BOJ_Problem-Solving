package 숫자카드2;


// 10816번 문제 
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static int bs(int[] arr, int start, int end) {
		
	}
	
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> q = new LinkedList<>();
		
		int x = Integer.parseInt(br.readLine());
		int[] arr = new int[x];
		for(int i=0; i<x; i++) {
			arr[i]=br.read();
		}
		Arrays.sort(arr);
		
		
		int y = Integer.parseInt(br.readLine());
		int[] arr2 = new int[y];
		int[] result = new int[y];
		
		for(int i=0; i<y; i++) {
			arr2[i] =Integer.parseInt(br.readLine());
			for(int k=0; k<x; k++) {
				if(arr2[i]==arr[k]) {
					result[i]++;
				}
			}
		}
		for(int s = 0; s<result.length; s++) {
			q.add(result[s]);
			
		}
		bw.write(Arrays.toString(result)+"");
		bw.flush(); 
		bw.close();
		
	}
}
