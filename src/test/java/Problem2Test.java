import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test

    // Okay to change
    @Test
    public void testBubbleSort() {
       // assertTrue(false); //this will make me fail
        // add your tests here
        int[] a = {3, 2, 1, 4, 5};
        int[] ra = {1, 2, 3, 4, 5};
        Problem2.bubbleSort(a);
        assertArrayEquals(a, ra);

        int[] b = {10, 3, -54, 20, 100};
        int[] rb = {-54, 3, 10, 20, 100};
        Problem2.bubbleSort(b);
        assertArrayEquals(b, rb);

        int[] c = {0, 0, 0, 1, -1};
        int[] rc = {-1, 0, 0, 0, 1};
        Problem2.bubbleSort(c);
        assertArrayEquals(c, rc);
    }
}
