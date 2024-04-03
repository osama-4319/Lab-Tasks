import java.awt.*;
import java.awt.event.*;

class test extends WindowAdapter{
	Frame f;
	public test(){
		f = new Frame();
		//Label
		Label l = new Label("Employee id");
		l.setBounds(20,80,80,20);
		
		//Button
		Button b = new Button("Submit");
		b.setBounds(120,100,80,30);
		
		//TextField
		TextField t = new TextField();
		t.setBounds(20,100,100,30);
		
		//Adding Components
		f.add(b);
		f.add(l);
		f.add(t);
		
		//Size of the Frame 
		f.setSize(300,300);
		
		f.setTitle("AWT first Lab");
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener(this);
	}
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
}

public class main {

	public static void main(String[] args) {
		System.out.println("Osama Malik");
		test obj = new test();
		
	}

}