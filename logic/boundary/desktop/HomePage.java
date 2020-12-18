package boundary.desktop;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.InterfaceBean;

public class HomePage extends HomeGraphicInterface{

	public void setHomePage() throws IOException {
		frame.repaint();
        JFrame.setDefaultLookAndFeelDecorated(true);
        panel.remove(4);

        JPanel all = new JPanel();
		all.setLayout(new BoxLayout(all, BoxLayout.Y_AXIS));
		all.setBackground(Color.WHITE);
		
		countryPanel = new JPanel();
		countryPanel.setLayout(new BoxLayout(countryPanel, BoxLayout.X_AXIS));
		
		JLabel stringCountry = new JLabel("Country");
		countryPanel.add(stringCountry);
		countryPanel.add(Box.createRigidArea(new Dimension(5,0)));
		
		List<String> countryList = addCountry();
		String[] lineArray = countryList.toArray(new String[]{});
	    final JComboBox<String> cou = new JComboBox<String>(lineArray);
	   
	    
	    cou.setVisible(true);
	    countryPanel.add(cou);
	    countryPanel.add(Box.createRigidArea(new Dimension(5,0)));
	    	    
	    countryPanel.setMaximumSize(new Dimension(larghezza/2, cou.getHeight()));
	    countryPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	    countryPanel.setBackground(Color.WHITE);
	    //panel.add(countryPanel);
	    //panel.add(Box.createRigidArea(new Dimension(0,30)));
	    all.add(countryPanel);
	    all.add(Box.createRigidArea(new Dimension(0,30)));
	    
	    
	    //////////////////////////////////////////////////////////////////////////
		cityPanel = new JPanel();
		cityPanel.setLayout(new BoxLayout(cityPanel, BoxLayout.X_AXIS));
		
		
		
	    String[] cityList = { "Select a City","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"};

	    final JComboBox<String> cit = new JComboBox<String>(cityList);
	    
	    
	    cit.setVisible(true);
	    cityPanel.add(cit);
	    cityPanel.add(Box.createRigidArea(new Dimension(5,0)));
	    	    
	    cityPanel.setMaximumSize(new Dimension(larghezza/4, cit.getHeight()));
	    cityPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	    cityPanel.setBackground(Color.WHITE);
//	    panel.add(cityPanel);
//	    panel.add(Box.createRigidArea(new Dimension(0,30)));
	    all.add(cityPanel);
	    all.add(Box.createRigidArea(new Dimension(0,30)));
	    
	    
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
//		panel.add(addressPanel);
//		panel.add(Box.createRigidArea(new Dimension(0,30)));
		all.add(addressPanel);
	    all.add(Box.createRigidArea(new Dimension(0,30)));
		
		///////////////////////////////////////
		searchPanel = new JPanel();
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InterfaceBean interfaceBean = new InterfaceBean();
				city = (String) cit.getSelectedItem();
				country = (String) cou.getSelectedItem();
				interfaceBean.validate();				
			}
		});
		
		searchPanel.add(btnSearch);
		searchPanel.setBackground(Color.WHITE);
		//panel.add(searchPanel);
		all.add(searchPanel);
		
		panel.add(all);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	
}
