package DataStructure.LinkedLists;

public class Node {
    private int value;
     Node next;

    public Node(int value){
        this.value=value;
        next=null;
    }

    public void setNext(Node next){
        this.next=next;
    }

    public int getValue(){
        return this.value;
    }
}
