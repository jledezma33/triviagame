package gameFiles;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Home {
	
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	
	public Home(){
	      prepareGUI();
	   }
	   public static void main(String[] args){
	      Home  swingControlDemo = new Home();      
	      swingControlDemo.showTextFieldDemo();
	   }
	
	public void prepareGUI(){
		mainFrame = new JFrame("Trivia Quiz");
	      mainFrame.setSize(400,400);
	      mainFrame.setLayout(new GridLayout(3, 1));
	      
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      headerLabel = new JLabel("", JLabel.CENTER);        
	      statusLabel = new JLabel("",JLabel.CENTER);    
	      statusLabel.setSize(350,100);

	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true); 
	}
	
	private void showTextFieldDemo(){
	      headerLabel.setText("Welcome to out page. Sign Up or Log In"); 
	      
	      JLabel newUserName = new JLabel("New User Name", JLabel.RIGHT);
	      JLabel newPassWord = new JLabel("New Password", JLabel.CENTER);
	      JLabel confirmNewPassword = new JLabel("Confirm New PassWord", JLabel.LEFT);
	      final JTextField newUserText = new JTextField(6);
	      final JPasswordField newPasswordText = new JPasswordField(6);
	      final JPasswordField confirmNewPasswordText = new JPasswordField(6);
	      
	      JButton signUpButton = new JButton("Sign Up");
	      signUpButton.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e){
	    		  String data = "Username " + newUserText.getText();
	    		  data += ", Password: " + new String(newPasswordText.getPassword() + ", Confirmed Password: " + new String(confirmNewPasswordText.getPassword()));
	    		  statusLabel.setText(data);
	    	  }
	      });

	      JLabel  namelabel= new JLabel("User Name: ", JLabel.RIGHT);
	      JLabel  passwordLabel = new JLabel("Password: ", JLabel.CENTER);
	      final JTextField userText = new JTextField(6);
	      final JPasswordField passwordText = new JPasswordField(6);      

	      JButton logInButton = new JButton("Login");
	      logInButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {     
	            String data = "Username " + userText.getText();
	            data += ", Password: " + new String(passwordText.getPassword()); 
	            statusLabel.setText(data);        
	         }
	      }); 
	      controlPanel.add(newUserName);
	      controlPanel.add(newUserText);
	      controlPanel.add(newPassWord);
	      controlPanel.add(newPasswordText);
	      controlPanel.add(confirmNewPassword);
	      controlPanel.add(confirmNewPasswordText);
	      controlPanel.add(signUpButton);
	      controlPanel.add(namelabel);
	      controlPanel.add(userText);
	      controlPanel.add(passwordLabel);       
	      controlPanel.add(passwordText);
	      controlPanel.add(logInButton);
	      mainFrame.setVisible(true);  
	   }
}
