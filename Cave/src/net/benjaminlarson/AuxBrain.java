package net.benjaminlarson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.UnknownHostException;

/**
 * Created by blarson on 12/15/2014.
 */
public class AuxBrain {

    /**
     * @args command line arguments
     *
     * Display what systems I have
     */
    public static void main(String[] args) {

        System.out.println(getHostName());
        WriteToFile(getHostName());

    }

    public static String getHostName() {
        java.net.InetAddress i = null;
        try {
            i = java.net.InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return i.getHostName();
    }

    public static void WriteToFile (String input) {
        try {
            File folder = new File("D:/AuxBrain/level1/level2");
            String fileName = "test";
            File file = new File(folder.getAbsolutePath() + "/" + fileName + ".txt");
            folder.mkdirs();

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(input);
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
