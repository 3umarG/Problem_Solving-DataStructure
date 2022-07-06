package DataStructure.Queue.ArrayQueue;

import DataStructure.Queue.ListedQueue.Node;

import java.util.Arrays;

public class ArrayQueue {
    private final int[] arr;
    private final int size;
    private int start, end;
    private int numOfElem;


    public ArrayQueue(int size) {
        this.size = size;
        arr = new int[size];
        start = 0;
        end = 0;
        numOfElem = 0;
    }


    public boolean isEmpty() {
        return numOfElem == 0;
    }


    public boolean isFull() {
        return numOfElem == size;
    }

    public void enqueue(int val) {
        if (!isFull()) {
            arr[end++] = val;
            end %= size;
            numOfElem++;
        }else {
            System.out.println("The array is Full :( !!!!");
        }
    }

    public int getSize(){
        return this.size;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Empty Array :( !!!!");
        }else {
            System.out.println();
            for (int j : arr) {
                System.out.print(j + " ---> ");
            }
            System.out.println();
        }
    }


    public int dequeue(){
        int curr=arr[start++];
        start%=size;
        return curr;
    }


}
