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
        panel.add(optionPanel);
        panel.add(countryPanel);
        panel.add(cityPanel);
        panel.add(addressPanel);
        panel.add(searchPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
	}
	
		
	public void setProfile(){
		frame.repaint();
        JFrame.setDefaultLookAndFeelDecorated(true);
        panel.removeAll();
        countryPanel.setVisible(false);
        cityPanel.setVisible(false);
        addressPanel.setVisible(false);
        searchPanel.setVisible(false);
        panel.add(imagePanel);
        panel.add(Box.createRigidArea(new Dimension(0,5)));
        optionPanel.setMaximumSize(new Dimension(larghezza, 30));
        panel.add(optionPanel);
        panel.add(Box.createRigidArea(new Dimension(0,5)));
       
		
		
		
		
//		label = new JLabel();
//		ImageIcon image = new ImageIcon("resources/oggetti.jpg");
//		ImageIcon imageIcon = new ImageIcon(image.getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING));
//		System.out.println(imageIcon.getIconWidth() +"," +  imageIcon.getIconHeight());
//		label.setMaximumSize(new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight()));
//
//		
//		label.setIcon(imageIcon);
//		profilePanel.add(Box.createRigidArea(new Dimension(15,0)));
//		profilePanel.add(label, BorderLayout.NORTH);
		
				
		JPanel profilePanel = new JPanel();
		profilePanel.setLayout(new BoxLayout(profilePanel, BoxLayout.Y_AXIS));
		profilePanel.setMaximumSize(new Dimension(larghezza-150,altezza-imagePanel.getMaximumSize().height-optionPanel.getMaximumSize().height-30));
		//profilePanel.add(Box.createRigidArea(new Dimension(15,0)));
		//profilePanel.add(panel9);
//		
//		
		JPanel subOptionPanel = new JPanel();
		subOptionPanel.setLayout(new BoxLayout(subOptionPanel, BoxLayout.X_AXIS));
//		
//		
		JLabel savedRoutes = new JLabel("savedRoutes");
		savedRoutes.setFont(new Font("Verdana", Font.PLAIN, 18));
//		
		savedRoutes.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		
//
		savedRoutes.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				//setFont(savedRoutes);
				System.out.println("Home clicked");
		        }
		});
//		
		subOptionPanel.add(savedRoutes);
		subOptionPanel.add(Box.createRigidArea(new Dimension(15,0)));
//		
//		
		JLabel favouritesFood = new JLabel("Favourites Food");
		favouritesFood.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		favouritesFood.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		
//
		favouritesFood.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				//setFont(favouritesFood);
				System.out.println("Home clicked");
		        }
		});
//		
		subOptionPanel.add(favouritesFood);
		subOptionPanel.add(Box.createRigidArea(new Dimension(15,0)));
//		
//		
		JLabel settings = new JLabel("Settings");
		settings.setFont(new Font("Verdana", Font.PLAIN, 18));
//		
		settings.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		
//
		settings.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				//setFont(settings);
//				
				System.out.println("Home clicked");
		        }
		});
		
		subOptionPanel.setMaximumSize(new Dimension(savedRoutes.getMaximumSize().width + favouritesFood.getMaximumSize().width + settings.getMaximumSize().width + 30, savedRoutes.getMaximumSize().height + 10));
//		
		subOptionPanel.add(settings);
		
		
		profilePanel.add(Box.createRigidArea(new Dimension(15, 5)));
//		
		
		profilePanel.add(subOptionPanel);
		JPanel informationPanel = new JPanel();
		informationPanel.setMaximumSize(new Dimension(profilePanel.getMaximumSize().width - 20, profilePanel.getMaximumSize().height-20));
		informationPanel.setBackground(Color.WHITE);
		informationPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		profilePanel.add(informationPanel);
		panel.add(profilePanel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		
        
	}
}
