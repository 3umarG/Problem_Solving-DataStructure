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

        buildHeap(arr, n);

        printHeap(arr, n);

    }

    private static void heapify(int[] arr, int size, int i) {
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
            heapify(arr, size, largest);
        }

    }

    public static void buildHeap(int[] arr, int size) {
        int startIndx = (size / 2) - 1;

        for (int i = startIndx; i >= 0; i--) {
            heapify(arr, size, i);
        }
    }

    public static void printHeap(int[] arr, int n) {
        System.out.println(
                "Array representation of Heap is:");

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
