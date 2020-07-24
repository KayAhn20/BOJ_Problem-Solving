package 소수구하기;


// 소수 
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int start = sc.nextInt();
		int end = sc.nextInt();
		boolean a[] = new boolean[end + 1];
		a[0]=true;					// 0 은 소수가 아니다.
		a[1] =true;					// 1은 기초수라서 소수가 아니다.
		for (i = 2; i <= end; i++) { 		//2부터 끝까지 
			for (j = 2; i*j <= end; j++) { // 2부터 i*j가 end 될때까지 
				System.out.println(i*j);
				
				a[i * j] = true;
			}
			
		}
		for (i = start; i <= end; i++) {
			if(a[i] != true) {
				System.out.println("                         " +i);
			}
		}
		
		sc.close();
	}
}
