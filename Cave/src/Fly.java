public class Fly {
    public static void main(String[] args) {

        System.out.println("Welcome to the program where I call methods because I can");

        PrintAwesome();
        Wicked();
        PrintAwesome();

        System.out.println("\nNow we start a for loop");



        LoopPrint(3);

        System.out.println("number is: " + gimmeNumber());

        // enhanced for loop here
        // change
        // more change


    }

    public static void PrintAwesome () {
        System.out.println("I am awesome.");
    }

    public static void Wicked () {
        System.out.println("This is wicked!!!");
    }
    public static void LoopPrint(int x) {
        for (int i = 0; i < x; i++) {
            Wicked();
            PrintAwesome();
        }
    }
    public static int gimmeNumber () {
        int x = 4;

        return x;
    }



}
