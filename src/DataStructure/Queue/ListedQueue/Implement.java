package DataStructure.Queue.ListedQueue;

public class Implement {
    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.pushBack(1);
        linkedQueue.pushBack(2);
        linkedQueue.pushBack(3);
        linkedQueue.pushBack(4);
        linkedQueue.pushBack(6);
        linkedQueue.popFront();
        linkedQueue.print();

    }
}
