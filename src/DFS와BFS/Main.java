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
		dfs(start);					 // DFS starts 
		for(int i=0; i<=Node; i++) { // visited 전체를 false 로 만들어줌 
			visited[i] = false;
		}
		System.out.println();
		bfs(start);					// BFS strats
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
		// BFS의 알고리즘~~
		// 1.큐에서 하나의 노드를 꺼냅니다.
		// 2.해당 노드에 연결된 노드중 방문하지 않은 노드를 방문하고, 차례대로 큐에 삽입합니다.. 
		// 1,2 번 반복  
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
