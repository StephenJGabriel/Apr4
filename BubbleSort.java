package bubblesort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
    /* Variable Declarations*/
    int cntOfEntries = 10;
    int sub = 0;  // used as subscript for the array
    int sub2 = 0;  // used as subscript for the array
    int hold; // store elements to swap
    Random random = new Random(100);
    int[] dfa = new int[10];

    /*   -----------   */
    /*   INSERT DATA   */
    /*   -----------   */
    for (sub = 0; sub < cntOfEntries; sub++) {
        dfa[sub] = random.nextInt(100);
    }//end for

    /*     --------------    */
    /*     SHOW THE ARRAY    */
    /*     --------------    */
    System.out.println(Arrays.toString(dfa));

        /*     --------------    */
        /*     SORT THE ARRAY    */
        /*     --------------    */
        for(sub = 0; sub < cntOfEntries - 1; sub++){
            for(sub2=0; sub2 < cntOfEntries - sub - 1; sub2++){
              //  if(dfa[sub2] > dfa[sub2 + 1]){            // low to high
                if(dfa[sub2] < dfa[sub2 + 1]){            // high to low
                    hold = dfa[sub2];
                    dfa[sub2] = dfa[sub2 + 1];
                    dfa[sub2 + 1] = hold;

                } //  end if
            }   // end inner for loop

            System.out.println(Arrays.toString(dfa));
        }// end outer for loop

    }  //end main

} // end class
