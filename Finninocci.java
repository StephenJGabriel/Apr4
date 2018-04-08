package fibinocciseries;

import java.util.Arrays;

public class FibinocciSeries {
    public static void main(String[] args) {
        int fibbi[] = new int[25];

        for (int i = 0; i < 25; i++) {
            if (i < 2) {
                fibbi[i] = i;
            } else {
                fibbi[i] = fibbi[i - 2] + fibbi[i - 1];
            }  // end if
        }//end for
        System.out.println(Arrays.toString(fibbi));
    } // end main
} //end class