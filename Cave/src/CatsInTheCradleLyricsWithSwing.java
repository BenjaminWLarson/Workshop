import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Class to print out lyrics of song matching the version here:
 * http://www.azlyrics.com/lyrics/harrychapin/catsinthecradle.html
 *
 * This is a re-write of CatsInTheCradleLyrics to print with swing instead of on the console
 *
 * * Note: I just realized the refrain changes on this song, so it's not going to quite accurate until I make allowances for that
 */
public class CatsInTheCradleLyricsWithSwing {
    public static void swingTest () {
        // making a new frame with title of song
        JFrame frame = new JFrame("\"Cats in the Cradle Song\"");
        // making a panel to hold each verse panel
        JPanel mainPanel = new JPanel();
        // forcing the panels to stack vertically
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        singEntireSong(mainPanel);

        // add main panel to frame and a few things to make things nicer
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setFocusableWindowState(true);

        // set frame size so window doesn't start minimized
        frame.setSize(330, 1100);
        // center frame on screen
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }


    public static JPanel singEntireSong (JPanel jPanel) {
        for (int i = 1; i < 9; i++) {
            if (i % 2 == 0) {
                jPanel.add(makeSingRefrainPanel());
            } else {
                switch (i) {
                    case 1:
                        jPanel.add(makeSingVerseChildArrivePanel());
                        break;
                    case 3:
                        jPanel.add(makeSingVerseTurned10Panel());
                        break;
                    case 5:
                        jPanel.add(makeSingVerseCollegePanel());
                        break;
                    case 7:
                        jPanel.add(makeSingVerseRetiredPanel());
                        break;
                }
            }
        }
        return jPanel;
    }


     public static JPanel makeSingRefrainPanel () {
        JPanel versePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel verseLabel = new JLabel("<html><body> And the cat's in the cradle and the silver spoon<br>" +
                "Little boy blue and the man on the moon<br>" +
                "When you comin' home, Dad<br>" +
                "I don't know when, but we'll get together then<br>" +
                "You know we'll have a good time then<br>" +
                "<br>");
        versePanel.add(verseLabel);
        verseLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        return versePanel;
    }
    public static JPanel makeSingVerseChildArrivePanel () {
        JPanel versePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel verseLabel = new JLabel ("<html><body>\"Cat's In The Cradle\"<br>" +
            "My child arrived just the other day<br>" +
            "He came to the world in the usual way<br>" +
            "But there were planes to catch and bills to pay<br>" +
            "He learned to walk while I was away<br>" +
            "And he was talkin' 'fore I knew it, and as he grew<br>" +
            "He'd say \"I'm gonna be like you, Dad<br>" +
            "You know I'm gonna be like you\"<br>" +
            "<br>");
        versePanel.add(verseLabel);
        verseLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        return versePanel;
    }
    public static JPanel makeSingVerseTurned10Panel () {
        JPanel versePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel verseLabel = new JLabel ("<html><body>My son turned ten just the other day<br>" +
            "He said, \"Thanks for the ball, Dad, come on let's play<br>" +
            "can you teach me to throw\", I said \"Not today<br>" +
            "I got a lot to do\", he said, \"That's ok<br>" +
            "And he walked away but his smile never dimmed<br>" +
            "And said, \"I'm gonna be like him, yeah<br>" +
            "You know I'm gonna be like him\"<br>" +
            "<br>");
        versePanel.add(verseLabel);
        verseLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        return versePanel;
    }
    public static JPanel makeSingVerseCollegePanel () {
        JPanel versePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel verseLabel = new JLabel ("<html><body>Well, he came from college just the other day<br>" +
            "So much like a man I just had to say<br>" +
            "\"Son, I'm proud of you, can you sit for a while\"<br>" +
            "He shook his head and said with a smile<br>" +
            "\"What I'd really like, Dad, is to borrow the car keys<br>" +
            "See you later, can I have them please\"" +
            "<br>");
        versePanel.add(verseLabel);
        verseLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        return versePanel;
    }
    public static JPanel makeSingVerseRetiredPanel () {
        JPanel versePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel verseLabel = new JLabel ("<html><body>I've long since retired, my son's moved away<br>" +
            "I called him up just the other day<br>" +
            "I said, \"I'd like to see you if you don't mind\"<br>" +
            "He said, \"I'd love to, Dad, if I can find the time<br>" +
            "You see my new job's a hassle and kids have the flu<br>" +
            "But it's sure nice talking to you, Dad<br>" +
            "It's been sure nice talking to you\"<br>" +
            "<br>" +
            "And as I hung up the phone it occurred to me<br>" +
            "He'd grown up just like me<br>" +
            "My boy was just like me<br>" +
            "<br>");
        versePanel.add(verseLabel);
        verseLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        return versePanel;
    }
}
