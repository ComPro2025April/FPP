package lab6.prog6_2;

import javax.swing.*;
import java.awt.*;

public class StringUtility extends JFrame{
    private JButton CountLetter;
    private JButton ReverseLetters;
    private JButton RemoveDuplicates;
    private JTextField input;
    private JTextField output;
    private JLabel inputLabel;
    private JLabel outputLabel;
    private JPanel panel;

    public StringUtility(){
        setTitle("String Utility");
        input.setPreferredSize(new Dimension(200, 30));
        output.setPreferredSize(new Dimension(200, 30));

/*        CountLetter.addActionListener(new CountLetterListener(text));
        ReverseLetters.addActionListener(new ReverseLettersListener(text));
        RemoveDuplicates.addActionListener(new RemoveDuplicatesListener(text));*/

        add(panel);
        setSize(320,240);
        centerFrameOnDesktop(this);
        setResizable(false);
        pack();
    }

    public static void centerFrameOnDesktop(Component f) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width-frameWidth)/2), (height-frameHeight)/3);
    }
}
