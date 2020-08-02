package DFS와BFS;
//1260번 문제 

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static boolean[][] graph = new boolean[1001][1001];
	static boolean[] visited = new boolean[1001];
	static int Node;
	static int Edge;
	static int start;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node = sc.nextInt();
		Edge = sc.nextInt();
		start = sc.nextInt();
		
		int Node1, Node2;
		for(int i = 0; i<Edge; i++) {
			Node1 = sc.nextInt();
			Node2 = sc.nextInt();
			graph[Node1][Node2] = graph[Node2][Node1] = true;
		}
		dfs(start);
		for(int i=0; i<1000; i++) {
			visited[i] = false;
		}
		System.out.println();
		bfs(start);
	}
	static void dfs(int start) {
        System.out.print(start + " ");
        visited[start] = true;

        for (int x = 1; x <= Node; x++) {
            if (graph[start][x] && !visited[x]) {
                dfs(x);
            }
        }
    }
	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		visited[start] = true;
		System.out.print(start + " ");
		int temp;
		while(!queue.isEmpty()) {
			temp = queue.poll();
			for(int x = 1; x<=Node; x++) {
				if(graph[temp][x] && !visited[x]) {
					queue.offer(x);
					visited[x] = true;
					System.out.print(x + " ");
				}
			}
			
		}
	}
}
