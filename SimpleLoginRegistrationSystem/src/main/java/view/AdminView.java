package view;

import javax.swing.*;
import java.awt.*;

public class AdminView extends JFrame {

	private static final long serialVersionUID = 1L;

	public AdminView() {
        setTitle("Admin View");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"Username", "Registered Timestamp"};
        String[][] data = {{"User1", "2023-10-20 10:30:00"}, {"User2", "2023-10-21 11:45:00"}};

        JTable table = new JTable(data, columnNames);
        table.setBounds(30, 40, 500, 300);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AdminView::new);
        public void run() {
            new AdminView();
    }
}
