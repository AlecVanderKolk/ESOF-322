import java.util.*;
import java.io.*;
public class Algorithm {
	private String storeType;
	Algorithm(){
		storeType = "default";
	}
	Algorithm(String st){
		this.storeType = st;
	}
	
	
	public void store(String data, String type){
		FileWriter f;
		BufferedWriter b;
		try {
			f = new FileWriter("output.txt", true);
			b = new BufferedWriter(f);
			PrintWriter p = new PrintWriter(b);
			
			switch (type){
			case "t":
				p.println("data");
				System.out.println(data + " stored via table store.");
				break;
			case "d":
				p.println("data");
				System.out.println(data + " stored via document store.");
				break;
			case "n":
				p.println("data");
				System.out.println(data + " stored via node store.");
			default:
				p.println("data");
				System.out.println(data + " stored.");
				break;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public String getStoreType() {
		return storeType;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}
}
