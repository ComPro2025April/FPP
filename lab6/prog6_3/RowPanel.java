package lab6.prog6_3;

import javax.swing.*;

public class RowPanel {
    public JPanel jPanel;
    public JTextField firstTxtField, secondTxtField;

    RowPanel(String lbl1, String lbl2){
        jPanel = new JPanel();

        JLabel firstLbl = new JLabel(lbl1);
        JLabel secondLbl = new JLabel(lbl2);
        firstTxtField = new JTextField(8);
        secondTxtField = new JTextField(8);

        setTxtFieldSize(firstTxtField);
        setTxtFieldSize(secondTxtField);


        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));

        jPanel.add(firstLbl);
        jPanel.add(Box.createHorizontalStrut(5));
        jPanel.add(firstTxtField);

        jPanel.add(Box.createHorizontalStrut(30));

        jPanel.add(secondLbl);
        jPanel.add(Box.createHorizontalStrut(5));
        jPanel.add(secondTxtField);
    }

    void setTxtFieldSize(JTextField jTextField) {
        jTextField.setMaximumSize(jTextField.getPreferredSize());
    }
    
}
