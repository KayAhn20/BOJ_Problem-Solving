package 피보나치함수DP;
// 시간단축 하기 위해서 DP;
// 한번더 공부하기 ;;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[][]	arr = new int[41][2];
		arr[0][0]=1;
		arr[1][1]=1;
		for(int i=2; i<41; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = arr[i-1][j]+arr[i-2][j];
			}
		}
		for(int i=0; i<number; i++) {
			int x = sc.nextInt();
			System.out.println(arr[x][0] + " " + arr[x][1]);
		}
		sc.close();
	}
}
