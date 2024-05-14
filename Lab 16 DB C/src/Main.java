import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class POS implements ActionListener{

    JFrame frame = new JFrame("POS");
    
    JLabel label= new JLabel("ID");
    JLabel label2= new JLabel("Name");
    JLabel label3= new JLabel("Class");
   
    //TextFields
    JTextField id = new JTextField("");
    JTextField name = new JTextField("");
    JTextField myClass = new JTextField("");
    
    JButton submit = new JButton("Submit");
    
	// Database connection details (replace with your actual values)
    private static final String DB_URL = "jdbc:mysql://localhost:3306/std_db";
    private static final String USERNAME = "root"; // Replace with your MySQL username
    private static final String PASSWORD = ""; // Replace with your MySQL password

    
    public POS(){
        
        label.setBounds(10,20,50,20);
        id.setBounds(80,20,100,20);
        label2.setBounds(10,60,70,20);
        name.setBounds(80,60,100,20);
        label3.setBounds(10,100,70,20);
        myClass.setBounds(80,100,100,20);
        
        //Button
        submit.setBounds(80,160,100,30);
        
        //Adding components to Frames
        frame.add(label);
        frame.add(id);
        frame.add(label2);
        frame.add(name);
        frame.add(label3);
        frame.add(myClass);
        frame.add(submit);
        
        submit.addActionListener(this);
        label.setVisible(false);
        id.setVisible(false);
        frame.setSize(300, 400);
        frame.setLayout(null);
    	frame.setVisible(true);
    	
    }
    public void actionPerformed(ActionEvent e) {
    	 if (e.getSource() == submit) {
             String idd = id.getText();
             String namea = name.getText();
             String myClass = this.myClass.getText(); // Use 'this' keyword for clarity

             // Validate input (optional)
             if (namea.isEmpty() || myClass.isEmpty()) {
                 JOptionPane.showMessageDialog(frame, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                 return;
             }

             try {
                 Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

                 // Prepare a statement to insert data
                 String insertSQL = "INSERT INTO tbl_stdinfo (std_name, std_class) VALUES (?, ?)";
                 PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
                 preparedStatement.setString(1, namea);
                 preparedStatement.setString(2, myClass);

                 // Execute the insert statement
                 int rowsAffected = preparedStatement.executeUpdate();

                 if (rowsAffected > 0) {
                     JOptionPane.showMessageDialog(frame, "Student information added successfully!");
                     // Clear text fields after successful insertion (optional)
                     id.setText("");
                     name.setText("");
                     this.myClass.setText("");
                 } else {
                     JOptionPane.showMessageDialog(frame, "Error inserting data!", "Error", JOptionPane.ERROR_MESSAGE);
                 }

                 preparedStatement.close();
                 connection.close(); // Close connection after execution
             } catch (SQLException ex) {
                 ex.printStackTrace();
                 JOptionPane.showMessageDialog(frame, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
             }
    	 }
    }

}

public class Main{
	public static void main(String[] args) {
		POS pos = new POS();

	}
}
