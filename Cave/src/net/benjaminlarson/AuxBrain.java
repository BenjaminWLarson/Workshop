package net.benjaminlarson;

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

}
