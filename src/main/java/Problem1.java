public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        int firstnum = 0;
        int lastnum  = data.length - 1;
        while(firstnum <= lastnum) {
            int midnum = (lastnum + firstnum) / 2;
            if(data[midnum] == target)
                return midnum;
            if(data[midnum] > target)
                lastnum = midnum - 1; //move the range to the left
            if(data[midnum] < target)
                firstnum = midnum +1; //move the range to the right
        }

        return -1; // Place holder
    }
}
