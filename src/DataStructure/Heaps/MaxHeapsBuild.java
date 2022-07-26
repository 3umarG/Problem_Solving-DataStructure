package DataStructure.Heaps;

public class MaxHeapsBuild {
    public static void main(String[] args) {

        // Binary Tree Representation
        // of input array
        //             1
        //         /      \
        //        3        5
        //      /   \     / \
        //     4     6   13 10
        //   / \    /  \
        //  9   8  15   17

        int[] arr = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };

        int n = arr.length;

        buildMaxHeap(arr, n);

        printHeap(arr, n,true);

        int[] arr2 = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };

        int n2 = arr.length;

        buildMinHeap(arr2, n2);

        printHeap(arr2, n2,false);

    }

    private static void heapifyMax(int[] arr, int size, int i) {
        int largest = i;
        int leftIndx = 2 * i + 1;
        int rightIndx = 2 * i + 2;

        if (leftIndx < size && arr[leftIndx] > arr[largest]) {
            largest = leftIndx;
        }
        if (rightIndx < size && arr[rightIndx] > arr[largest]) {
            largest = rightIndx;
        }

        // حصل تغيير في قيمة ال largest
        // معناه ان كان في violation للـ heap rules
        if (largest != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            // This Recurrence to check the Sub Nodes and Sub Trees under this Node...
            // that are Modified the Max Heap ...
            heapifyMax(arr, size, largest);
        }

    }


    private static void heapifyMin(int[] arr, int size, int i) {
        int smallest = i;
        int leftIndx = 2 * i + 1;
        int rightIndx = 2 * i + 2;

        if (leftIndx < size && arr[leftIndx] < arr[smallest]) {
            smallest = leftIndx;
        }
        if (rightIndx < size && arr[rightIndx] < arr[smallest]) {
            smallest = rightIndx;
        }

        // حصل تغيير في قيمة ال smallest
        // معناه ان كان في violation للـ heap rules
        if (smallest != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            // This Recurrence to check the Sub Nodes and Sub Trees under this Node...
            // that are Modified the Max Heap ...
            heapifyMax(arr, size, smallest);
        }

    }

    public static void buildMaxHeap(int[] arr, int size) {
        int startIndx = (size / 2) - 1;

        for (int i = startIndx; i >= 0; i--) {
            heapifyMax(arr, size, i);
        }
    }

    public static void buildMinHeap(int[] arr, int size) {
        int startIndx = (size / 2) - 1;

        for (int i = startIndx; i >= 0; i--) {
            heapifyMin(arr, size, i);
        }
    }

    public static void printHeap(int[] arr, int n,boolean isMaxOrNot) {
        System.out.println(
                "Array representation of "+(isMaxOrNot?"Max ":"Min ")+"Heap is: ");

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
