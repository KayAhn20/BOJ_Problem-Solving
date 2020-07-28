package 가장많은글자;
/*
 * 
 *  1371번 문제  
 * 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int alpha[] = new int[26];
        int max = 0;
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            for(int i=0; i<str.length(); i++) {
            	if(str.charAt(i)!=' ') {
            		alpha[str.charAt(i)-97]++;
            		if(alpha[str.charAt(i)-97]>max) {
            			max = alpha[str.charAt(i)-97];
            		}
            	}
            }
        }
        for(int i = 0; i < 26; i++){
            if(alpha[i] == max) {
            	System.out.print((char)(i + 97));
            }
        }
        sc.close();
    }
}
 