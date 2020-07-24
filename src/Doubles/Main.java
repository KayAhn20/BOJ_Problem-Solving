package Doubles;
// #4641 
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt();
			int[] array = new int[arr.size()];
			if(x!=0) {
				arr.add(x);
			}else {
				for(int i=0;i<arr.size();i++) {
					array[i] = arr.get(i);
					System.out.println(array[i]);
				}
				for(int i=0;i<array.length; i++) {
					for(int j=0; j<array.length;j++) {
						
					}
				}
				break;
			}
		}
	}

}
