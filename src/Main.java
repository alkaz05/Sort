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
        for (int i=0; i< arr.length-1; i++ )        {
            for (int k=0; k< arr.length-1-i; k++)            {
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