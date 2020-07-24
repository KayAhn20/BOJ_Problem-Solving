package 일곱난쟁이;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 		브루트 포스문제 # 2309 
 * 
 *		아홉명 중 일곱명을 고르는것
 * 		아홉명 중 두명을 고르는것과 같다.
 * 		난쟁이의 수를 N이라고 했을때 
 * 		두명을 고르는 경우의 수: N^2 라고 할 수 있다. 
 *		나머지  난쟁이의 키위 합을 고르는 시간 복잡도 O(N)
 *		따라서 이문제는 O(N^3)으로 해결할수 있다...
 *					3개의 for loop <- 시간 복잡도  
 * 
 * 
 */
public class Main {

	
static int one_hundred;
static int total;
static int x;
static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x=9;
		total=0;
		one_hundred=100;
		arr = new int[9];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			total +=arr[i];
		}
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if((total-(arr[i]+arr[j]))==100) {
					for (int k=0; k<arr.length; k++) {
                        if (i == k || j == k) continue;
                        System.out.println(arr[k]);
                    }
					System.exit(0);
				}
			}
		}
	}
}
