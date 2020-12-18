package boundary.desktop;

public class setScene extends HomeGraphicInterface{
	
	private static setScene instance = null;

	
	public synchronized setScene getSingletonInstance() {
		if (setScene.instance == null)
			setScene.instance = new setScene();		
		return instance;
	}
}
