package lab6.prog6_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringUtility extends JFrame{
    private JButton CountLetter;
    private JButton ReverseLetters;
    private JButton RemoveDuplicates;
    private JTextField inputText;
    private JTextField outputText;
    private JLabel inputLabel;
    private JLabel outputLabel;
    private JPanel panel;

    public StringUtility(){
        setTitle("String Utility");
        inputText.setPreferredSize(new Dimension(200, 30));
        outputText.setPreferredSize(new Dimension(200, 30));
        outputText.setEditable(false);
        outputText.setFocusable(false);

        CountLetter.addActionListener(new CountLetterListener(){});
        ReverseLetters.addActionListener(new ReverseLettersListener(){});
        RemoveDuplicates.addActionListener(new RemoveDuplicatesListener(){});

        add(panel);
        setSize(320,240);
        centerFrameOnDesktop(this);
        setResizable(false);
        pack();
    }

    class CountLetterListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            outputText.setText(Integer.toString(inputText.getText().length()));
        }
    }

    class ReverseLettersListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            StringBuilder sb = new StringBuilder();
            sb.append(inputText.getText());
            outputText.setText(sb.reverse().toString());
        }
    }

    class RemoveDuplicatesListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            char[] tmp = inputText.getText().toCharArray();
            StringBuilder sb = new StringBuilder();
            String a = "";
            for(char c : tmp){
                if(sb.indexOf("" + c) == -1)
                    sb.append(c);
            }

            outputText.setText(sb.toString());
        }
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
