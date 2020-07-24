package 달팽이는올라가고싶다;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		
		int Climb = sc.nextInt();
		int Fall = sc.nextInt();
		int Height = sc.nextInt();
		int current = 0;
		int day = 0;
		while(current < Height) {
			day++;
			current = current + Climb;
			if(current>=Height) {
				break;
			}
			current = current - Fall;
		}
		System.out.println(day);
	}
}
