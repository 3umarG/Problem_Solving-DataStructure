package Soutions.Graphs;

import java.util.*;

public class IfPath {
    public static void main(String[] args) {
        int[][] edges1 = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        int[][] edges2 = {{0, 1}, {1, 2}, {2, 0}};
        System.out.println(validPath(6, edges1, 0, 5));

    }


    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source==destination) return true;
        // Convert the matrix Graph ---> Adjacency List Graph Representation
        // edges = [[0,1],[0,2],[3,5],[5,4],[4,3]]
        ArrayList<LinkedList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new LinkedList<>());
        }

        // to add duplicate edges ...
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        return havePathDFSStack(adjList, source, destination);
    }



    private static boolean havePath(ArrayList<LinkedList<Integer>> adjList, int source, int destination) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited.add(source);
        while (!queue.isEmpty()) {
            int start = queue.poll();
            visited.add(start);
            // To Store all Neighbours of the Node ...
            LinkedList<Integer> adj = adjList.get(start);
            for (int node : adj) {
                // if the node isn't visited yet & not contains in the queue ---> Add to Queue to Check
                if (!visited.contains(node) && !queue.contains(node)) {
                    if (node == destination) return true;
                    queue.add(node);
                }
            }

        }
        return false;
    }

    private static boolean havePathDFSStack(ArrayList<LinkedList<Integer>> adkList, int source, int destination) {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        visited.add(source);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            visited.add(node);
            LinkedList<Integer> neighbours = adkList.get(node);
            for (int n : neighbours) {
                if (!visited.contains(n) && !stack.contains(n)) {
                    if (n == destination) return true;
                    stack.add(n);
                }
            }
        }
        return false;
    }


    public static boolean validPathDFS(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;
        HashSet<Integer> visited = new HashSet<>();
        ArrayList<LinkedList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new LinkedList<>());
        }

        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }


        havePathDFSRec(adjList, source, destination, visited);

        return (visited.contains(source) && visited.contains(destination));
    }

    private static void havePathDFSRec(ArrayList<LinkedList<Integer>> adjList, int source, int destination, HashSet<Integer> visited) {
        visited.add(source);
        LinkedList<Integer> adj = adjList.get(source);
        for (int neighbour : adj) {
            if (!visited.contains(neighbour)) {
                havePathDFSRec(adjList, neighbour, destination, visited);
            }
        }
    }


}
