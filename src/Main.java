import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {17, 14, 17, 15, 21, 31, 12, 16, 22};
        System.out.println(Arrays.toString(arr));
        //bubbleSort(arr);
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] merge(int[] left, int[] right)
    {
        int a=0, b=0, c =0;
        int[] res = new int[left.length+ right.length];
        while (a< left.length && b< right.length)  {
            if(left[a] <= right[b]){
                res[c] = left[a];  a++;
            }
            else {
                res[c] = right[b];  b++;
            }
            c++;
        }
        while(a < left.length){
           res[c] = left[a];   a++;   c++;
        }
       while(b < right.length) {
           res[c] = right[b];  b++;   c++;
       }
       return res;
    }


    public static void mergeSort(int[] arr)
    {

    }







    public static void bubbleSort(int[] arr)
    {
        boolean isSorted=false;
        for (int i=0; i< arr.length-1 && !isSorted; i++ )  {
            isSorted = true;
            for (int k=0; k+1< arr.length-i; k++) {
                if( arr[k] > arr[k+1])
                {
                    int tmp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = tmp;
                    isSorted=false;
                }
            }
        }
    }
}