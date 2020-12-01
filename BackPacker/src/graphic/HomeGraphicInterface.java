package graphic;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class HomeGraphicInterface extends Application{
	
	protected static JFrame frame;
	protected static JLabel label;
	protected static JLabel settings;
	protected static JPanel panel; //pannello principale
	protected static JPanel imagePanel;//pannello immagine in alto
	protected static JPanel optionPanel;//pannello barra di stato
	protected static JPanel countryPanel;//pannello selezione citt�
	protected static JPanel cityPanel;//pannello inserimento via
	protected static JPanel addressPanel;//pannello bottoe di ricerca
	protected static JPanel searchPanel;
	protected static JPanel profilePanel;
	protected static JPanel subOptionPanel;
	protected static JPanel InformationPanel;
	protected static int larghezza;
	protected static int altezza;
	

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		frame = new JFrame("la mia prma prova");
		frame.setBackground(Color.WHITE);
///////////////////////////////////////////////////////////
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		
        imagePanel = new JPanel();
        
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		larghezza = (int) screenSize.getWidth();
		altezza = (int) screenSize.getHeight();
		
		panel.setMaximumSize(new Dimension(larghezza, altezza));
		
		label = new JLabel();
		ImageIcon image = new ImageIcon("resources/oggetti.jpg");
		ImageIcon imageIcon = new ImageIcon(image.getImage().getScaledInstance(larghezza, image.getIconHeight()/2, Image.SCALE_AREA_AVERAGING));
		System.out.println(imageIcon.getIconWidth() +"," +  imageIcon.getIconHeight());
		label.setMaximumSize(new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight()));

		imagePanel.setMaximumSize(new Dimension(larghezza, (imageIcon.getIconHeight())));
		label.setIcon(imageIcon);
		imagePanel.setBackground(Color.WHITE);
		imagePanel.add(label);
		panel.add(imagePanel);
		panel.add(Box.createRigidArea(new Dimension(0,5)));
		/////////////////////////////////////////////////////////////
		optionPanel = new JPanel();
		optionPanel.setLayout(new BoxLayout(optionPanel, BoxLayout.X_AXIS));
		optionPanel.add(Box.createRigidArea(new Dimension(15,0)));
				
		JLabel Home = new JLabel("Home");
		System.out.println("optionPanel, " + optionPanel.getMaximumSize().width);
		System.out.println("Home, " + Home.getMaximumSize().width);
		Home.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		
		
		Home.setCursor(new Cursor(Cursor.HAND_CURSOR));
		

		Home.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				setFont(Home);
				
				new setScene().setHome();
				System.out.println("Home clicked");
		        }
		});
		optionPanel.add(Home);
		optionPanel.add(Box.createRigidArea(new Dimension(15,0)));
		
		JLabel Result = new JLabel("Result");
		Result.setFont(new Font("Verdana", Font.PLAIN, 18));
		System.out.println("Result, " + Result.getMaximumSize().width);
		Result.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Result.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				 setFont(Result);
				 System.out.println("Result clicked");
		        }
		});
		optionPanel.add(Result);
		optionPanel.add(Box.createRigidArea(new Dimension(15,0)));
		
		JLabel Profile = new JLabel("Profile");
		Profile.setFont(new Font("Verdana", Font.PLAIN, 18));
		System.out.println("Profile, " + Profile.getMaximumSize().width);
		Profile.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Profile.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				 setFont(Profile);
				 new setScene().setProfile();
				 
				 System.out.println("Profile clicked");
		        }
		});
		optionPanel.add(Profile);
		
		
		JLabel Login = new JLabel("Login");
		
		//optionPanel.add(Box.createRigidArea(new Dimension(15,0)));
		optionPanel.add(Box.createRigidArea(new Dimension((larghezza - Home.getMaximumSize().width - Result.getMaximumSize().width 
				- Profile.getMaximumSize().width)- Login.getMaximumSize().width -75, 0)));//SISTEMARE
		Login.setFont(new Font("Verdana", Font.PLAIN, 18));
		System.out.println("Login, " + Login.getMaximumSize().width);
		Login.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Login.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				 setFont(Login);
				 System.out.println("Login clicked");
		        }
		});
		optionPanel.add(Login);
		//optionPanel.add(Box.createRigidArea(new Dimension(15,0)));
		System.out.println(Login.getHorizontalTextPosition());
		System.out.println(Home.getHorizontalTextPosition());
		

		optionPanel.setBackground(Color.WHITE);
		optionPanel.setMaximumSize(new Dimension(larghezza, Home.getHeight()+10));
		//optionPanel.setBorder(new LineBorder(Color.BLACK));
		System.out.println("pannello" + optionPanel.getHeight());
		panel.add(optionPanel);
		panel.add(Box.createRigidArea(new Dimension(0,30)));
		
	////////////////////////////////////////////////////////////////////////
		
		
		countryPanel = new JPanel();
		countryPanel.setLayout(new BoxLayout(countryPanel, BoxLayout.X_AXIS));
		
		
		
	    String[] country = { "Select a Country","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"};

	    final JComboBox<String> cou = new JComboBox<String>(country);

	    cou.setVisible(true);
	    countryPanel.add(cou);
	    countryPanel.add(Box.createRigidArea(new Dimension(5,0)));
	    	    
	    countryPanel.setMaximumSize(new Dimension(larghezza/4, cou.getHeight()));
	    countryPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	    countryPanel.setBackground(Color.WHITE);
	    panel.add(countryPanel);
	    panel.add(Box.createRigidArea(new Dimension(0,30)));
	    
	    //////////////////////////////////////////////////////////////////////////
		cityPanel = new JPanel();
		cityPanel.setLayout(new BoxLayout(cityPanel, BoxLayout.X_AXIS));
		
		
		
	    String[] city = { "Select a City","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"};

	    final JComboBox<String> cit = new JComboBox<String>(city);

	    cit.setVisible(true);
	    cityPanel.add(cit);
	    cityPanel.add(Box.createRigidArea(new Dimension(5,0)));
	    	    
	    cityPanel.setMaximumSize(new Dimension(larghezza/4, cit.getHeight()));
	    cityPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	    cityPanel.setBackground(Color.WHITE);
	    panel.add(cityPanel);
	    panel.add(Box.createRigidArea(new Dimension(0,30)));
		////////////////////////////////////////////////////////
	    addressPanel = new JPanel();
	    
	    
	    JLabel ttl = new JLabel("insert address");
	    ttl.setVisible(true);
	    addressPanel.add(ttl);
		
		JTextField textField = new JTextField(25);
		textField.setVisible(true);
		addressPanel.add(textField);
		addressPanel.setBackground(Color.WHITE);
		addressPanel.setMaximumSize(new Dimension(larghezza/3, cou.getHeight()));
		panel.add(addressPanel);
		panel.add(Box.createRigidArea(new Dimension(0,30)));
		
		///////////////////////////////////////
		searchPanel = new JPanel();
		JButton btnSearch = new JButton("Search");
		
		searchPanel.add(btnSearch);
		searchPanel.setBackground(Color.WHITE);
		panel.add(searchPanel);
		
		
		panel.setBackground(Color.WHITE);
		frame.add(panel);
		System.out.println(larghezza + "," + altezza);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(larghezza,altezza);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		
			
		
	}
		
	protected void setFont(JLabel label) {
		for(int i = 0; i <= optionPanel.getComponentCount()-1; i++) {
			if(optionPanel.getComponent(i) instanceof JLabel){
				Map attributes = label.getFont().getAttributes();
				attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
				label.setFont(label.getFont().deriveFont(attributes));
			}
			else {
				Map attributes = optionPanel.getComponent(i+1).getFont().getAttributes();
				attributes.put(TextAttribute.UNDERLINE, -1);
				optionPanel.getComponent(i+1).setFont(optionPanel.getComponent(i+1).getFont().deriveFont(attributes));
			}
		}
		
	}
}