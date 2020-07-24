package 수_정렬하기2;

import java.util.Scanner;

public class Main {
	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	private static void quickSort(int[] arr, int start, int end) {
		int mid = partition(arr, start, end);  // 오른쪽방 첫번째 값을 받아온다. 
		if(start<mid -1) {
			quickSort(arr, start, mid-1);
			
		}
		if(mid<end) {
			quickSort(arr, mid, end);
		}
	}
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start+end)/2];				// mid 포인트 잡기 
		while(start <= end) {						// 스타트가 엔드보다 작거나 같을때 
			while(arr[start] < pivot) start++;		// 스타트는 올라가고  
			while(arr[end] > pivot) end--;			// 엔드는 내려가면서 
			if(start <= end) {						// 만약 스타트가 엔드보다 작거나 같으면 
				swap(arr,start,end);				// 스왑한다.. 
				start++;							 
				end--;								
			}
		}
		return start;
	}
	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end]= tmp;
	}
	private static void printArray(int[] arr) {
		for(int data: arr) {
			System.out.println(data);
		}
		//System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] arr = new int[x];
		for(int u = 0; u<x; u++) {
			arr[u] = sc.nextInt();
		}
		
		quickSort(arr);
		printArray(arr);
	}
}