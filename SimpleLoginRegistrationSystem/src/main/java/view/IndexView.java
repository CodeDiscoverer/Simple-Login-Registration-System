package view;

import javax.swing.*;

public class IndexView extends JFrame {

    private static final long serialVersionUID = 1L;

    public IndexView() {
        setTitle("Welcome to Login and Registration System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 70, 200, 30);
        add(loginButton);

        JButton registrationButton = new JButton("Registration");
        registrationButton.setBounds(100, 130, 200, 30);
        add(registrationButton);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new IndexView();
            }
        });
    }
}
