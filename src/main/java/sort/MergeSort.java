package sort;

import java.util.Arrays;

/**
 * @author douglas
 * @create 2020-11-19 16:28
 */
public class MergeSort {
    private static void merge(int[] arr, int L, int M, int R) {
        int LEFT_SIZE=M-L;
        int RIGHT_SIZE=R-M+1;
        int[] left=new int[LEFT_SIZE];
        int[] right=new int[RIGHT_SIZE];

        int i,j,k;
        for(i=L;i<M;i++){
            left[i-L]=arr[i];
        }
        for(i=M;i<=R;i++){
            right[i-M]=arr[i];
        }

        i=0;
        j=0;
        k=L;
        while(i<LEFT_SIZE && j<RIGHT_SIZE){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }else {
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while (i<LEFT_SIZE){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<RIGHT_SIZE){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        } else {
            int M = (L + R) / 2;
            mergeSort(arr, L, M);
            mergeSort(arr, M + 1, R);
            merge(arr, L, M + 1, R);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 8, 7, 9, 6, 10};
        int L = 0;
        int R = arr.length - 1;
        mergeSort(arr, L, R);
        System.out.println(Arrays.toString(arr));
    }
}
