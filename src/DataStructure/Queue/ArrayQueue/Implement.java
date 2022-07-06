package DataStructure.Queue.ArrayQueue;

public class Implement {
    public static void main(String[] args) {
        ArrayQueue arrayQueue =new ArrayQueue(5);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(1);

        arrayQueue.print();
        System.out.println(arrayQueue.isFull());


    }
}
