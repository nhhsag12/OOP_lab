import java.util.Scanner;

public class PlusMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input rows, columns: ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int mt1[][] = new int [rows][columns];
		int mt2[][] = new int [rows][columns];
		
		System.out.println("Input matrix 1: ");
		for(int i = 0; i < rows; i++) {
			System.out.println("row " + (i+1));
			for(int j = 0; j < columns; j++) {
				mt1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Input matrix 2: ");
		for(int i = 0; i < rows; i++) {
			System.out.println("row " + (i+1));
			for(int j = 0; j < columns; j++) {
				mt2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\n\nSum of 2 matrix: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print((mt1[i][j] + mt2[i][j]) + " ");
			}
			System.out.println();
		}
	}
}
