/**
 *  Create by Andres Gonzalez 2017/10/18
 */
public class switchStatement {

	public static void main(String[] args) {
		int switchValue = 3;
		
		switch (switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
		case 2:
			System.out.println("Value was 2");
			break;
		default:
			System.out.println("Default");
			break;
		}
		
		
		String month = "jan";
		
		switch (month) {
		case "Jan": case "jan":
			System.out.println("January");
			break;
		case "June":
			System.out.println("June");
			break;
		case "Dec":
			System.out.println("December");
			break;
		default:
			System.out.println("Not ure");
			break;
		}
	}
}
