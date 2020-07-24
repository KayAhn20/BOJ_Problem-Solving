package 하얀칸;

// 1100 문제 
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[8];
		int temp=0;
		for(int i =0; i<8; i++) {
			str[i] = sc.next();
		}
		for(int i=0; i<8; i++) {
			if(i%2==0) {
				for(int j=0; j<8; j+=2) {
					if(str[i].charAt(j)=='F') {
						temp++;
					}
				}
			}
			else if(i%2!=0) {
				for(int j=1; j<8; j+=2) {
					if(str[i].charAt(j)=='F') {
						temp++;
					}
				}
			}
		}
		System.out.println(temp);
	}
}
