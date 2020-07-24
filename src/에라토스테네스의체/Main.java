package 에라토스테네스의체;

//2960번 성공함 
import java.util.Scanner;

public class Main{
	  static public void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      int N = sc.nextInt(); // 10 
	      int K = sc.nextInt(); // 7 
	      boolean[] primeNum = new boolean[N+1];  //[11]

	      int count = 0; // 카운트 

	      for(int i = 2; i <= N; i++) {
	          primeNum[i] = true; // 전체를 다 트루로 만들어줌  
	      }
	      for(int i =2; i<=N; i++) {
	    	  for(int j = i; j<=N ; j+=i) {
	    		  if(primeNum[j]==false) {
	    			  continue;
	    		  }
	    		  primeNum[j]=false;
	    		  count++;
	    		  if(count==K) {
	    			  System.out.println(j);
	    		  }
	    	 }
	     }
	  }
}