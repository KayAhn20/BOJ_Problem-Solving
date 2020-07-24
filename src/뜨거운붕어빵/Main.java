package 뜨거운붕어빵;
// 11945번 고려대학교 신입생 프로그래밍 경시대회 C번 ;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		
		
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		int[][] doublearr = new int[x][y];
		//라인을 받아서 스플릿함수로 하나하나 자르고 배열에 넣은다음 거꾸로 출력.
		String[] temp = br.readLine().split(" ");
		*/
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        int y = sc.nextInt();
        if(x!=0 && y!=0) {
        	while(x-->=0) {
            	String str = sc.nextLine();
            	if(str.length()==y) {
            		for (int i = str.length()-1; i>=0; i--){
                        System.out.print(str.charAt(i));
                    }
            		System.out.println();
            	}
            }
        }
	}
}
