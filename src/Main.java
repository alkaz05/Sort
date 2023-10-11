import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {17, 14, 17, 15, 21, 31, 12, 16, 22};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr)
    {
        for (int last= arr.length-1; last>0; last-- )        {
            for (int k=0; k<last; k++)            {
                if( arr[k] > arr[k+1])
                {
                    int tmp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = tmp;
                }
            }
        }
    }
}