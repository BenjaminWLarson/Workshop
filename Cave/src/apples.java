///**
// * Created by blarson on 2/14/14.
// *
// * This file keeps changing based on the New Boston Java tutorials on YouTube
// */
//

import java.lang.reflect.Array;

class apples {

    public static void main(String[] args) {
        int blah[] = {21,16,86,21,3};
        printArray(blah);
        printSum(blah);
    }
    private static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            }
            else {
                System.out.print("+" + array[i]);
            }
        }
    }
    private static void printSum (int[] array) {
        int sum = 0;
        for (int i= 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.print("=" + sum);
    }

}


