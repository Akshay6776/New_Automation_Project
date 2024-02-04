
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "firefox";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome": 
			System.out.println("Launch chrome browser");
			break;
		case "firefox": 
			System.out.println("Launch firefox browser");
			break;
		case "edge": 
			System.out.println("Launch edge browser");	
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + browser);
		}

	}}


