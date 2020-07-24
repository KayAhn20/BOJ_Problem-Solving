package 명령프롬프트;
import java.util.*;

public class Main {
	static boolean isSame=true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x =sc.nextInt();
		String[] arr = new String[x];
		for(int i =0; i<x; i++) {
			arr[i] = sc.next();
		}
		String str="";
		for(int i=0; i<arr[0].length();i++) {     // 문장을 도는 루프  
			for(int j=1;j<x; j++) {				// 배열을 비교하는 루프 
				if(arr[0].charAt(i)==arr[j].charAt(i)) {
					isSame=true;
                }else {
                    isSame=false;
                    break;
                }
            }
            if(isSame==false) {
                str+="?";
            }else {
                str+=arr[0].charAt(i);
            }
		}
		System.out.println(str);
	}
}
