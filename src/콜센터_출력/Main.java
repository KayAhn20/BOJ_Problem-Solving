package 콜센터_출력;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		System.out.println("     /~\\");
		System.out.println("    ( oo|");
		System.out.println("    _\\=/_");
		System.out.println("   /  _  \\");
		System.out.println("  //|/.\\|\\\\");
		System.out.println(" ||  \\ /  ||");
		System.out.println("============");
		System.out.println("|          |");
		System.out.println("|          |");
		System.out.println("|          |");
		*/
		/*
		System.out.println("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE");
		System.out.println("N2 Bomber      Heavy Fighter  Limited    21        ");
		System.out.println("J-Type 327     Light Combat   Unlimited  1         ");
		System.out.println("NX Cruiser     Medium Fighter Limited    18        ");
		System.out.println("N1 Starfighter Medium Fighter Unlimited  25        ");
		System.out.println("Royal Cruiser  Light Combat   Limited    4         ");
		*/
		/*
		System.out.println("NFC West       W   L  T");
		System.out.println("-----------------------");
		System.out.println("Seattle        13  3  0");
		System.out.println("San Francisco  12  4  0");
		System.out.println("Arizona        10  6  0");
		System.out.println("St. Louis      7   9  0");
		System.out.println();
		System.out.println("NFC North      W   L  T");
		System.out.println("-----------------------");
		System.out.println("Green Bay      8   7  1");
		System.out.println("Chicago        8   8  0");
		System.out.println("Detroit        7   9  0");
		System.out.println("Minnesota      5  10  1");
		*/
		/*
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str+"??!");
		*/
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=0;i<x;i++) {
			for(int j=0; j<x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
