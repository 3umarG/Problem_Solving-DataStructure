package DataStructure.Arrays;

public class DynamicArray {
    // عدد الاماكن في ال array
    int[] arr;
    private int capacity;
    // عدد العناصر الفعلية  الموجودة في ال array
    private int size;

    public DynamicArray() {
        this.capacity = 1;
        size = 0;
        arr = new int[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        size = 0;
        arr = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    // Number of Elements.
    public int getSize() {
        return size;
    }


    // Number of All Positions
    public int getCapacity() {
        return capacity;
    }


    // Return the element in index
    public int at(int index) {

        if (index < 0 || index > capacity - 1 || isEmpty()) {
            return 0;
        }
        return arr[index];
    }


    // Insert at the End
    public void push(int item) {
        checkToResizeAdd();
        arr[size] = item;
        size++;

    }


    // Insert at Position
    public void insertAt(int index, int item) {
        if (index < 0 || index > capacity - 1) {
            System.out.println("Index Error...!!!");
            return;
        }
        checkToResizeAdd();
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        size++;
    }


    // remove from end, return value
    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        int temp = arr[size - 1];
        size--;
        checkToResizeDelete();
        return temp;

    }

    // Delete at Specific Index
    public void deleteAt(int index) {
        if(index<0||index>=capacity){
            System.out.println("Not Valid Index...!!!");
        }else if(isEmpty()){
            System.out.println("Empty Array ...!!");
        }else{
            for(int i=index;i<size;i++){
                arr[i]=arr[i+1];
            }
            size--;
            checkToResizeDelete();
        }
    }

    // Remove Specific Item with Value
    public void removeItem(int item){
        if(isEmpty()){
            System.out.println("Empty Array....!!!");
        }else{
            for (int i = 0; i < size; i++) {
                if(arr[i]==item){
                    // Found
                    // Delete and Shifting
                    for (int j = i; j <size ; j++) {
                        arr[j]=arr[j+1];
                    }
                    size--;
                    checkToResizeDelete();
                }
            }
        }
    }


    // Linear Search
    public int find(int item){
        int i;
        for ( i = 0; i <size ; i++) {
            if(arr[i]==item){
                break;
            }
        }
        if(i==size){
            return -1;
        }
        else {
            return i;
        }

    }


    public void displayItems(){
        if (isEmpty())
            System.out.println("Array is Empty....!!");
        else {
            System.out.print("[  ");
            for (int i = 0; i< size; i++){
                System.out.print(arr[i]+"  ");
            }
            System.out.print("]");
            System.out.println();
        }
    }


    /////////////////////////////////////////
    private void checkToResizeAdd() {
        // When Add
        if (size == capacity) {
            capacity*=2;
            int[] newArr = new int[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }

    }

    private void checkToResizeDelete(){
        if(size==capacity/4){
            capacity /= 2;
            int[] newArr = new int[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

}
