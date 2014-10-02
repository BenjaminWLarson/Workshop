import java.util.ArrayList;
import java.util.List;

public class Sandbox {

    /**
     * @args command line arguments
     */
    public static void main(String[] args) {
        for (int i = 8; i < 9; i++) {
            System.out.println("some output...");
        }

        List<List<String>> listOfLists = new ArrayList<List<String>>();



        ArrayList<String> blah = new ArrayList<String>();
        blah.add("one");
        blah.add("two");
        blah.add("three");

        ArrayList<String> blah2 = new ArrayList<String>();
        blah.add("I");
        blah.add("II");
        blah.add("III");

        ArrayList<String> blah3 = new ArrayList<String>();
        blah.add("1");
        blah.add("2");
        blah.add("3");

        listOfLists.add(blah);
        listOfLists.add(blah2);
        listOfLists.add(blah3);





        System.out.println("printing the first thing here: " + blah.get(0));
        System.out.println("printing the second thing here: " + blah.get(1));
        System.out.println("printing the third thing here: " + blah.get(2));

        System.out.println("last element in second row is: " + listOfLists.get(0).get(2));







    }

}
