package DataStructure.Gaph.AdjacencyList;

public class Main {

    public static void main(String[] args) {
        GraphList G = new GraphList(5);
        G.add(0,1);
        G.add(0,4);
        G.add(1,2);
        G.add(1,3);
        G.add(1,4);
        G.add(2,3);
        G.add(3,4);
        G.add(4,0);
        G.printGraph();
        G.pros();
        G.cons();
        // Expected : True
        System.out.println(G.isEdge(2,3));
        // Expected : False
        System.out.println(G.isEdge(4,2));

    }
}
