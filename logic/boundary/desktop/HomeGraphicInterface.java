package boundary.desktop;

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
import java.awt.font.TextAttribute;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.json.JSONException;

import controller.InterfaceBean;
import controller.JSONNotFound;

public class HomeGraphicInterface extends Application implements ActionListener{
	
	protected static JFrame frame;
	protected static JLabel imageLabel;
	protected static JLabel settings;
	protected static JPanel principalPanel; //pannello principale
	protected static JPanel imagePanel;//pannello immagine in alto
	protected static JPanel optionPanel;//pannello barra di stato
	protected static JPanel countryPanel;//pannello selezione città
	protected static JPanel cityPanel;//pannello inserimento via
	protected static JPanel addressPanel;//pannello bottoe di ricerca
	protected static JPanel searchPanel;
	protected static JPanel profilePanel;
	protected static JPanel subOptionPanel;
	protected static JPanel informationPanel;
	protected static JPanel usernamePanel;
	protected static JPanel passwordPanel;
	protected static JLabel Home;
	protected static int larghezza;
	protected static int altezza;
	public static setScene scene;
	public static String country;
	public static String city;
	public static String address;
	public static JComboBox<String> cou = null;
	public static final JComboBox<String> cit = null;
	public static JTextField textField;
	public static JTextField textFieldc;
	public static JTextField textFieldco;
	public static JPanel customPanel;
	public static String isError;
	
	

	public static void main(String[] args) {
		scene = new setScene();
		
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		frame = new JFrame("Backpacker");
		frame.setBackground(Color.WHITE);

        principalPanel = new JPanel();
        principalPanel.setLayout(new BoxLayout(principalPanel, BoxLayout.Y_AXIS));

		
        imagePanel = new JPanel();
        
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		larghezza = (int) screenSize.getWidth();
		altezza = (int) screenSize.getHeight();
		
		principalPanel.setMaximumSize(new Dimension(larghezza, altezza));
		
		imageLabel = new JLabel();
		ImageIcon image = new ImageIcon("resources/oggetti.jpg");
		ImageIcon imageIcon = new ImageIcon(image.getImage().getScaledInstance(larghezza, image.getIconHeight()/2, Image.SCALE_AREA_AVERAGING));
		System.out.println("bellaaaa" + imageIcon.getIconWidth() +"," +  imageIcon.getIconHeight());
		imageLabel.setMaximumSize(new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight()));

		imagePanel.setMaximumSize(new Dimension(larghezza, (imageIcon.getIconHeight())));
		imageLabel.setIcon(imageIcon);
		imagePanel.setBackground(Color.WHITE);
		imagePanel.add(imageLabel);
		principalPanel.add(imagePanel);
		principalPanel.add(Box.createRigidArea(new Dimension(0,5)));
		System.out.println("ciaoooo"+imagePanel.getMaximumSize().height);
		
		
		optionPanel = new JPanel();
		optionPanel.setLayout(new BoxLayout(optionPanel, BoxLayout.X_AXIS));
		optionPanel.add(Box.createRigidArea(new Dimension(15,0)));
				
		Home = new JLabel("Home");
		Home.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		
		
