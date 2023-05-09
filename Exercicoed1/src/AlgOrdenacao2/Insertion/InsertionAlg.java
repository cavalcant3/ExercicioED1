package AlgOrdenacao2.Insertion;

import java.util.Arrays;

public class InsertionAlg {

    public static void insertion(int[] arr){
        for (int i = 1; i <arr.length; i++) {
            int key = arr[i];
            int j = i-1; //indica a comparação com o elemento anterior

            while (j>= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }
}
