import java.util.regex.*;
import java.util.Scanner;

public class UserRegisration {
	Scanner Scan = new Scanner(System.in);
    
	public void firstName() {
		System.out.println("Enter First Name:(First Letter Capital and minimum 3 characters)");
		String fName = Scan.nextLine();
		
		Pattern fNamePat = Pattern.compile("^[A-Z]+[A-Za-z]{2,12}$");
	    Matcher fNameMatch = fNamePat.matcher(fName);
	    boolean fNameverification = fNameMatch.find();
	    
	    if (fNameverification==false) {
	    	System.out.println("Invalid First Name!! Enter a Valid First Name");
	    	firstName();
	    }
	    else {
	    	System.out.println("Valid First Name: "+ fName);
	    }
	}
	
	public void lastName() {
		System.out.println("Enter Last Name:(First Letter Capital and minimum 3 characters)");
		String lName = Scan.nextLine();
		
		Pattern lNamePat = Pattern.compile("^[A-Z]+[A-Za-z]{2,12}$");
	    Matcher lNameMatch = lNamePat.matcher(lName);
	    boolean lNameverification = lNameMatch.find();
	    
	    if (lNameverification==false) {
	    	System.out.println("Invalid Last Name!! Enter a Valid Last Name");
	    	lastName();
	    }
	    else {
	    	System.out.println("Valid Last Name: "+ lName);
	    }
	}
	
	public static void main(String[] args) {
		UserRegisration user = new UserRegisration();
		user.firstName();
		user.lastName();
	}

}
