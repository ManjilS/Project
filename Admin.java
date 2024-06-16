package database;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class databasejoin{
	String url = "jdbc:mysql://localhost:3308/javapractice";
    // Username
    String username = "root";
    // Password (empty)
    String password = "";
    PreparedStatement preparedStatement = null;
    Connection con = null;
    public databasejoin() {
    try {
        
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(url, username, password);
        String sql = "INSERT INTO Admin (Admin_user, Password) VALUES (?, ?)";
        
        preparedStatement = con.prepareStatement(sql);

        
        preparedStatement.setString(1, "Manjil");
        preparedStatement.setString(2, "manjil123");

       
        int rowsInserted = preparedStatement.executeUpdate();

        
        if (rowsInserted >0) {
            System.out.println("A row inserted successfully.");
        } else {
            System.out.println("Failed to insert the row.");
        }
    } catch (ClassNotFoundException e) {
        System.out.println("MySQL JDBC Driver not found.");
        e.printStackTrace();
    } catch (SQLException e) {
        System.out.println("Failed to connect to the database.");
        e.printStackTrace();
    } finally {
        // Close the connection
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


}
public class Admin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		databasejoin obj = new databasejoin();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
