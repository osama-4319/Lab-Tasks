import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class calculator implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel Panel1 = new JPanel();
	JFrame Panel2 = new JFrame();
	JFrame Panel3 = new JFrame();
	//JLabel label1 = new JLabel("Calculator");
	
	//TextField
	JTextField t1= new JTextField();
	
	//EAST Buttons
	JButton add = new JButton("+");
	JButton sub = new JButton("-");
	JButton div = new JButton("/");
	JButton isEqual = new JButton("=");
	
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("8");
	
	calculator(){
		//Frames
		frame.setVisible(true);
		//frame.setLayout(new BorderLayout(3,3));
		
		Panel1.setVisible(true);
		Panel2.setVisible(true);
		//Create Panels First add components to panels then add each panel to frame
		
		
		
		frame.setSize(300,300);
		Panel1.setLayout(new GridLayout(3,3));
		Panel2.setLayout(new BorderLayout(3,3));
		//frame.setLayout(new BorderLayout(3,3));
		//frame.setLayout(new BorderLayout(3,3));
		
		Panel2.add(t1, BorderLayout.NORTH);
		
		//EAST Buttons
			/*frame.add(add, BorderLayout.EAST);
			frame.add(sub, BorderLayout.EAST);
			frame.add(div, BorderLayout.EAST);
			frame.add(isEqual, BorderLayout.EAST);*/
				
		//123... Buttons
		Panel2.add(b1);
		Panel2.add(b2);
		Panel2.add(b3);
		Panel2.add(b4);
		Panel2.add(b5);
		Panel2.add(b6);
		Panel2.add(b7);
		Panel2.add(b8);
		Panel2.add(b9);
		Panel2.add(b0);
			
			//Panel
			frame.add(Panel1);
			frame.add(Panel2);
			//Panel.add(frame3);
	}
	
	public static void main(String[] args) {
		System.out.println("Osama");
		calculator obj = new calculator();
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}
