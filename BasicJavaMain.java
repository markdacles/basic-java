import java.util.Scanner;

public class BasicJavaMain {

	public static void main(String[] args) {

		int action = 0;
		boolean redo = true;
		Matrix matrix = new Matrix();

		while(redo) {

			System.out.print("\n1. Print\n2. Edit\n3. Search\n4. Reset\n5. Exit\nSelect action: ");
			action = Helper.scanInt("action");

			switch(action) {

				case 1:
					matrix.displayTable();
					break;

				case 2:
					matrix.editTable();
					break;
				
				case 3:
					matrix.searchTable();
					break;

				case 4:
					matrix.resetTable();
					break;

				case 5:
					System.exit(0);

				default:
					System.out.println("Error! Invalid input. Please try again.");
					
			}

		}

	}
}