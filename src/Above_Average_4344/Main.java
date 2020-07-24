package Above_Average_4344;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int student=0;
		double avg = 0;
		int[] arr = new int[1000];
		
		for(int i=0;i<num;i++) {
			student = sc.nextInt();
			int count=0;
			int total =0;			
			for(int j=0; j<student; j++) {
				arr[j] = sc.nextInt();
				total += arr[j];
			}
			avg = (double)total/student;
			for(int k=0; k<student; k++) {
				if(arr[k]>avg) {
					count++;
				}
			}
			System.out.printf("%.3f",100.0 * count/student);
			System.out.println("%");
		}
		sc.close();
	}

}
