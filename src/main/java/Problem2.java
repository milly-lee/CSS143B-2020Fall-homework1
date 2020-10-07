import java.util.Arrays;

public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        for(int i = 0; i < data.length - 1; i++){
            if(data[i] > data[i + 1]){
               int oldData = data[i+1]; //save data before is replace
               data[i+1] = data[i];
               data[i] = oldData;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 9, 2, 3, 4, 5, 7, 8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
