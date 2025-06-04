package lab6.prog6_3;

import javax.swing.*;
import java.awt.*;

public class MetricConversionAssistantForm extends JFrame {
    private RowPanel lengthPanel, weightPanel, liquidPanel, tempPanel;

    public MetricConversionAssistantForm() {
        initializeWindow();

        // creating each row panels
        lengthPanel = new RowPanel("Mile:", "Kilometer:");
        weightPanel = new RowPanel("Pound:", "Kilogram:");
        liquidPanel = new RowPanel("Gallon:", "Litre:");
        tempPanel = new RowPanel("Fahrenheit:", "Celsius:");


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(Box.createVerticalStrut(15));
        mainPanel.add(lengthPanel.jPanel);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(weightPanel.jPanel);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(liquidPanel.jPanel);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(tempPanel.jPanel);
        mainPanel.add(Box.createVerticalStrut(15));

        JButton convertBtn = new JButton("Convert");
        convertBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        convertBtn.addActionListener(e -> convert());

        mainPanel.add(convertBtn);
        mainPanel.add(Box.createVerticalStrut(10));

        getContentPane().add(mainPanel);
    }

    private void convert() {
        try {
            if (!lengthPanel.firstTxtField.getText().isEmpty())
                lengthPanel.secondTxtField.setText(String.format("%.2f", Double.parseDouble(lengthPanel.firstTxtField.getText()) * 1.60934));
            else if (!lengthPanel.secondTxtField.getText().isEmpty())
                lengthPanel.firstTxtField.setText(String.format("%.2f", Double.parseDouble(lengthPanel.secondTxtField.getText()) / 1.60934));

            if (!weightPanel.firstTxtField.getText().isEmpty())
                weightPanel.secondTxtField.setText(String.format("%.2f", Double.parseDouble(weightPanel.firstTxtField.getText()) * 0.453592));
            else if (!weightPanel.secondTxtField.getText().isEmpty())
                weightPanel.firstTxtField.setText(String.format("%.2f", Double.parseDouble(weightPanel.secondTxtField.getText()) / 0.453592));

            if (!liquidPanel.firstTxtField.getText().isEmpty())
                liquidPanel.secondTxtField.setText(String.format("%.2f", Double.parseDouble(liquidPanel.firstTxtField.getText()) * 3.78541));
            else if (!liquidPanel.secondTxtField.getText().isEmpty())
                liquidPanel.firstTxtField.setText(String.format("%.2f", Double.parseDouble(liquidPanel.secondTxtField.getText()) / 3.78541));

            if (!tempPanel.firstTxtField.getText().isEmpty())
                tempPanel.secondTxtField.setText(String.format("%.2f", (Double.parseDouble(tempPanel.firstTxtField.getText()) - 32) * 5 / 9));
            else if (!tempPanel.secondTxtField.getText().isEmpty())
                tempPanel.firstTxtField.setText(String.format("%.2f", (Double.parseDouble(tempPanel.secondTxtField.getText()) * 9 / 5) + 32));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values!", "Invalid input", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void initializeWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Metric Conversion Assistant");
        setSize(400, 250);
        centerFrameOnDesktop(this);
        setResizable(false);
    }

    public static void centerFrameOnDesktop(MetricConversionAssistantForm f) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width - frameWidth) / 2),
                (height - frameHeight) / 3);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MetricConversionAssistantForm mcaf = new MetricConversionAssistantForm();
                mcaf.setVisible(true);
            }
        });
    }
}

