public class Matrix {

	private int row, col;
	private String table[][] = null;


	public Matrix() {
		resetTable();
	}

	public void generateMatrix() {
		int rand;
		getDimensions();
		table = new String[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				table[i][j] = "";
				for(int k = 0; k < 3; k++) {
					rand = (int )(Math.random() * 95) + 32;
					table[i][j] = table[i][j] + (char) rand;
				}
			}
		}
	}

	private void getDimensions() {
		System.out.print("Input row: ");
		row = Helper.scanInt("row");
		System.out.print("Input column: ");
		col = Helper.scanInt("column");
	}

	public void displayTable() {
		System.out.println();
		for(int i = 0; i < table.length; i++) {
			for(int j = 0;j < table[0].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void editTable() {
		boolean redo = true;
		String newStr = "";
		System.out.println();
		while(redo) {
			getDimensions();
			if(row < table.length && row >= 0 && col < table[0].length && col >=0) {
				redo = false;
			} 	else {
				System.out.println("Error! Invalid index.");
			}
		}
		Helper.scanNxtLine();
		table[row][col] = Helper.scanStr(newStr);
	}

	public void searchTable() {
		String str = Helper.scanSrchStr();
		int total = 0;
		for(int i = 0; i < table.length; i++) {
			for(int j = 0;j < table[0].length; j++) {
				int iFrom = 0;
				int count = 0;
				while(iFrom != -1){
					iFrom = table[i][j].indexOf(str, iFrom);
					if(iFrom != -1) {
						count++;
						total++;
						iFrom += str.length();
					}	
				}

				if(count > 0) {
					System.out.println(count + " occurence(s) at index (" + i + "," + j + ").");
				}
			}
		}
		if(total == 0) {
			System.out.println("No occurences found.");
		} else {
			System.out.println(total + " total occurence in the table.");
		}
	}

	public void resetTable() {
		System.out.println();
		generateMatrix();
		displayTable();
	}
}