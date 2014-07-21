///**
// * Created by blarson on 2/14/14.
// *
// * This file keeps changing based on the New Boston Java tutorials on YouTube
// */
//
import java.util.Scanner;

class apples {

    /**
     * @args command line arguments
     */
    public static void main(String[] args) {
       int myLilArray[] = {1,3,2,4,7,9};

        for (int i : myLilArray) {
            System.out.println ("Number is: " + i);
        }
        for (int i = 0 ; i < myLilArray.length; i++) {
            System.out.println ("Number is: " + myLilArray[i]);
        }
    }
}


