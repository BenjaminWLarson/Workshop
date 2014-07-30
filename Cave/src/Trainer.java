import java.util.ArrayList;

public class Trainer {

    Dog eater;
    static Dog jackie;

    public static void main(String[] args) {

        Dog indy = new Dog("Indy", "golden", "yellow", 65, 1);
        Dog riley = new Dog("Riley", "golden", "red", 75, 9);
        Dog sunny = new Dog("Sunny", "lab", "yellow", 80, 9);
        jackie = new Dog();
        Dog sunnybunny = sunny;
        Dog rdog = riley;
        Dog current;

        // these no longer work because I changed the instance variables to private instead of default to setter methods are required to access them
//        jackie.name = "Jackie";
//        jackie.age = 5;
        jackie.setName("Jackie");
        jackie.setAge(5);
        jackie.setBreed("Border Collie");
        jackie.setColor("white");
        jackie.setWeight(35);


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
        for (Dog yapper : pack) {
            yapper.bark(2);
        }
        // loop to make the whole pack sit
        for (Dog puppy : pack) {
            puppy.sit();
        }

        System.out.println("\nHow old are all these dogs?");
        for (Dog pupster : pack) {
            System.out.println(pupster.howOld());
        }

        System.out.println("\nWhat dogs are in our pack?");
        System.out.println("We have " + pack.size() + " dogs in our pack:");
        for (int i = 0; i < pack.size(); i++) {
            // I also had to make the changes here, so pack to access the pack of dogs in the List, then .get gets the dog with desired index
            // then .getName, .getColor and .getBreed
            System.out.println("Dog " + (i + 1) + " is named " + pack.get(i).getName() + " and is a " + pack.get(i).getColor() + " " + pack.get(i).getBreed() +
                    ", registration number: " + pack.get(i).getRegistrationNumber());
        }


        System.out.println("");
        indy.displayWeight();
        indy.eat(5);
        indy.displayWeight();
        indy.poop();
        indy.poop();
        indy.displayWeight();

        System.out.println("This is the line before the breakpoint");
        System.out.println("This is a breakpoint");
        System.out.println("This is the line after the breakpoint");

        sunnybunny.bark(3);
        System.out.println(rdog.allAboutThisdog());
        current = sunnybunny;
        System.out.println(current.allAboutThisdog());
        current = indy;
        System.out.println(current.allAboutThisdog());

        current.chaseCat();

        // Border Collies won't stop chasing cats....
        for (Dog pup: pack) {
            if (pup.getBreed() == "Border Collie") {
                pup.chaseCat();
            }
        }

        System.out.println("How many dogs do we have? We have " + Dog.getNumberOfDogs());


    }
    public void weekOfEating () {

    }
    public void dayOfEating () {

    }
}
