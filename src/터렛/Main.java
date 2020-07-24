package 터렛;
// 사람 미치게 만드는문제 ;;; 
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(x-->0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			double dot_distance = Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1),2)));
		
			if(r1+r2==dot_distance || Math.abs(r1-r2) ==dot_distance) {
				System.out.println(1);
			}else if(r1+r2<dot_distance || dot_distance<Math.abs(r1-r2) ||x1==x2 && y1==y2 && r1!=r2){
				System.out.println(0);
			}else if(x1==x2 && y1==y2 && r1==r2){
				System.out.println(-1);
			}else {
				System.out.println(2);
			}
		}
	}
}


