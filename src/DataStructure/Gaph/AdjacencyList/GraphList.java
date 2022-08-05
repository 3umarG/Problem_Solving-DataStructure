package DataStructure.Gaph.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

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
}

