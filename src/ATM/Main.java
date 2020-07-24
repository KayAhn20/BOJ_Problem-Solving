package ATM;
// 11399번 ATM ;;;;;;
// 오름차순 정렬후 배열 2개 사용.....;;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int temp=0;
		int total=0;
		String[] wait = br.readLine().split(" ");
		int[] arr = new int[wait.length];
		int[] rrr = new int[N];
		for(int i=0; i<wait.length; i++) {
			arr[i] = Integer.parseInt(wait[i]);
		}
		Arrays.sort(arr);
		rrr[0]=arr[0];
		temp=rrr[0];
		for(int i=1; i<N; i++) {
			temp=temp+arr[i];
			rrr[i]=temp;
		}
		for(int i=0; i<N; i++) {
			total+=rrr[i];
		}
		System.out.println(total);
	}
}
