package controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;

	public LoginPage() {
        setTitle("Login Page");
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

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 150, 30);
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for validating credentials
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Logic for validating the credentials
                if (username.equals("admin") && password.equals("admin123")) {
                    dispose(); // Close the current frame
                    AdminPage adminPage = new AdminPage();
                    adminPage.setVisible(true);
                } else if (username.equals("user") && password.equals("user123")) {
                    dispose(); // Close the current frame
                    UserPage userPage = new UserPage();
                    userPage.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
                }
            }
        });
        add(loginButton);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginPage::new);
    }
}
