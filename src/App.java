
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is the result of the Asterisk Logger Interface Log Method: ");
		
		Logger logger = new AsteriskLogger(); 
		logger.Log("Hello");
		
		System.out.println('\n');
		
		System.out.println("This is the result of the Asterisk Logger Interface Error Method: ");
		
		
		logger.Error("Hello");
		
		System.out.println("This is the result of the Spaced Logger Interface Log Method: ");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.Log("Hello");
		
		System.out.println('\n');
		
		System.out.println("This is the result of the Spaced Logger Interface Error Method: ");
		
		logger2.Error("Hello");
			
		}

	}


