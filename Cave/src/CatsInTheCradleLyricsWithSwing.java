import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * Class to print out lyrics of song matching the version here:
 * http://www.azlyrics.com/lyrics/harrychapin/catsinthecradle.html
 */
public class CatsInTheCradleLyricsWithSwing {
    public static void swingTest () {
        JFrame hello = new JFrame("hello");
        hello.add(new JLabel("Hello World"));
        hello.pack();
        hello.setVisible(true);
    }
    public static void singEntireSong () {
        for (int i = 1; i < 9; i++) {
            if (i % 2 == 0) {
                CatsInTheCradleLyricsWithSwing.singRefrain();
            } else {
                switch (i) {
                    case 1:
                        CatsInTheCradleLyricsWithSwing.singVerseChildArrive();
                        break;
                    case 3:
                        CatsInTheCradleLyricsWithSwing.singVerseTurned10();
                        break;
                    case 5:
                        CatsInTheCradleLyricsWithSwing.singVerseCollege();
                        break;
                    case 7:
                        CatsInTheCradleLyricsWithSwing.singVerseRetired();
                        break;
                }
            }
        }
    }
    public static void singRefrain () {
        System.out.println("And the cat's in the cradle and the silver spoon");
        System.out.println("Little boy blue and the man on the moon");
        System.out.println("When you comin' home, Dad");
        System.out.println("I don't know when, but we'll get together then");
        System.out.println("You know we'll have a good time then");
        System.out.println("");
    }
    public static void singVerseChildArrive () {
        System.out.println("\"Cat's In The Cradle\"");
        System.out.println("");
        System.out.println("My child arrived just the other day");
        System.out.println("He came to the world in the usual way");
        System.out.println("But there were planes to catch and bills to pay");
        System.out.println("He learned to walk while I was away");
        System.out.println("And he was talkin' 'fore I knew it, and as he grew");
        System.out.println("He'd say \"I'm gonna be like you, Dad");
        System.out.println("You know I'm gonna be like you\"");
        System.out.println("");
    }
    public static void singVerseTurned10 () {
        System.out.println("My son turned ten just the other day");
        System.out.println("He said, \"Thanks for the ball, Dad, come on let's play");
        System.out.println("can you teach me to throw\", I said \"Not today");
        System.out.println("I got a lot to do\", he said, \"That's ok");
        System.out.println("And he walked away but his smile never dimmed");
        System.out.println("And said, \"I'm gonna be like him, yeah");
        System.out.println("You know I'm gonna be like him\"");
        System.out.println("");
    }
    public static void singVerseCollege () {
        System.out.println("Well, he came from college just the other day");
        System.out.println("So much like a man I just had to say");
        System.out.println("\"Son, I'm proud of you, can you sit for a while\"");
        System.out.println("He shook his head and said with a smile");
        System.out.println("\"What I'd really like, Dad, is to borrow the car keys");
        System.out.println("See you later, can I have them please\"");
        System.out.println("");
    }
    public static void singVerseRetired () {
        System.out.println("I've long since retired, my son's moved away");
        System.out.println("I called him up just the other day");
        System.out.println("I said, \"I'd like to see you if you don't mind\"");
        System.out.println("He said, \"I'd love to, Dad, if I can find the time");
        System.out.println("You see my new job's a hassle and kids have the flu");
        System.out.println("But it's sure nice talking to you, Dad");
        System.out.println("It's been sure nice talking to you\"");
        System.out.println("");
        System.out.println("And as I hung up the phone it occurred to me");
        System.out.println("He'd grown up just like me");
        System.out.println("My boy was just like me");
        System.out.println("");
    }
}
