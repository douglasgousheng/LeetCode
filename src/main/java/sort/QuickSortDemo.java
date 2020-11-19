package sort;

/**
 * @author douglas
 * @create 2020-11-19 16:14
 */
public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr=new int[]{2, 5, 4, 7, 8, 9, 6};

    }
    private static void quickSort(int[] arr,int low,int high){
        if(low<high){

        }
    }
    private static int getIndex(int[] arr,int low,int high){
        int temp = arr[low];
        while (low<high){
            while (low<high && arr[high]>temp){
                high--;
            }
            arr[low]=arr[high];
            while (low<high && arr[low]<temp){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[low]=temp;
        return low;
    }
}
