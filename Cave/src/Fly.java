import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Fly {

    static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {

        String tracepage;

        tracepage = "ddddddddd dd ddddddddddddd ddddd dddd";

        String tracepageSimple = "     0      Marker                     16 x52696fdfdfdsfdsfdsadsafdsafadsf71717171 fdfdfdsfdsf";



//        Parser.splitter(tracepageSimple);
        Parser.splitter(tracepage);


        PrintWriter writer = null;
        try {
            writer = new PrintWriter("the-file-name.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        writer.println("The first line");
        writer.println("The second line");
        writer.close();




    }


}
