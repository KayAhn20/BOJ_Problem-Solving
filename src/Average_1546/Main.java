package Average_1546;
import java.util.*;
import java.io.*;
//처음에 인트배열 만들어서 0이 나오는 실수를 저지름... ㅠ
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ar = new int[N];
		double[] result = new double[N];
		double max = 0.0;
		double average = 0.0;
		for(int i=0; i < N; i++) {
			ar[i]=sc.nextInt();
			if(ar[i]>max) {
				max = ar[i];
			}
			
		}
		
		for(int i= 0; i<result.length;i++) {
			result[i] = ((ar[i])/max)*100;
			average += result[i];
		}
		System.out.println(average/N);
	}
}
