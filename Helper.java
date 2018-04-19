import java.util.Scanner;

public class Helper {

	private static Scanner scanWithDel = new Scanner(System.in).useDelimiter("\n");
	private static Scanner input = new Scanner(System.in);

	public static int scanInt(String str) {
		while (!scanWithDel.hasNextInt()) {
		  	System.out.println("Error! Invalid input. Please try again.");
			if(str == "action") {
				System.out.print("\n1. Print\n2. Edit\n3. Search\n4. Reset\n5. Exit\nSelect action:");
				System.out.print("Select action: ");
			} else if(str == "row" || str == "column") {
				System.out.print("Input " + str + ":");
			}
			scanWithDel.next();
		}
		return scanWithDel.nextInt();
	}

	public static String scanStr(String str) {
		while(str.length() != 3) {
			System.out.print("Input new value: ");
			str = scanWithDel.nextLine();
			if(str.length() != 3) {
				System.out.println("Error! Please enter 3 characters only.");
			}
		}
		return str;
	}

	public static void scanNextLine() {
		scanWithDel.nextLine();
	}

	public static String scanSrchStr() { 
		System.out.println();
		System.out.print("Input search string: ");
		return input.nextLine();
	}
}