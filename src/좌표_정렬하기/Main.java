package 좌표_정렬하기;
// 11650 번 문제  
//  Comparator 인터페이스 재정의가 중요한 문제다  
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test = Integer.parseInt(br.readLine());
		int[][] arr = new int[test][2];
		for (int i = 0; i < test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		Arrays.sort(arr, new Comparator<int[]>() { // Comparator 인터페이스 재정의

			@Override
			public int compare(int[] arr1, int[] arr2) {
				if (arr1[0] == arr2[0]) { // if values of xs are the same, then sort arr in order of increasing y.
					return Integer.compare(arr1[1], arr2[1]);
				} else { // if values of xs are not the same, then sort arr in order of increasing x.
					return Integer.compare(arr1[0], arr2[0]);
				}
			}

		});

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
