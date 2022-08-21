package DataStructure.Gaph.Matrix;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphMatrix {
    private int vertices;
    private int[][] matrix;

    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }


    public void printMatrix() {
        System.out.println("----------------");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }


    public void addEdge(int v1, int v2) {
        int value = matrix[v1][v2];
        if (value != 0) {
            System.out.println("There is Already an Edge between : " + v1 + " & " + v2);
        } else {
            matrix[v1][v2] = 1;
            matrix[v2][v1] = 1;
            System.out.println("Done Add ...!!");
        }
    }


    public void removeEdge(int v1, int v2) {
        int value = matrix[v1][v2];
        if (value == 0) {
            System.out.println("There is not Already an Edge between : " + v1 + " & " + v2);
        } else {
            matrix[v1][v2]=0;
            matrix[v2][v1]=0;
            System.out.println("Done Delete ...!!");
        }
    }


    public void pros(){
        System.out.println();
        System.out.println("PROS :");
        System.out.println("1-Easy to Implement");
        System.out.println("2-Removing an Edge take O(1) time ");
        System.out.println("3-Queries and Checking for Edge is simple and easy , take O(1) time");
    }

    public void cons(){
        System.out.println();
        System.out.println("CONS :");
        System.out.println("1-Consumes more Space : O(V*V)");
        System.out.println("2-Adding a Vertex OR Update need to Update all Connected Vertices");
    }

    public String BFS(int start){
//        Time Complexity: O(N*N)
//        Auxiliary Space: O(N)

        int s = start;
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();

        q.offer(s);
        visited.add(s);

        while (!q.isEmpty()){
            s = q.poll();
            sb.append(s).append("  -  ");
            for (int i=0;i<vertices;i++){
                if (matrix[s][i]==1 && !visited.contains(i) && !q.contains(i)){
                    q.add(i);
                    visited.add(i);
                }

            }
        }

        return "BFS from : "+start+" ===> "+sb.toString();
    }

    private void DFS(int start , HashSet<Integer> visited){
        visited.add(start);
        System.out.print(start+" --> ");
        for (int i=0;i<vertices;i++){
            if (!visited.contains(i) && matrix[start][i]==1){
                DFS(i,visited);
            }
        }
    }

    public void DFSRecursive(int start){
        HashSet<Integer> visited = new HashSet<>();
        System.out.print("DFS from "+start+" : ");
        DFS(start,visited);
    }

    public void DFSIterative(int start){
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        stack.push(start);
        System.out.print("DFS from : "+start+" : ");
        while (!stack.isEmpty()){
            int s = stack.pop();
            if (visited.contains(s)){
                continue;
            }
            System.out.print(s+" --> ");
            visited.add(s);
            for (int i=0;i<vertices;i++){
                if (matrix[s][i]==1 && !stack.contains(i) ){
                    stack.push(i);
                }
            }
        }
    }

}
