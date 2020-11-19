package sort;

import java.util.Arrays;

/**
 * @author douglas
 * @create 2020-11-19 16:55
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 7, 8, 9, 6, 1, 10};
        int n = arr.length;
        heapSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr, int n) {
        buildHeap(arr, n);
        int i;
        for (i = n - 1; i >= 0; i--) {
            swap(arr, i, 0);
            heapify(arr, i, 0);
        }
    }


    private static void buildHeap(int[] arr, int n) {
        int last = n - 1;
        int parent = (last - 1) / 2;
        int i;
        for (i = parent; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr, int n, int i) {

        if (i > n) {
            return;
        }

        int c1 = i * 2 + 1;
        int c2 = i * 2 + 2;
        int max = i;

        if (c1 < n && arr[c1] > arr[max]) {
            max = c1;
        }

        if (c2 < n && arr[c2] > arr[max]) {
            max = c2;
        }

        if (max != i) {
            swap(arr, max, i);
            heapify(arr, n, max);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
