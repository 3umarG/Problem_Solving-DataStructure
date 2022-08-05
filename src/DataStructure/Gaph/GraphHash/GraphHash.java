package DataStructure.Gaph.GraphHash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GraphHash {
    /*
    Hash Map
    {
    Node : Set of Adjacent Vertices{}
    }
     */
    private int v;
    private HashMap<Integer, Set<Integer>> graphMap = new HashMap<>();

    public GraphHash(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            graphMap.put(i, new HashSet<>());
        }
            /*
            {
            0:{}
            1:{}
            2:{}
            3:{}
            }
             */
    }

    public void addEdge(int v1, int v2) {
        if (isEdge(v1, v2)) {
            System.out.println("There is Already an Edge between : " + v1 + " & " + v2);
        } else {
            graphMap.get(v1).add(v2);
            graphMap.get(v2).add(v1);
        }
    }

    public boolean isEdge(int v1, int v2) {
        Set<Integer> set = graphMap.get(v1);
        return set.contains(v2);
    }

    public void removeEdge(int v1,int v2){
        if (!isEdge(v1,v2)){
            System.out.println("There is not Already an Edge between : " + v1 + " & " + v2);
        }else {
            graphMap.get(v1).remove(v2);
            graphMap.get(v2).remove(v1);
        }
    }

    public void getAdjacent(int v){
        Set<Integer> adj = graphMap.get(v);
        System.out.println("Adjacent to the Vertex : "+v+" is : "+adj);
    }

    public void pros(){
        System.out.println();
        System.out.println("PROS :");
        System.out.println("1- Queries like whether there is an edge from vertex u to vertex v can be done in O(log V).");
        System.out.println("2- Add an Edge take O(log V) time");
        System.out.println("3- Delete is Easy while using Hashing ");
        System.out.println("4- Space is O(V + E) ");

    }

    public void cons(){
        System.out.println();
        System.out.println("CONS :");
        System.out.println("1- It takes O(log V) in insertion , good but it not good when compared to Graph using Linked List O(1) ");
    }

    public void printGraph()
    {
        for(int i = 0; i < v; i++)
        {
            System.out.println("Adjacency list of vertex " + i);

            for (Integer integer : graphMap.get(i)) System.out.print(integer + " ");

            System.out.println();
            System.out.println();
        }
    }


}
