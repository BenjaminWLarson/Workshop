/******************************************************************************
 *                       COPYRIGHT 2002 - 2012 BY DELL INC.
 *                          ALL RIGHTS RESERVED
 *
 * THIS DOCUMENT OR ANY PART OF THIS DOCUMENT MAY NOT BE REPRODUCED WITHOUT
 * WRITTEN PERMISSION FROM DELL INC.
 *****************************************************************************/

/**
 * @author blarson
 */
public class Parser {

    String marker;

    public void setMarker(String marker) {
        this.marker = marker;
    }




    public static void printSomething(String string) {
        System.out.println(string);
    }

    //    public static void printLess (String string) {
//        Scanner scanner = new Scanner(System.in);
//        String cargo = scanner.nextInt(string);
//
//        printSomething(cargo);
//    }
//
    public static void splitter(String string) {
        String result = string;
        String delims = "[ ]+";
        String[] tokens = result.split(delims);

        String markerLabel = null;
        int markerLabelIndex = -1;
        String marker = null;
        int markerIndex = -1;

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].equals("Marker")) {
                System.out.println("found it!" + tokens[i]);
                markerLabelIndex = i;
                markerIndex = i+3;
                markerLabel = tokens[i];
                marker = tokens[i+3];
            }
        }

//        printResult(tokens);

        System.out.println("markerLabel is: " + markerLabel);
        System.out.println("markerLabelIndex is: " + markerLabelIndex);
        System.out.println("marker is: " + marker);
        System.out.println("markerIndex is: " + markerIndex);


//        printResult(tokens);
    }

    public static void printResult (String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("element[" + i + "] " + stringArray[i]);
        }
    }


}
