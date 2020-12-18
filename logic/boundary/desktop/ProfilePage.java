package boundary.desktop;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProfilePage extends HomeGraphicInterface{
	public JPanel profilePane = new JPanel();

	public void setProfilePage() {
		
		frame.repaint();
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    panel.remove(4);
		profilePane.setLayout(new BoxLayout(profilePane, BoxLayout.Y_AXIS));
		profilePane.setBackground(Color.WHITE);
		
		
		subOptionPanel = new JPanel();
		subOptionPanel.setBackground(Color.WHITE);
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
	
		JLabel settings = new JLabel("Settings");
		settings.setFont(new Font("Verdana", Font.PLAIN, 18));	
		settings.setCursor(new Cursor(Cursor.HAND_CURSOR));
		subOptionPanel.add(settings);
		subOptionPanel.setMaximumSize(new Dimension(panel.getMaximumSize().width, settings.getMaximumSize().height+15));
		profilePane.add(subOptionPanel);
		
		
		settings.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				setFont(settings);	
				setSettings();
				System.out.println("Home clicked");
		        }
		});
			
		profilePane.setPreferredSize(new Dimension(panel.getMaximumSize().width, panel.getMaximumSize().height/2));
		
		panel.add(profilePane);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	
	public void setSettings() {

		profilePane.add(Box.createRigidArea(new Dimension(0,10)));
		JLabel name = new JLabel("name");
		profilePane.add(name);	
		JLabel surname = new JLabel("surname");
		profilePane.add(surname);
		JLabel email = new JLabel("E-mail");
		profilePane.add(email);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
