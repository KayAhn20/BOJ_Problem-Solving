package 베르트랑_공준;
 // 4948번   소수 관련문제  
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		while(true) {
			int start = sc.nextInt();
			if(start!=0) {
				int end = 2*start;
				int temp=0;
				boolean a[] = new boolean[end + 1];
				a[0]=true;					// 0 은 소수가 아니다.
				a[1] =true;	
				for(i=2; i<=end; i++) {
					for(j=2; i*j<=end; j++) {
						a[i*j]= true;
						
					}
				}
				for(i=start; i<=end; i++) {
					if(a[i]!=true && i!=start) {
						temp++;
					}
					
				}
				System.out.println(temp);
			}else {
				break;
			}
		}
	}
}