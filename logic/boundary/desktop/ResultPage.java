package boundary.desktop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ResultBean;

public class ResultPage extends HomeGraphicInterface{

	private static ResultPage instance = null;
	
	public void setResultPage(){
		
		frame.repaint();
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    
	    customPanel.removeAll();
	    
	    JPanel itineraryPanel = new JPanel();
	    for(int i = 0; i < new ResultBean().getInstance().getItinerary().size(); i++) {
	    	JLabel itinerary = new JLabel(new ResultBean().getInstance().getItinerary().get(i).toString());
	    	itineraryPanel.add(itinerary);
	    }
	    
	    customPanel.add(itineraryPanel);
	    principalPanel.add(customPanel);
	    
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	

	public synchronized ResultPage getSingletonInstance() {
		if (ResultPage.instance == null)
			ResultPage.instance = new ResultPage();		
		return instance;
	}
	
}
