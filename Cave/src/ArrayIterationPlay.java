/**
 * Created by blarson on 7/17/2015.
 */

// declare the class ArrayIterationPlay
public class ArrayIterationPlay {
    // main method that starts the program
    public static void main (String[] args) {

        // declare and populate array
        String[] myArray = new String[] {"a", "b", "c", "d", "e"};

        // indicate program started
        System.out.println("Welcome to the crazy program...\n");

        // print elements in array, one element to each line
        for (int i=0; i < myArray.length; i++) {
            System.out.println("Element: " + myArray[i].toString());
        }

        // blank line to separate output
        System.out.println();

        // again, print the elements, but using Java's enhanced for loop syntax
        // more information: https://blogs.oracle.com/CoreJavaTechTips/entry/using_enhanced_for_loops_with
        for (Object object : myArray) {
            System.out.println("Element: " + object.toString());
        }

        // blank line to separate output
        System.out.println();


        // print elements in array, on a single line, with commas in between each element
        for (int i=0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            // if is needed so the final element does not have a comma after it
            if (i != myArray.length - 1) {
                System.out.print(",");
            }
        }

        // indicate program is complete
        System.out.println("\n\nLater.....");
    }
}
