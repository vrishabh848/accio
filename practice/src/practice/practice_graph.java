package practice;

import java.util.*;
import java.io.*;
 

class practice_graph {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < M; i++) {
            ArrayList<Integer> e = new ArrayList<Integer>();
            e.add(sc.nextInt());
            e.add(sc.nextInt());
            Edges.add(e);
        }
        int U=sc.nextInt();
        int V=sc.nextInt();
        Solution ob = new Solution();
        if (ob.check(N, M, Edges,U,V)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

} 

class Solution {

	private boolean dfs(int U,int V,ArrayList<Integer>[] graph,boolean[] visited){
	if(U == V) return true;
	 visited[U] = true;
    boolean res = false;
    for(int nbr : graph[U]) {
        if(visited[nbr] == false) {
            res = res || dfs(nbr, V, graph, visited);
        }
    }
    return res;

	}
	
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges,int U,int V) {
        // your code here
		ArrayList<Integer>[] graph=new ArrayList[N];
		for(int i=0; i<N; i++){ // for every element of graph creating new arrayList
			graph[i]=new ArrayList<>();
			}
			 for(ArrayList<Integer> edge : Edges) {
		        int u = edge.get(0);
		        int v = edge.get(1);
		        graph[u - 1].add(v - 1);
		        graph[v - 1].add(u - 1);
		 }

		boolean[] visited=new boolean[N];
		return dfs(U-1,V-1,graph,visited);
    }
}