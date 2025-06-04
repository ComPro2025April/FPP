package lab6.prog6_1;

import javax.swing.*;
import java.awt.*;

public class AddressForm extends JFrame {
    private JTextField nameField, streetField, cityField, stateField, zipField;
    private JButton submitButton;

    public AddressForm() {
        setTitle("Address Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 260);
        setLocationRelativeTo(null);

        // Main content panel with vertical layout and padding
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Individual input panels
        JPanel namePanel = createInputPanel("Name:", nameField = new JTextField());
        JPanel streetPanel = createInputPanel("Street:", streetField = new JTextField());
        JPanel cityPanel = createInputPanel("City:", cityField = new JTextField());
        JPanel statePanel = createInputPanel("State:", stateField = new JTextField());
        JPanel zipPanel = createInputPanel("ZIP:", zipField = new JTextField());

        // ===== Top row: Name, Street, City =====
        JPanel topRow = new JPanel();
        topRow.setLayout(new BoxLayout(topRow, BoxLayout.X_AXIS));
        topRow.add(namePanel);
        topRow.add(Box.createRigidArea(new Dimension(10, 0)));
        topRow.add(streetPanel);
        topRow.add(Box.createRigidArea(new Dimension(10, 0)));
        topRow.add(cityPanel);

        // ===== Bottom row: State, ZIP =====
        JPanel bottomRow = new JPanel();
        bottomRow.setLayout(new BoxLayout(bottomRow, BoxLayout.X_AXIS));
        bottomRow.add(statePanel);
        bottomRow.add(Box.createRigidArea(new Dimension(10, 0)));
        bottomRow.add(zipPanel);

        // ===== Submit button =====
        submitButton = new JButton("Submit");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);

        // ===== Add all to content panel =====
        content.add(topRow);
        content.add(Box.createRigidArea(new Dimension(0, 10)));
        content.add(bottomRow);
        content.add(Box.createRigidArea(new Dimension(0, 10)));
        content.add(buttonPanel);

        add(content);
        setVisible(true);
        setResizable(false);

        // Validation with individual messages
        submitButton.addActionListener(e -> {
            if (!validateField(nameField, "Please enter your name.")) return;
            if (!validateField(streetField, "Please enter your street address.")) return;
            if (!validateField(cityField, "Please enter your city.")) return;
            if (!validateField(stateField, "Please enter your state.")) return;
            if (!validateField(zipField, "Please enter your ZIP code.")) return;

            String name = nameField.getText().trim();
            String street = streetField.getText().trim();
            String city = cityField.getText().trim();
            String state = stateField.getText().trim();
            String zip = zipField.getText().trim();

            System.out.println(name);
            System.out.println(street);
            System.out.println(city + ", " + state + " " + zip);
        });
    }

    // Creates label + input field in vertical alignment, fixed height
    private JPanel createInputPanel(String labelText, JTextField textField) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel label = new JLabel(labelText);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25)); // Fixed height
        textField.setPreferredSize(new Dimension(200, 25));
        textField.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(textField);

        // Wrap in a fixed-height container
        panel.setMaximumSize(new Dimension(Short.MAX_VALUE, 55));
        return panel;
    }

    // Validates individual field
    private boolean validateField(JTextField field, String message) {
        if (field.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    message,
                    "Missing Input",
                    JOptionPane.WARNING_MESSAGE
            );
            field.requestFocus();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AddressForm::new);
    }
}


