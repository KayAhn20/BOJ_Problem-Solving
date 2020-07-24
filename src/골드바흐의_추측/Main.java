package 골드바흐의_추측;

import java.util.*;

public class Main {
	public static boolean[] bool = new boolean[10001];
	
	private static void prime() {
		bool[0]=true;
		bool[1]=true;
		for(int i =2 ; i<=10000; i++) {
			for(int j=2; i*j<=10000; j++) {
				bool[i*j]=true;
				
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		while(test-->0) {
		
			int num = sc.nextInt();
			int p = num/2;
			int q = num/2;
			prime();
			while(true) {
				if(bool[p]==false && bool[q]==false) {
					System.out.println(p+" "+q);
					break;
				}else {
					p--;
					q++;
				}
			}
		}
	}
}


/*테스트 케이스 주어지고 테스트 케이스가 실행되는 동안

	1. 수를 받는다.
	2. 받은수 - 가장 작은 소수(2,3,5,7,9,...) 늘려나가면서  받은수-소수=값(소수인지 체크)
	3. 만약 소수이면 그 다음값이 있는지 체크( 예, 받은수가 16일때, 3,13 또는 5,11) 여기서는 5,11이 차이가 없으므로 
		5,11을 출력.
	4. 처음에 받는수가 짝수이기 때문에 나누기 2를해서 중간값을 얻은뒤 하나씩 올리고 내림으로써 결과를 도출.. 
*/