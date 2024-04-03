import java.util.*;
import java.awt.*;
import java.awt.event.*;
class form1 extends WindowAdapter implements ActionListener{

 //Frames
 Frame frame1 = new Frame();
 Frame frame2 = new Frame();

 //Components of Frame
 //Labels
 Label l1 = new Label("New User Register");
 Label l2 = new Label("Username: ");
 Label l3 = new Label("Password: ");
 Label l4 = new Label("Welcome");
 Label invalidPassword = new Label("Invalid Username or Password");

 //TextFields
 TextField t1 = new TextField();
 TextField t2 = new TextField();

 //Buttons
 Button register = new Button("Register");
 Button logout = new Button("Logout");


 //******* Registeration Form *******\\
 public void RegistrationForm(){

 //Frame Layout
 frame1.setVisible(true);
 frame1.setSize(700,400);
 frame1.setLayout(null);
 frame1.setTitle("Registration Form");

 //Header
 l1.setBounds(300, 50, 110, 20); //Location width , Location Height, Size width, Size height
 frame1.add(l1);

 //Name and its TextField
 l2.setBounds(50, 100, 70, 20);
 frame1.add(l2);
 t1.setBounds(150, 100, 150, 20);
 frame1.add(t1);

 //Password and its TextField
 l3.setBounds(320, 100, 70, 20);
 frame1.add(l3);
 t2.setEchoChar('*'); //* for input values
 t2.setBounds(420, 100, 150, 20);
 frame1.add(t2);

 //Invalid Username or Password
 invalidPassword.setBounds(300, 250, 200, 20);
 frame1.add(invalidPassword);

 invalidPassword.setVisible(false);

 //Register Button
 register.setBounds(320, 150, 70, 20);
 register.addActionListener(this); //Added Functionality to Register Button
 frame1.add(register);

 //For Closing Window
 frame1.addWindowListener(this);
 }
 //******* Welcome Form *******\\
 public void welcomeForm(){
 //Frame Layout
 frame2.setVisible(true);
 frame2.setSize(700,400);
 frame2.setLayout(null);
 frame2.setTitle("Welcome Page");

 //Header
 l4.setBounds(320, 50, 110, 20); //Location width , Location Height, Size width, Size height
 frame2.add(l4);

 //Logout Button
 logout.setBounds(320, 150, 70, 20);
 logout.addActionListener(this); //Added Functionality to Logout Button
 frame2.add(logout);

 //For Closing Window
 frame2.addWindowListener(this);

 }
 //******* Event Handling *******\\
 public void actionPerformed(ActionEvent e){
 String username = t1.getText();
 String password = t2.getText();

 if(e.getSource() == register){
 if(username.equals("admin") && password.equals("123")){
 invalidPassword.setVisible(false);
 //Resetting TextFields
 t1.setText("");
 t2.setText("");

 frame1.setVisible(false);
 welcomeForm();
 }
 else{
 invalidPassword.setVisible(true);
 }
 }
 else if(e.getSource() == logout){
 frame2.setVisible(false);
 RegistrationForm();
 }
 }
 public void windowClosing(WindowEvent e){
 frame1.dispose();
 frame2.dispose();

 }
}
public class Form{

 public static void main(String[] args){
 form1 obj = new form1();
 obj.RegistrationForm();
 }
}
