package controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationPage extends JFrame {

	private static final long serialVersionUID = 1L;

	public RegistrationPage() {
        setTitle("Registration Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(50, 50, 100, 30);
        add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 150, 30);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(50, 100, 100, 30);
        add(passwordLabel);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(150, 100, 150, 30);
        add(passwordField);

        JButton registerAdminButton = new JButton("Register as Admin");
        registerAdminButton.setBounds(100, 150, 200, 30);
        registerAdminButton.addActionListener(new ActionListener() {
            @SuppressWarnings("unused")
			@Override
            public void actionPerformed(ActionEvent e) {
                // Logic to register as an admin
                String username = usernameField.getText();
                String password = passwordField.getText();
                // Additional logic to write data to the Excel file for admin
                JOptionPane.showMessageDialog(null, "Registered as Admin!");
            }
        });
        add(registerAdminButton);

        JButton registerUserButton = new JButton("Register as User");
        registerUserButton.setBounds(100, 200, 200, 30);
        registerUserButton.addActionListener(new ActionListener() {
            @SuppressWarnings("unused")
			@Override
            public void actionPerformed(ActionEvent e) {
                // Logic to register as a user
                String username = usernameField.getText();
                String password = passwordField.getText();
                // Additional logic to write data to the Excel file for a user
                JOptionPane.showMessageDialog(null, "Registered as User!");
            }
        });
        add(registerUserButton);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegistrationPage::new);
    }
}
