package 직사각형에서탈출;

// 백준 #1085번  
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x_zero=0;
		int y_zero=0;
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		if(w<=1000 && h<=1000) {
			if((x>=1 && x<=w-1) && (y>=1 && y<=h-1)) {
				int bottom = y-x_zero;
				int top = h-y;
				int left = x-y_zero;
				int right = w-x;
				System.out.println(Math.min(Math.min(bottom, top), Math.min(left, right)));
			}
		}
	}
}
