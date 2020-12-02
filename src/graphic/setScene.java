package graphic;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javafx.application.Application;
import javafx.stage.Stage;

public class setScene extends HomeGraphicInterface{
	
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
//        countryPanel.setVisible(false);
//        cityPanel.setVisible(false);
//        addressPanel.setVisible(false);
//        searchPanel.setVisible(false);
        panel.add(imagePanel);
        panel.add(Box.createRigidArea(new Dimension(0,5)));
       // optionPanel.setMaximumSize(new Dimension(larghezza, Home.getMaximumSize().height+5));
        panel.add(optionPanel);
        panel.add(Box.createRigidArea(new Dimension(0,15)));
       
				
		profilePanel = new JPanel();
		profilePanel.setLayout(new BoxLayout(profilePanel, BoxLayout.Y_AXIS));
		
		JPanel subOptionPanel = new JPanel();
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
		
		JLabel favouritesFood = new JLabel("Favourites Food");
		favouritesFood.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		favouritesFood.setCursor(new Cursor(Cursor.HAND_CURSOR));

		favouritesFood.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				setFont(favouritesFood);
				System.out.println("Home clicked");
		        }
		});	
		subOptionPanel.add(favouritesFood);
		subOptionPanel.add(Box.createRigidArea(new Dimension(15,0)));		
		JLabel settings = new JLabel("Settings");
		settings.setFont(new Font("Verdana", Font.PLAIN, 18));	
		settings.setCursor(new Cursor(Cursor.HAND_CURSOR));

		settings.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				setFont(settings);				
				System.out.println("Home clicked");
		        }
		});
			
		subOptionPanel.add(settings);
		profilePanel.add(Box.createRigidArea(new Dimension(0,10)));
		profilePanel.add(subOptionPanel);
		
		JPanel informationPanel = new JPanel();
		informationPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		profilePanel.add(Box.createRigidArea(new Dimension(0,15)));
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
        
        loginPanel = new JPanel();
	    
	    
	    JLabel login = new JLabel("insert login");
	    login.setVisible(true);
	    loginPanel.add(login);
		
		JTextField textFieldLogin = new JTextField(25);
		textFieldLogin.setVisible(true);
		loginPanel.add(textFieldLogin);
		loginPanel.setBackground(Color.WHITE);
		//loginPanel.setMaximumSize(new Dimension(larghezza/3, 50));
		panel.add(loginPanel);
		panel.add(Box.createRigidArea(new Dimension(0,30)));
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
