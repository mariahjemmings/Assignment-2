



public class AsteriskLogger implements Logger {
	
	
	

	
	public void Log(String Log) {
		
		System.out.println("***"+ Log +"***");
		
		
	}

	
	public void Error(String Error) {
		
		System.out.println("****************"+
		                    '\n' +"***" + "Error:" + Error +"***"+
		                    '\n'+ "****************");
		
		
		
		
	}

}