		Home.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Home.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				setFont(Home);
				try {
					new HomePage().setHomePage();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
				// scene.getSingletonInstance().setResult();
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
				 //scene.getSingletonInstance().setProfile();
				 new ProfilePage().setProfilePage();
		        }
		});
		optionPanel.add(Profile);
		
		
		JLabel Login = new JLabel("Login");
		
		//optionPanel.add(Box.createRigidArea(new Dimension(15,0)));
		Login.setFont(new Font("Verdana", Font.PLAIN, 18));
		System.out.println("Login, " + Login.getMaximumSize().width);
		Login.setCursor(new Cursor(Cursor.HAND_CURSOR));
		Login.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				 setFont(Login);
				 //scene.getSingletonInstance().setLogin();
				 new LoginPage().setLoginPage();
				 System.out.println("Login clicked");
		        }
		});
		optionPanel.add(Box.createRigidArea(new Dimension((larghezza - Home.getMaximumSize().width - Result.getMaximumSize().width 
				- Profile.getMaximumSize().width)- Login.getMaximumSize().width -75, 0)));//SISTEMARE
		
		optionPanel.add(Login);
		//optionPanel.add(Box.createRigidArea(new Dimension(15,0)));
		System.out.println(Login.getHorizontalTextPosition());
		System.out.println(Home.getHorizontalTextPosition());
		

		optionPanel.setBackground(Color.WHITE);
		//optionPanel.setMaximumSize(new Dimension(larghezza, Home.getMaximumSize().height+5));
		//optionPanel.setBorder(new LineBorder(Color.BLACK));
		System.out.println("pannello" + optionPanel.getHeight());
		principalPanel.add(optionPanel);
		principalPanel.add(Box.createRigidArea(new Dimension(0,30)));
		
	////////////////////////////////////////////////////////////////////////
		customPanel = new JPanel();
		customPanel.setLayout(new BoxLayout(customPanel, BoxLayout.Y_AXIS));
		customPanel.setBackground(Color.WHITE);
		
		countryPanel = new JPanel();
		countryPanel.setLayout(new BoxLayout(countryPanel, BoxLayout.X_AXIS));
		
		JLabel stringCountry = new JLabel("Country");
		countryPanel.add(stringCountry);
		countryPanel.add(Box.createRigidArea(new Dimension(5,0)));
		
		
		JLabel ttlll = new JLabel("insert country");
	    ttlll.setVisible(true);
	    countryPanel.add(ttlll);
		
		textFieldco = new JTextField(25);
		textFieldco.setVisible(true);
		countryPanel.add(textFieldco);
		countryPanel.setBackground(Color.WHITE);
		countryPanel.setMaximumSize(new Dimension(larghezza/3, 25));
	    countryPanel.add(Box.createRigidArea(new Dimension(5,0)));
	    	    
	    countryPanel.setMaximumSize(new Dimension(larghezza/2, 25));
	    countryPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	    countryPanel.setBackground(Color.WHITE);
	  
	    customPanel.add(countryPanel);
	    customPanel.add(Box.createRigidArea(new Dimension(0,30)));
	    
	    
		cityPanel = new JPanel();
		cityPanel.setLayout(new BoxLayout(cityPanel, BoxLayout.X_AXIS));
		
		
		JLabel ttll = new JLabel("insert city");
	    ttll.setVisible(true);
	    cityPanel.add(ttll);
		
		textFieldc = new JTextField(25);
		textFieldc.setVisible(true);
		cityPanel.add(textFieldc);
		cityPanel.setBackground(Color.WHITE);
		cityPanel.setMaximumSize(new Dimension(larghezza/3, 25));
		

	    cityPanel.add(Box.createRigidArea(new Dimension(5,0)));
	    	    
	    cityPanel.setMaximumSize(new Dimension(larghezza/4, 25));
	    cityPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	    cityPanel.setBackground(Color.WHITE);

	    customPanel.add(cityPanel);
	    customPanel.add(Box.createRigidArea(new Dimension(0,30)));
	    
	    addressPanel = new JPanel();
	    
	    
	    JLabel ttl = new JLabel("insert address");
	    ttl.setVisible(true);
	    addressPanel.add(ttl);
		
		textField = new JTextField(25);
		textField.setVisible(true);
		addressPanel.add(textField);
		addressPanel.setBackground(Color.WHITE);
		addressPanel.setMaximumSize(new Dimension(larghezza/3, 25));

		customPanel.add(addressPanel);
	    customPanel.add(Box.createRigidArea(new Dimension(0,30)));
		
		
		searchPanel = new JPanel();
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(this);
		
		searchPanel.add(btnSearch);
		searchPanel.setBackground(Color.WHITE);
		customPanel.add(searchPanel);
		
		principalPanel.add(customPanel);
	    
		
		
		principalPanel.setBackground(Color.WHITE);
		frame.add(principalPanel);
		System.out.println(larghezza + "," + altezza);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMaximumSize(new Dimension(larghezza,altezza));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		
			
		
	}

	

	public List<String> addCountry() throws IOException {
		BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\danie\\OneDrive\\Desktop\\Università\\ISPW\\Progetto Finale\\trunk\\resources\\Paesi.txt"));
	    List<String> country = new ArrayList<String>();
	    	try {
	    	  String line = null;
	    	  while (( line = input.readLine()) != null){
	    	    country.add(line);
	    	  }
	    	}

	    	catch (FileNotFoundException e) {
	    	    System.err.println("Error, file " + "C:\\Users\\danie\\OneDrive\\Desktop\\Università\\ISPW\\Progetto Finale\\trunk\\resources\\Paesi.txt" + " didn't exist.");
	    	}
	    	finally {
	    		input.close();
	    	} 
	   
		return country;
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
        if (action.equals("Search")) {
            System.out.println("Yes Button pressed!");
            country = textFieldco.getText();
            city = textFieldc.getText();
			address = textField.getText();
			InterfaceBean interfaceBean = new InterfaceBean(country, city, address);
			
				try {
					interfaceBean.validate();
				} catch (IOException | JSONException e3) {
					e3.printStackTrace();
				} catch (JSONNotFound e1) {
				    try {
				    	isError = e1.getMessage();
						new HomePage().setHomePage();
					} catch (IOException e2) {
						e2.printStackTrace();
					}
				   
				}
        }
        else if (action.equals("No")) {
            System.out.println("No Button pressed!");
        }
		
	}
}
