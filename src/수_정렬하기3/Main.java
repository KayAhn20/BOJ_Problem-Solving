package 수_정렬하기3;
/*
 * 
 *  10989번 문제 
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		int[] arr = new int[x];
		int[] result = new int[x];
		int max = 0;
		if (x >= 1 && x <= 10000000) {
			for (int i = 0; i < x; i++) {
				arr[i] = Integer.parseInt(br.readLine());
				if (arr[i] >= max) {
					max = arr[i];
				}
			}
		}
		int[] cntarr = new int[max + 1];

		for (int i = 0; i < arr.length; i++) {
			cntarr[arr[i]]++; // 빈도를 계산해주는 for loop
		}
		for (int i = 1; i < cntarr.length; i++) {
			cntarr[i] += cntarr[i - 1]; // 누적합을 계산해주는 for loop
		}
		for (int k = arr.length - 1; k >= 0; k--) {
			cntarr[arr[k]]--;
			result[cntarr[arr[k]]] = arr[k];
		}
		for (int i = 0; i < result.length; i++) {
			bw.append(result[i] + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}