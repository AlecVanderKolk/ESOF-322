import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class DatabaseSoftware {
	//protected String software;
	protected String algorithm;
	
	DatabaseSoftware(){
		//software = "database";
		algorithm = "algorithm";
	}
	DatabaseSoftware(String alg){
		//software=sw;
		algorithm = alg;
	}
	/*public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}*/
	public String getStoreStrategy() {
		return algorithm;
	}
	public void setStoreStrategy(String algorithm) {
		this.algorithm = algorithm;
	}
	public void userInterface(){
		boolean cont = true;
		boolean change = false;
		String userVar = "n";
		String tempAlg = "";
		Scanner key = new Scanner(System.in);
		while(cont){
			System.out.println("Change storage method?");
			System.out.println("Type y to change algorithm or n to continue with current method.");
			userVar = key.nextLine();
			if(userVar.compareToIgnoreCase("y")==0){
				change=true;
			} else if(userVar.compareToIgnoreCase("n")==0){
				change=false;
			} else{
				System.out.println("Please type a valid option.");
				System.out.println();
				continue;
			}
			if(change){
				System.out.println("Select storage method:");
				System.out.println("Type t for table store, d for document store, or n for node store.");
				tempAlg = key.nextLine();
				switch (tempAlg){
				case "t":
					this.setStoreStrategy("Table Store");
					Algorithm table = new Algorithm();
					break;
				case "d":
					this.setStoreStrategy("Document Store");
					break;
				case "n":
					this.setStoreStrategy("Node Store");
					break;
				default:
					break;
				}
			}
			String c;
			System.out.println("Type data to be added or type STOP to end data entry.");
			c = key.nextLine();
			if(c.compareToIgnoreCase("stop")==0){
				break;
			}else{
				//store
			}
		}
	}
}

