package 열개씩끊어출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		Character result ;
		for(int i=0; i<s.length(); i++) {
			result =s.charAt(i);
			bw.write(result);
			if(i%10 ==9) {
				bw.write("\n");
			}
			
		}
		bw.flush();
		bw.close();
		
		
				
		
		
	}
}
/*
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
         
        for (int i = 0; i < input.length(); ++i) {
            System.out.print(input.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
*/
