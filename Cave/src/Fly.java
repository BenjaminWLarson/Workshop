import java.util.concurrent.atomic.AtomicInteger;

public class Fly {

    static AtomicInteger atomicInteger = new AtomicInteger();
    public static void main(String[] args) {

        System.out.println("I'm sorry Dave, I can't do that. Here's a program to keep you entertained instead");


        AtomicInteger lilAtomicInt = atomicInteger;
        System.out.println(atomicInteger.incrementAndGet());
        System.out.println(atomicInteger.incrementAndGet());
        printSomething();
        System.out.println(atomicInteger.incrementAndGet());
        System.out.println(atomicInteger.incrementAndGet());
        printSomething();

        int blah = 0;
        printBlah(blah);
        blah++;
        printBlah(blah);
        blah = -100;
        printBlah(blah);









    }



        public static void printSomething() {
            System.out.println("in the method");
            System.out.println(atomicInteger.incrementAndGet());
            System.out.println("leaving the method");
        }

    public static void printBlah (int blah) {
        System.out.println(blah);
    }





}
