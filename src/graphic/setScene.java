package graphic;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import javafx.application.Application;
import javafx.stage.Stage;

public class setScene extends HomeGraphicInterface{
	
	private static setScene instance = null;
	
	public void setHome() {
		frame.repaint();
        JFrame.setDefaultLookAndFeelDecorated(true);
        panel.removeAll();
        imagePanel.setVisible(true);
        optionPanel.setVisible(true);
        countryPanel.setVisible(true);
        cityPanel.setVisible(true);
        addressPanel.setVisible(true);
        searchPanel.setVisible(true);
        panel.add(imagePanel);
        panel.add(Box.createRigidArea(new Dimension(0,5)));
        panel.add(optionPanel);
        panel.add(Box.createRigidArea(new Dimension(0,30)));
        panel.add(countryPanel);
        panel.add(Box.createRigidArea(new Dimension(0,30)));
        panel.add(cityPanel);
        panel.add(Box.createRigidArea(new Dimension(0,30)));
        panel.add(addressPanel);
        panel.add(Box.createRigidArea(new Dimension(0,30)));
        panel.add(searchPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
	}
	
		
	public void setProfile(){
		frame.repaint();
        JFrame.setDefaultLookAndFeelDecorated(true);
        panel.removeAll();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(imagePanel);
        panel.add(Box.createRigidArea(new Dimension(0,5)));
       // optionPanel.setMaximumSize(new Dimension(larghezza, Home.getMaximumSize().height+5));
        panel.add(optionPanel);
        panel.add(Box.createRigidArea(new Dimension(0,15)));
       
				
		profilePanel = new JPanel();
		
		profilePanel.setLayout(new BoxLayout(profilePanel, BoxLayout.Y_AXIS));
		
		subOptionPanel = new JPanel();
		subOptionPanel.setLayout(new BoxLayout(subOptionPanel, BoxLayout.X_AXIS));		
		JLabel savedRoutes = new JLabel("savedRoutes");
		savedRoutes.setFont(new Font("Verdana", Font.PLAIN, 18));		
		savedRoutes.setCursor(new Cursor(Cursor.HAND_CURSOR));
		savedRoutes.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				//setFont(savedRoutes);
				System.out.println("Home clicked");
		        }
		});	
		subOptionPanel.add(savedRoutes);
		subOptionPanel.add(Box.createRigidArea(new Dimension(15,0)));

		subOptionPanel.add(Box.createRigidArea(new Dimension(15,0)));		
		JLabel settings = new JLabel("Settings");
		settings.setFont(new Font("Verdana", Font.PLAIN, 18));	
		settings.setCursor(new Cursor(Cursor.HAND_CURSOR));

		settings.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				setFont(settings);	
				setSettings();
				System.out.println("Home clicked");
		        }
		});
			
		subOptionPanel.add(settings);
		profilePanel.add(Box.createRigidArea(new Dimension(0,10)));
		profilePanel.add(subOptionPanel);
		
		informationPanel = new JPanel();
		informationPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		profilePanel.add(informationPanel);
		
	
		panel.add(profilePanel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		
        
	}
	
	
	public void setLogin() {
		frame.repaint();
        JFrame.setDefaultLookAndFeelDecorated(true);
        panel.removeAll();
        panel.add(imagePanel);
        panel.add(Box.createRigidArea(new Dimension(0,5)));
        panel.add(optionPanel);
        panel.add(Box.createRigidArea(new Dimension(0,30)));
        
        usernamePanel = new JPanel();
	    
	    
	    JLabel username = new JLabel("username or e-mail");
	   // login.setVisible(true);
	    usernamePanel.add(username);
		
		JTextField textFieldurn = new JTextField(20);
		//textFieldLogin.setVisible(true);
		usernamePanel.add(textFieldurn);
		
		usernamePanel.setBackground(Color.WHITE);
		usernamePanel.setMaximumSize(new Dimension(larghezza/3, 50));
		panel.add(usernamePanel);
		panel.add(Box.createRigidArea(new Dimension(0,15)));
		
		passwordPanel = new JPanel();
		
		JLabel password = new JLabel("password");
		passwordPanel.add(password);
			
	    JTextField textFieldpsw = new JTextField(20);
		passwordPanel.add(textFieldpsw);
		passwordPanel.setBackground(Color.WHITE);
		passwordPanel.setMaximumSize(new Dimension(larghezza/3, 50));
		panel.add(passwordPanel);
		panel.add(Box.createRigidArea(new Dimension(0,15)));
			
		
		JPanel btnLoginPanel = new JPanel();
		JButton btnLogin = new JButton("Login");
		
		btnLoginPanel.add(btnLogin);
		btnLoginPanel.setBackground(Color.WHITE);
		btnLoginPanel.setMaximumSize(new Dimension(75, 15));
		panel.add(btnLoginPanel);
		panel.add(Box.createRigidArea(new Dimension(0,30)));
		
		JLabel or = new JLabel("Or");
		panel.add(or, BorderLayout.CENTER);
		panel.add(Box.createRigidArea(new Dimension(0,30)));
		
		JPanel registrationPanel = new JPanel();
		registrationPanel.setBackground(Color.WHITE);
		JButton btnRegistration = new JButton("Registration");
		
		registrationPanel.add(btnRegistration, BorderLayout.CENTER);
		registrationPanel.setBackground(Color.WHITE);
		panel.add(registrationPanel);
	}
	
	
	public void setSettings() {
		frame.repaint();
        JFrame.setDefaultLookAndFeelDecorated(true);
        panel.removeAll();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(imagePanel);
        panel.add(Box.createRigidArea(new Dimension(0,5)));
        panel.add(optionPanel);
        panel.add(Box.createRigidArea(new Dimension(0,15)));
       
				
		profilePanel = new JPanel();
		profilePanel.setMaximumSize(new Dimension(larghezza/2, altezza - imagePanel.getMaximumSize().height-optionPanel.getMaximumSize().height-175));
		profilePanel.setLayout(new BoxLayout(profilePanel, BoxLayout.Y_AXIS));
		

		profilePanel.add(subOptionPanel);
		
		informationPanel = new JPanel();
		informationPanel.setMaximumSize(new Dimension(profilePanel.getMaximumSize().width, profilePanel.getMaximumSize().height));
		informationPanel.setLayout(new BoxLayout(informationPanel, BoxLayout.Y_AXIS));
		informationPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		 JLabel name = new JLabel("name");
//		   // login.setVisible(true);
		    informationPanel.add(name);
				//profilePanel.add(name);	
			//
			
			JLabel surname = new JLabel("surname");
			informationPanel.add(surname);
			//profilePanel.add(surname);
			JLabel email = new JLabel("E-mail");
			
			informationPanel.add(email);
		//profilePanel.add(email);
		//profilePanel.add(Box.createRigidArea(new Dimension(0,15)));
		informationPanel.setBackground(Color.WHITE);
		profilePanel.add(informationPanel);
		profilePanel.add(Box.createRigidArea(new Dimension(0,15)));
		panel.add(profilePanel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		
	}
	
	public synchronized setScene getSingletonInstance() {
		if (setScene.instance == null)
			setScene.instance = new setScene();		
		return instance;
	}


	public void setResult() {
		
		
	}
	
//	label = new JLabel();
//	ImageIcon image = new ImageIcon("resources/oggetti.jpg");
//	ImageIcon imageIcon = new ImageIcon(image.getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING));
//	System.out.println(imageIcon.getIconWidth() +"," +  imageIcon.getIconHeight());
//	label.setMaximumSize(new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight()));
//
//	
//	label.setIcon(imageIcon);
//	profilePanel.add(Box.createRigidArea(new Dimension(15,0)));
//	profilePanel.add(label, BorderLayout.NORTH);
	
}
