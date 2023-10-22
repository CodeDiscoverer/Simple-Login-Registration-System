package controller;

import javax.swing.*;
import java.awt.*;

public class AdminPage extends JFrame {

	private static final long serialVersionUID = 1L;

	public AdminPage() {
        setTitle("Admin Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Sample code for a table, you can replace it with the data from the Excel file
        String[] columnNames = {"Username", "Registered Timestamp"};
        Object[][] data = {
                {"User1", "2023-10-20 10:30:00"},
                {"User2", "2023-10-21 11:45:00"}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdminPage());
        
    }
}
