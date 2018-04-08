package selectionsort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        /* declare variables */
        int min = 0; // holds element being checked
        int hold = 0; // holds element being swapped

        int sub = 0;
        int sub1 = 0;

        Random random = new Random(100);
        int[] dfa = new int[10];

        /*   -----------   */
        /*   INSERT DATA   */
        /*   -----------   */
        for (sub = 0; sub < 10; sub++) {
            dfa[sub] = random.nextInt(100);
        }//end for

        /*     --------------    */
        /*     SHOW THE ARRAY    */
        /*     --------------    */
        System.out.println(Arrays.toString(dfa));


        for(sub = 0; sub < dfa.length - 1; sub++) {
            min = sub;
            for(sub1 = sub+1; sub1 < dfa.length; sub1++){
                if(dfa[sub1] < dfa[min]){
                    min = sub1;
                    hold = dfa[sub1];
                    dfa[sub1] = dfa[sub];
                    dfa[sub] = hold;
                }//end if
            }// end inner for
        } // end outer for loop
        System.out.println(Arrays.toString(dfa));
    }// end main
}// end class
