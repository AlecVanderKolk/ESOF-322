import java.util.*;
public class Main {

	public static void main(String[] args) {
		String tempDB = "";
		Scanner keyd = new Scanner(System.in);
		System.out.println("Select database software.");
		System.out.println("Type r for Relational, n for NoSQL, or g for Graph");
		tempDB = keyd.nextLine();
		switch (tempDB){
		case "r":
			Relational r = new Relational();
			r.userInterface();
			break;
		case "n":
			NoSQL n = new NoSQL();
			n.userInterface();
			break;
		case "g":
			Graph g = new Graph();
			g.userInterface();
			break;
		default:
			DatabaseSoftware d = new DatabaseSoftware();
			d.userInterface();
			break;
		}
	}
	

}


