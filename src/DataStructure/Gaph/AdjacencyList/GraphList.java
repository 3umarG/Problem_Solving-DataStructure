package DataStructure.Gaph.AdjacencyList;

import java.util.*;

public class GraphList {
    private int V;
    private ArrayList<LinkedList<Integer>> adjList;

    public GraphList(int V) {
        this.V = V;
        adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    public void add(int v1, int v2) {
        if (isEdge(v1, v2)) {
            System.out.println("There is already an Edge between :" + v1 + " & " + v2);
        } else {
            adjList.get(v1).add(v2);
            adjList.get(v2).add(v1);
        }
    }

    public void printGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.println("\nAdjacency list of vertex : " + i);
            System.out.print("head");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(" -> "
                                 + adjList.get(i).get(j));
            }
            System.out.println();
        }
    }

    public void pros() {
        System.out.println();
        System.out.println("PROS :");
        System.out.println("1- Save Space : O(V+E)");
        System.out.println("2- Add Edges is Easy -Linked List- O(1)");
        System.out.println("3- Counting the number of Neighbours is take an optimal time ");
    }

    public void cons() {
        System.out.println();
        System.out.println("CONS :");
        System.out.println("Queries like whether there is an edge from vertex u to vertex v are not efficient and can be done O(V)");
    }

    public boolean isEdge(int v1, int v2) {
        // To Determine if there is ad Edge between Vertix -V1- and Vertix -V2- .
        LinkedList<Integer> v = adjList.get(v1);
        for (int i : v) {
            if (v2 == i)
                return true;
        }
        return false;
    }

    public String BFS(int start) {
        int s= start;
        // Space Complexity : O(V)
        // Time Complexity : O(V + E)

        StringBuilder res = new StringBuilder();
        Set<Integer> visited = new HashSet<>(V);
        Queue<Integer> queue = new LinkedList<>();
        // Insert Start V to Queue
        queue.offer(s);
        visited.add(s);
        while (!queue.isEmpty()) {
            s = queue.poll();
            res.append(s).append("  -  ");
            LinkedList<Integer> adjacent = adjList.get(s);
            for (int v : adjacent) {
                if (!visited.contains(v) && !queue.contains(v)) {
                    queue.offer(v);
                    visited.add(v);
                }
            }
        }
        return "BFS from : "+start+" ===> "+res.toString();
    }

    public void DFSRecursive(int start){
//        Complexity Analysis:
//
//        Time complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.
//        Space Complexity: O(V), since an extra visited array of size V is required.


        HashSet<Integer> visited = new HashSet<>();
        System.out.print("DFS from : "+start+" : ");
        DFS(start,visited);
    }

    private void DFS(int s , HashSet<Integer> visited){
        visited.add(s);
        System.out.print(s+" --> ");
        LinkedList<Integer> adj = adjList.get(s);
        for(int n :adj){
            if (!visited.contains(n)){
                DFS(n,visited);
            }
        }
    }


    public void DFSRecursiveAll(int start){
        // To Solve the Problem of Not Connected Graphs

        HashSet<Integer> visited = new HashSet<>();
        System.out.print("DFS from : "+start+" : ");
        for (int i=0;i<V;i++){
            DFS(i,visited);
        }
    }

    public void printShortestDistance(int s, int dest) {
        // predecessor[i] array stores predecessor of
        // i and distance array stores distance of i
        // from s
        int[] pred = new int[V];
        int[] dist = new int[V];


        // LinkedList to store path
        LinkedList<Integer> path = new LinkedList<Integer>();
        int crawl = dest;
        path.add(crawl);
        while (pred[crawl] != -1) {
            path.add(pred[crawl]);
            crawl = pred[crawl];
        }

        // Print distance
        System.out.println("Shortest path length is : " + dist[dest]);

        // Print path
        System.out.println("Path is ::");
        for (int i = path.size() - 1; i >= 0; i--) {
            System.out.print(path.get(i) + " ");
        }
    }

}


