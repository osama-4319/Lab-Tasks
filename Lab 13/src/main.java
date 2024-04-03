import javax.swing.*;
import java.awt.event.*;

class Pos implements ActionListener{
    //Frame
    JFrame frame = new JFrame();
    //Labels
    JLabel heading = new JLabel("Text Matching");
    JLabel text1Label = new JLabel("Text 1");
    JLabel text2Label = new JLabel("Text 2");
    JLabel result = new JLabel("");
    //TextFields
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    
    //Button
    JButton submit = new JButton("submit");
    
    //Constructor
    Pos(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        heading.setBounds(280, 10, 100, 20);
        frame.add(heading);
        //Submit Button
        text1Label.setBounds(20, 50, 100, 20);
        t1.setBounds(100, 50, 100, 30);
        frame.add(text1Label);
        frame.add(t1);
        //Submit Button
        text2Label.setBounds(20, 100, 100, 20);
        t2.setBounds(100, 100, 100, 30);
        frame.add(text2Label);
        frame.add(t2);
        //Submit Button
        submit.setBounds(100, 170, 100, 50);
        frame.add(submit);
        submit.addActionListener(this); 
        //Result Text Field
        result.setBounds(200, 200, 100, 50);
        frame.add(result);
        
        ImageIcon icon = createImageIcon("images/abc.PNG","a pretty but meaningless splat");
        //JLabel label1 = new JLabel("Image and Text", icon, JLabel.CENTER);
        JLabel label3 = new JLabel(icon);
        label3.setBounds(20, 10, 100, 20);
        
        //frame.add(label1);
        frame.add(label3); 
        //Frame setting
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public ImageIcon createImageIcon(String path, String description) {

		java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
	}

	public void actionPerformed(ActionEvent e){
    	String text1 = "";
    	String text2 = "";
   
        text1 = t1.getText();
        text2 = t1.getText();
        if(text1.equals(text2)) {
        	result.setText("Mathced");
        }
        
        else {
        	result.setText("Not Matched");
        }
    }
    
}

public class main{
    public static void main(String[] args){
        System.out.println("Osama the Great :)");
        Pos obj = new Pos();
    }
}