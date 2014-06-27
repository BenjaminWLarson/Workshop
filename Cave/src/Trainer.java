import java.util.ArrayList;

public class Trainer {
    public static void main (String [] args) {

        Dog indy = new Dog("Indy", "golden", "yellow", 65, 1);
        Dog riley = new Dog("Riley", "golden", "red", 75, 9);
        Dog sunny = new Dog("Sunny", "lab", "yellow", 80, 9);
        Dog jackie = new Dog();
        jackie.name = "Jackie";
        jackie.age = 5;
        jackie.setBreed("Border Collie");
        jackie.setColor("white");






        // have Indy bark 5 times
        indy.bark(5);

        // have Sunny sit
        sunny.sit();

        // have all the dogs bark with ArrayList and a loop
        //make an ArrayList for the dogs and add the pups to the pack
        ArrayList<Dog> pack = new ArrayList<Dog>();
        pack.add(indy);
        pack.add(riley);
        pack.add(sunny);
        pack.add(jackie);
        // make the loop to have the whole pack bark
        for (Dog yapper: pack) {
            yapper.bark(2);
        }
        // loop to make the whole pack sit
        for (Dog puppy: pack) {
            puppy.sit();
        }

        System.out.println("\nHow old are all these dogs?");
        for (Dog pupster: pack) {
            if (pupster.getAge() == 1) {
                System.out.println(pupster.getName() + " is " + pupster.getAge() + " year old");
            }
            else {
                System.out.println(pupster.getName() + " is " + pupster.getAge() + " years old");
            }
        }
        System.out.println("\nWhat dogs are in our pack?");
        System.out.println("We have " + pack.size() + " dogs in our pack:");
        for (int i = 0; i < pack.size(); i++) {
            System.out.println("Dog " + (i+1) + " is named " + pack.get(i).name + " and is a " + pack.get(i).color + " " + pack.get(i).breed);
        }
    }
}
