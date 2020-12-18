package boundary.desktop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.LoginBean;

public class LoginPage extends HomeGraphicInterface{
	
	public void setLoginPage(){
	
	frame.repaint();
    JFrame.setDefaultLookAndFeelDecorated(true);
    panel.remove(4);
    
    JPanel loginPanel = new JPanel();
	loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
	loginPanel.setBackground(Color.WHITE);
    
    
    JPanel emailPanel = new JPanel();
    
    
    JLabel email = new JLabel("E-mail");
    emailPanel.add(email);
	
	JTextField textFieldema = new JTextField(20);
	emailPanel.add(textFieldema);
	
	emailPanel.setBackground(Color.WHITE);
	emailPanel.setMaximumSize(new Dimension(larghezza/3, 50));
	loginPanel.add(emailPanel);
	loginPanel.add(Box.createRigidArea(new Dimension(0,15)));
	
	passwordPanel = new JPanel();
	
	JLabel password = new JLabel("password");
	passwordPanel.add(password);
		
    JTextField textFieldpsw = new JTextField(20);
	passwordPanel.add(textFieldpsw);
	passwordPanel.setBackground(Color.WHITE);
	passwordPanel.setMaximumSize(new Dimension(larghezza/3, 50));
	loginPanel.add(passwordPanel);
	loginPanel.add(Box.createRigidArea(new Dimension(0,15)));
		
	
	JPanel btnLoginPanel = new JPanel();
	JButton btnLogin = new JButton("Login");
	
	btnLogin.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			LoginBean lb = new LoginBean();
			lb.setUsername(textFieldema.getText());
			lb.setPassword(textFieldpsw.getText());
			try {
				lb.validate();
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//System.out.println("lemail e" + textFieldema.getText());
		}
		
	});
	
	
	btnLoginPanel.add(btnLogin);
	btnLoginPanel.setBackground(Color.WHITE);
	btnLoginPanel.setMaximumSize(new Dimension(75, 15));
	loginPanel.add(btnLoginPanel);
	loginPanel.add(Box.createRigidArea(new Dimension(0,30)));
	
	JLabel or = new JLabel("Or");
	loginPanel.add(or, BorderLayout.CENTER);
	loginPanel.add(Box.createRigidArea(new Dimension(0,30)));
	
	JPanel registrationPanel = new JPanel();
	registrationPanel.setBackground(Color.WHITE);
	JButton btnRegistration = new JButton("Registration");
	
	registrationPanel.add(btnRegistration, BorderLayout.CENTER);
	registrationPanel.setBackground(Color.WHITE);
	loginPanel.add(registrationPanel);
	panel.add(loginPanel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	frame.setVisible(true);
	}
}
