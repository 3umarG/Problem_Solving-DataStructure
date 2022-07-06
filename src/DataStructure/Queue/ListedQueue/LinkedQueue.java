package DataStructure.Queue.ListedQueue;

public class LinkedQueue {
    Node head, tail;
    int numElem;

    public LinkedQueue() {
        numElem = 0;
    }

    public void pushBack(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        numElem++;
    }


    public int popFront() {
        if (isEmpty()) {
            return -1;
        }
        if (numElem == 1) {
            Node curr = head;
            head = null;
            tail = null;
            return curr.getValue();
        }
        Node curr = head;
        head = head.next;
        return curr.getValue();
    }


    public boolean isEmpty() {
        return numElem == 0;
    }



    public void print(){
        if (isEmpty()){
            System.out.println("Empty List :( !!!!");
        }else {
            System.out.println();
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.getValue() + " --->");
                curr = curr.next;
            }
            System.out.println();
        }
    }

}
