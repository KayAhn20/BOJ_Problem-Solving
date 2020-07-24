package Fly_me_to_the_Alpha_Centauri;

import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    
	  Scanner sc = new Scanner(System.in);
	  int Test = Integer.parseInt(sc.nextLine());
	  for(int i=0; i<Test; i++) {
		  long start = sc.nextInt();
		  long end = sc.nextInt();
		  long distance = end-start;
		  long x = 0;
		  int count = 1;
		  while(x<distance) {
			  
			  count++;
			  x+=(count/2);
			  System.out.println("count is: " + count);
			  System.out.println("after x is : " + x);
			  System.out.println();
		  }
		  System.out.println(count-1);
	  }
  }
}
