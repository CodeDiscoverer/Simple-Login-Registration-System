package view;

import javax.swing.*;

public class UserView extends JFrame {

	private static final long serialVersionUID = 1L;

	public UserView() {
        setTitle("User Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel welcomeLabel = new JLabel("Welcome! You have successfully logged in as a user.");
        welcomeLabel.setBounds(50, 50, 300, 30);
        add(welcomeLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UserView::new);
        public void run() {
            new UserView();
    }
}
