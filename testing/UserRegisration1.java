package testing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisration1 {

	boolean firstName(String fName) {
	    System.out.println("Enter First Name:(First Letter Capital and minimum 3 characters)");
	    Pattern fNamePat = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,12}$");
	    Matcher fNameMatch = fNamePat.matcher(fName);
	    boolean fNameverification = fNameMatch.find();
	    return fNameverification;
	}
	
	boolean lastName(String lName) {
	    System.out.println("Enter Last Name:(First Letter Capital and minimum 3 characters)");
	    Pattern lNamePat = Pattern.compile("^[A-Z]+[A-Za-z]{2,12}$");
	    Matcher lNameMatch = lNamePat.matcher(lName);
	    boolean lNameverification = lNameMatch.find();
	    return lNameverification;
	   	}
	
	boolean email(String email) {
	    System.out.println("Enter Email Id:");
	    Pattern emailPat = Pattern.compile("^([a-z]+[0-9a-z-!#$%+^&*_.]*){3,15}@[a-z0-9]{1,8}[.]*([a-z]{2,4})*.[a-z]{2,4}");
	    Matcher emailMatch = emailPat.matcher(email);
	    boolean emailVerification = emailMatch.find();
	    return emailVerification;
	}
	
	/*boolean mobileNumber(int number) {
	    Pattern numberPattern = Pattern.compile("^([+]*[1-9]{1}[-]*)[-0-9]{1,4}[\" \"]([1-9]?[0-9]{9})$");
	    Matcher numberMatch = numberPattern.matcher(number);
	    boolean numberVerification = numberMatch.find();	
	    return numberVerification;
	}*/

	boolean password(String password) {
	    Pattern passwordPat = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
	    Matcher passwordMatch = passwordPat.matcher(password);
	    boolean passwordVerification = passwordMatch.find();
	    return passwordVerification;
	}
}
