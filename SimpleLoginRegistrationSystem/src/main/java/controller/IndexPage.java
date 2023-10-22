package controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndexPage extends JFrame {

	private static final long serialVersionUID = 1L;

	public IndexPage() {
        setTitle("Welcome to Login and Registration System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 70, 200, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to open the login page
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
            }
        });
        add(loginButton);

        JButton registrationButton = new JButton("Registration");
        registrationButton.setBounds(100, 130, 200, 30);
        registrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to open the registration page
                RegistrationPage registrationPage = new RegistrationPage();
                registrationPage.setVisible(true);
            }
        });
        add(registrationButton);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(IndexPage::new);
    }
}
