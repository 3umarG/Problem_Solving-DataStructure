package DataStructure.Gaph.Matrix;

public class Main {
    public static void main(String[] args) {
        GraphMatrix G = new GraphMatrix(5);
        G.printMatrix();
//        G.addEdge(0,1);
//        G.addEdge(0,4);
//        G.addEdge(1,0);
//        G.addEdge(1,4);
//        G.addEdge(1,3);
//        G.addEdge(1,2);
//        G.addEdge(2,3);
//        G.addEdge(3,1);
//        G.addEdge(3,2);
//        G.addEdge(3,4);
//        G.addEdge(4,0);
//        G.addEdge(4,1);
//        G.addEdge(4,3);

//        G.addEdge(0,1);
//        G.addEdge(0,2);
//        G.addEdge(0,3);
//        G.addEdge(0,4);
//        G.addEdge(1,0);
//        G.addEdge(2,0);
//        G.addEdge(3,0);
//        G.addEdge(4,0);
//        G.printMatrix();


        G.addEdge(0,1);
        G.addEdge(0,2);
        G.addEdge(0,3);
        G.addEdge(1,0);
        G.addEdge(1,3);
        G.addEdge(2,0);
        G.addEdge(2,3);
        G.addEdge(3,0);
        G.addEdge(3,1);
        G.addEdge(3,2);
        G.addEdge(3,4);
        G.addEdge(4,3);

        G.pros();
        G.cons();
        System.out.println("BFS : ");
        System.out.println(G.BFS(1));

        System.out.println("DFS Recursive : ");
        G.DFSRecursive(0);
        System.out.println();
        System.out.println("DFS Iterative : ");
        G.DFSIterative(0);

    }
}
