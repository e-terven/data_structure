package NonlinearDataStructure.Heaps;

// array-based Heap:
// root element is at index 0
// left child is at index (2*i + 1)
// right child is at index (2*i + 2)

public class MaxHeap {
    private int[] heapArray;
    private int size;

    public MaxHeap(int capacity) {
        heapArray = new int[capacity];
        size = 0;
    }
}
