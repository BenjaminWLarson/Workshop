// This is a file to play

public class MarkI {
    public static void main(String[] args) {

        System.out.println("welcome");
        int someInt = 3;

        switch (someInt) {
            case 3:
                System.out.println("case 3");
            case 2:
                System.out.println("case 2");
            case 1:
                System.out.println("case 1");
            default:
                System.out.println("end");
                break;

        }

        int A = 5;
        int B = 0;

        if ((A > 0) || (B > 0)) {
            System.out.println("OR || condition is true");
        }
        else {
            System.out.println("OR || condition not happening");
        }

        if ((A > 0) | (B > 0)) {
            System.out.println("OR | condition is true");
        }
        else {
            System.out.println("OR | condition not happening");
        }



            boolean ready = false;
            while (ready == false) {
                System.out.println("waiting for 10 seconds things to settle down (pp, ss and ppm devices to go away)");
                try {
                    Thread.sleep(10 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                List<Pagepool> ppList = Pagepool.getBulk(getCompellent());
//                List<SS> ssList = SS.getBulk(getCompellent());
                int ppList = 1;
                int ssList = 0;
                if ((ppList > 0) || (ssList > 0)){
                    ready = true;
                    System.out.println(ready);
                }
            }


    }
}
