package net.benjaminlarson;

/**
 * Created by blarson on 1/15/2015.
 */
public class MyTimer {

    /**
     * @args command line arguments
     */
    public static void main(String[] args) {


        Long startTime, endTime, elaspedTime1, elapsedTime2;

        System.out.println("starting the stopwatch....NOW!");
        startTime = System.currentTimeMillis();

        for (int i0 = 0; i0 < 9999999; i0++) {
//            for (int i1 = 0; i1 < 9999999; i1++) {
                                int x = 8 * 8;
//            }
        }




        System.out.println("stopping the stopwatch now");
        endTime = System.currentTimeMillis();
        elaspedTime1 = endTime - startTime;
        System.out.println(" first loop took " + elaspedTime1);

        System.out.println(" ---------------------------------");

        System.out.println("starting the stopwatch....NOW!");
        startTime = System.currentTimeMillis();

        for (int i0 = 0; i0 < 9999999; i0++) {
            for (int i1 = 0; i1 < 9999999; i1++) {
//                for (int i2 = 0; i2 < 9999999; i2++) {
//                    for (int i3 = 0; i3 < 9999999; i3++) {
//                        for (int i4 = 0; i4 < 9999999; i4++) {
//                            for (int i5 = 0; i5 < 9999999; i5++) {
                                int x = 8 * 8;
//                            }
//                        }
//                    }
//                }
            }
        }

        System.out.println("stopping the stopwatch now");
        endTime = System.currentTimeMillis();
        elapsedTime2 = endTime - startTime;
        System.out.println(" first loop took " + elapsedTime2);


        boolean secondRunLonger = elapsedTime2 > elaspedTime1;

        if (secondRunLonger) {
            System.out.println("second run was longer");
        }
        else {
            System.out.println("first run was longer");
        }





    }

}
