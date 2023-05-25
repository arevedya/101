import java.rmi.Naming;

public class Server{
	
	public static void main(String[] args){
	
		try{
			ServerImpl serverImpl = new ServerImpl();
			Naming.rebind("Server", serverImpl);
			
			System.out.println("Server Started....");
		
		}catch(Exception e){
			System.out.println("Exception Occurred At Server!" + e.getMessage());
		}
	}
	
	
}

// javac *.java
// rmiregistry

// java Server

// java Client
