package 다이얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		int temp = 0;
		for(int i=0; i<x.length(); i++) {
			switch(x.charAt(i)) {
				case ('A'): temp = temp+3;
					break;
				case ('B'): temp = temp+3;
				break;
				case ('C'): temp = temp+3;
				break;
				case ('D'): temp = temp+4;
				break;
				case ('E'): temp = temp+4;
				break;
				case ('F'): temp = temp+4;
				break;
				case ('G'): temp = temp+5;
				break;
				case ('H'): temp = temp+5;
				break;
				case ('I'): temp = temp+5;
				break;
				case ('J'): temp = temp+6;
				break;
				case ('K'): temp = temp+6;
				break;
				case ('L'): temp = temp+6;
				break;
				case ('M'): temp = temp+7;
				break;
				case ('N'): temp = temp+7;
				break;
				case ('O'): temp = temp+7;
				break;
				case ('P'): temp = temp+8;
				break;
				case ('Q'): temp = temp+8;
				break;
				case ('R'): temp = temp+8;
				break;
				case ('S'): temp = temp+8;
				break;
				case ('T'): temp = temp+9;
				break;
				case ('U'): temp = temp+9;
				break;
				case ('V'): temp = temp+9;
				break;
				case ('W'): temp = temp+10;
				break;
				case ('X'): temp = temp+10;
				break;
				case ('Y'): temp = temp+10;
				break;
				case ('Z'): temp = temp+10;
				break;
				
			}
		}
		System.out.println(temp);
		
	}
}
