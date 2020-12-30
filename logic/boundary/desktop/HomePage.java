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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import controller.InterfaceBean;
import controller.JSONNotFound;

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
		
		
		List<String> cityList = addCity();
		String[] lineArray1 = countryList.toArray(new String[]{});
	    final JComboBox<String> cit = new JComboBox<String>(lineArray1);
		
		
	    //String[] cityList = { "Select a City","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"};

	    //final JComboBox<String> cit = new JComboBox<String>(cityList);
	    
	    
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
				city = (String) cit.getSelectedItem();
				country = (String) cou.getSelectedItem();
				address = textField.getSelectedText();
				InterfaceBean interfaceBean = new InterfaceBean(country, city, address);
				
				try {
					try {
						interfaceBean.validate();
					} catch (JSONNotFound e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
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
	
	private List<String> addCity() {
		List<String> city = new ArrayList<String>();
		   
	    JSONArray json;
		try {
			json = readJsonFromUrl("http://api.worldbank.org/v2/country?format=json&per_page=304");
			JSONArray a = (JSONArray) json.get(1);
			for(int i = 0; i <= a.length()-1; i++) {
				JSONObject o = (JSONObject) a.getJSONObject(i);
				if(!o.get("capitalCity").equals("")) {
					System.out.println(o.get("name"));
					city.add((String) o.get("name"));
				}
		    
			}
		} catch (IOException | JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return city;
	}

	public List<String> addCountry() throws IOException {
	    List<String> country = new ArrayList<String>();
	   
	    JSONArray json;
		try {
			json = readJsonFromUrl("http://api.worldbank.org/v2/country?format=json&per_page=304");
			JSONArray a = (JSONArray) json.get(1);
			for(int i = 0; i <= a.length()-1; i++) {
				JSONObject o = (JSONObject) a.getJSONObject(i);
				if(!o.get("capitalCity").equals("")) {
					System.out.println(o.get("name"));
					country.add((String) o.get("name"));
				}
		    
			}
		} catch (IOException | JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return country;
		
	}
		
		public static JSONArray readJsonFromUrl(String url) throws IOException, JSONException {
		    InputStream is = new URL(url).openStream();
		    try {
		      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
		      String jsonText = readAll(rd);
		      JSONArray json = new JSONArray(jsonText);
		      return json;
		    } finally {
		      is.close();
		    }
		  }
		
		private static String readAll(Reader rd) throws IOException {
		    StringBuilder sb = new StringBuilder();
		    int cp;
		    while ((cp = rd.read()) != -1) {
		      sb.append((char) cp);
		    }
		    return sb.toString();
		  }
	
}
