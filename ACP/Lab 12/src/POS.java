import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class POS implements ActionListener{

    JFrame frame = new JFrame("POS");
    
    JLabel label= new JLabel("ID");
    JLabel label2= new JLabel("Name");
    JLabel label3= new JLabel("Des");
    JLabel label4= new JLabel("");
    //TextFields
    JTextField id = new JTextField("");
    JTextField name = new JTextField("");
    JTextField Des = new JTextField("");
    
    JComboBox cb;
    
    JButton submit = new JButton("Submit");
    
    public POS(){
    	

        String[] arr = {"HR", "Staff"};
        cb =new JComboBox(arr);
        
        label.setBounds(10,20,50,20);
        id.setBounds(60,20,50,20);
        label2.setBounds(10,60,50,20);
        name.setBounds(60,60,50,20);
        label3.setBounds(10,100,50,20);
        cb.setBounds(60,100,50,20);
        label4.setBounds(60,200,100,20);
        
        //Button
        submit.setBounds(60,140,100,20);
        
        //Adding components to Frames
        frame.add(label);
        frame.add(id);
        frame.add(label2);
        frame.add(name);
        frame.add(label3);
        frame.add(cb);
        frame.add(submit);
        frame.add(label4);
        
        submit.addActionListener(this);
        
        frame.setSize(300, 400);
        frame.setLayout(null);
    	frame.setVisible(true);

        
    	
    }
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == submit) {
    		// Take if here homework if id and name match so welcome Hr or Staff otherwise warning
    		String idd = id.getText();
    		String namea = name.getText();
    		String des = (String) cb.getItemAt(cb.getSelectedIndex());
    		//System.out.println("Welcome " + namea + " your id is " + idd);
    		label4.setText("Welcome " + namea + " your id is " + idd + des);
    	
    		//JOptionPane.showMessageDialog(frame, " Message","Alert",JOptionPane.WARNING_MESSAGE);
    		JOptionPane.showMessageDialog(frame, "Welcome " + namea + " your id is " + idd + des);
    	}
    }

	public static void main(String[] args) {
		POS pos = new POS();

	}

}
