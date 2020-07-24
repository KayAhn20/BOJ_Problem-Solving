package 택시기하학;

import java.util.Scanner;
import java.math.*;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("#.######");
		int r = sc.nextInt();
		//유클리드 기하학 반지름 r일때 넓이 
		double uclid =Math.PI*Math.pow(r, 2);
		double taxi = 2*Math.pow(r, 2);
		System.out.println(form.format(uclid));
		System.out.println(form.format(taxi));
	}
}
