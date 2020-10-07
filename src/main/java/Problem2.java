

public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        for(int j = 0; j < data.length; j++) {  //repeat bubble for good amount of times(outter loop)
            for(int i = 0; i < data.length - 1; i++){
                if(data[i] > data[i + 1]){      //needs to move
                    int oldData = data[i+1];    //save data before is replace
                    data[i+1] = data[i];
                    data[i]   = oldData;
                }
            }
        }
    }
}
