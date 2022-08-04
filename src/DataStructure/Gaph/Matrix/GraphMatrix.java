package DataStructure.Gaph.Matrix;

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

}
