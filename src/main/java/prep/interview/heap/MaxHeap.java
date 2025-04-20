package prep.interview.heap;

public class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    public MaxHeap(int size) {
        this.maxsize = size;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }
    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private void swap(int x, int y) {
        int tmp = Heap[x];
        Heap[x] = Heap[y];
        Heap[y] = tmp;
    }

    private boolean isLeaf(int pos)
    {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }
    private void downHeapify(int pos) {

        //checking if the node is a leaf node
        if (isLeaf(pos)) {
            return;
        }
        //checking if a swap is needed
        if (Heap[pos] < Heap[leftChild(pos)] ||
                Heap[pos] < Heap[rightChild(pos)]) {
            //replacing parent with maximum of left and right child
            if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                //after swapping, heapify is called on the children
                downHeapify(leftChild(pos));
            } else {
                swap(pos, rightChild(pos));
                //after swaping, heapify is called on the children
                downHeapify(rightChild(pos));
            }
        }
    }
    private void heapifyUp(int pos) {
        int temp = Heap[pos];
        while(pos > 0 && temp > Heap[parent(pos)]){
            Heap[pos] = Heap[parent(pos)];
            pos = parent(pos);
        }
        Heap[pos] = temp;
    }

    public void insert(int element) {
        Heap[++size] = element;
        int current = size;
        heapifyUp(current);
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(+ Heap[i] + ": L- " +
                    Heap[2 * i] + " R- " + Heap[2 * i + 1]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(1);
        maxHeap.insert(4);
        maxHeap.insert(2);
        maxHeap.insert(5);
        maxHeap.insert(13);
        maxHeap.insert(6);
        maxHeap.insert(17);
        maxHeap.print();
    }
}
