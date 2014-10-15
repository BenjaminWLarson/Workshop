public class Sandbox {

    /**
     * @args command line arguments
     */
    public static void main(String[] args) {




//        String temp = parser.getOffsetHex();
        String temp = "1200010000000084";

        System.out.println("temp is: " + temp);
        System.out.println("string length is: " + temp.length());
//        temp = temp.substring(7);
        temp = temp.substring(1);
        System.out.println("temp is: " + temp);


        System.out.println ("trying the new thing....");
//        logInfo("temp is: " + temp);
//        BigInteger bigInt = new BigInteger(temp, 16);
//        logInfo("bigInt is: " + bigInt);
//        logInfo("now incrementing bigInt");
//        bigInt.add(BigInteger.ONE);
//        logInfo("bigInt is now: " + bigInt);
//        logInfo("now turning bigInt back into a string");
//        bigInt.toString();
//        logInfo("bigInt is now: " + bigInt);


//        int value = Integer.parseInt(temp, 16);
//        value++;
//        String incHex = Integer.toHexString(value);

        Long hexSt = Long.valueOf(temp, 16).longValue();
        hexSt++;
        String blah = Long.toHexString(hexSt);
//        blah.toString();

        String blah2 = "00001"; 


        blah = "1200010000000085";

        System.out.println("now value is: " + blah);


        String formatted = ("0000000000000000" + blah).substring(blah.length());

//        String formatted = String.format("%05x", blah2);
////        String formatted = String.format("")
        System.out.println("now value is: " + formatted);







    }

}
