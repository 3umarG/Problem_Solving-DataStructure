package DataStructure.Gaph.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        GraphList G = new GraphList(8);
//        G.add(0,1);
//        G.add(0,2);
//        G.add(1,0);
//        G.add(1,3);
//        G.add(1,4);
//        G.add(2,0);
//        G.add(2,4);
//        G.add(3,1);
//        G.add(3,4);
//        G.add(3,5);
//        G.add(4,1);
//        G.add(4,2);
//        G.add(4,3);
//        G.add(4,5);
//        G.add(5,3);
//        G.add(5,4);

//        G.add(0,1);
//        G.add(0,2);
//        G.add(1,0);
//        G.add(1,2);
//        G.add(2,0);
//        G.add(2,1);
//        G.add(2,3);
//        G.add(3,3);
//        G.add(3,2);
//        G.printGraph();
//        G.pros();
//        G.cons();
//        System.out.println(G.BFS(2));

//        G.add(0, 1);
//        G.add(0, 3);
//        G.add(1, 2);
//        G.add(3, 4);
//        G.add(3, 7);
//        G.add(4, 5);
//        G.add(4, 6);
//        G.add(4, 7);
//        G.add(5, 6);
//        G.add(6, 7);

        G.add(0,1);
        G.add(0,2);
        G.add(0,3);
        G.add(1,0);
        G.add(1,3);
        G.add(2,0);
        G.add(2,3);
        G.add(3,0);
        G.add(3,1);
        G.add(3,2);
        G.add(3,4);
        G.add(4,3);

        G.DFSRecursive(0);

        G.pros();
        G.printShortestDistance(2,6);
    }


}
