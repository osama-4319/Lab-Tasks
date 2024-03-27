import java.awt.*;
import java.awt.event.*;

import java.awt.*;
import java.awt.event.*;
class awt extends WindowAdapter implements ActionListener{
	
	
	TextField t = new TextField();
	TextField t1 = new TextField();
	
	Frame f = new Frame();
	Frame f2 = new Frame();
	
	Label l0 = new Label("New User Register");
	Label l = new Label("Username");
	Label l1 = new Label("Pasword: ");
	Label l4 = new Label("Welcome User");
	Button reg = new Button("Registers");
	Button reg2 = new Button("Logout");
	
	public void form1(){
		f2.setVisible(false);
		//Frame Layout
		f.setSize(700,400);
		f.setVisible(true);
		f.setLayout(null);
		f.setTitle("Registeration Form");
		//End of Layout
		
		//First Row : Name and TextField for name
		l.setBounds(50,100, 100,30);
		f.add(l);
		t.setBounds(170,100, 100,30);
		f.add(t);
		//End of row 1
		
		l0.setBounds(300,30, 120,80);
		f.add(l0);
		
		//Password
		l1.setBounds(400,100, 100,30);
		t1.setEchoChar('*');					//Displays * for every char entered in input
		t1.setBounds(500,100, 100,30);
		f.add(l1);
		f.add(t1);
		//End of row 2
	
		reg.setBounds(300,280, 100,30);
		reg.addActionListener(this);			//Important: this will add a functionality to the button
		f.add(reg);
		
		// For Closing buttons work
		f.addWindowListener(this);
	}
	
	//2nd Form
	public void form2() {
		f.setVisible(false);
		f2.setSize(700,400);
		
		f2.setVisible(true);
		f2.setLayout(null);
		f2.setTitle("Registeration Form");
		
		//Layout
		l4.setBounds(300,30, 120,80);
		f2.add(l4);
		
		reg2.setBounds(300,280, 100,30);
		reg2.addActionListener(this);			
		f2.add(reg2);
		f2.add(l4);
		f2.addWindowListener(this);
		
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == reg ){			//Submit Button Pressed
	
			form2();
		}
		else {						
			form1();
		}
	}
	public void windowClosing(WindowEvent e) {
		f.dispose();
		f2.dispose();
	}
}

class Main{
public static void main(String Z[]){
	awt a = new awt();
	a.form1();
}}