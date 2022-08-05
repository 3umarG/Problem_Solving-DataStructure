package DataStructure.Gaph.GraphHash;

public class Main {
    public static void main(String[] args) {
        GraphHash G = new GraphHash(5);
        G.addEdge(0,1);
        G.addEdge(0,4);
        G.addEdge(1,0);
        G.addEdge(1,4);
        G.addEdge(1,3);
        G.addEdge(1,2);
        G.addEdge(2,1);
        G.addEdge(2,3);
        G.addEdge(3,1);
        G.addEdge(3,2);
        G.addEdge(3,4);
        G.addEdge(4,0);
        G.addEdge(4,1);
        G.addEdge(4,3);


        G.printGraph();
        System.out.println(G.isEdge(1,4));
        System.out.println(G.isEdge(3,0));
    }
}
