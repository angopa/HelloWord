/**
 *  Create by Andres Gonzalez 2017/10/16
 */
public class CharAndBoolean {

	public static void main(String[] args) {
		// width of 16 (2 bytes)
		char myChar = '\u00A9';
		System.out.println("Unicode output was: " + myChar);
		
		boolean myBoolean = false;
		boolean isMale = true;
		
		char registerSymbol = '\u00AE';
		System.out.println("Registered Symbol:" + registerSymbol);
	}
}
