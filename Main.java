/*
 * Code by: William Colachicco
 * This program takes the current ages of 10 employees and stores them in an array.
 * It then takes the desired retirement age of the 10 employees and stores them in the array.
 * That is all done with the getArray method using for loops.
 * Then the time remaining for the respective employees to work until retirement is displayed in sequence.
 * 
 */

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int[][] employeeTable = getArray(); // Get the array
			
			// Calculate differences and print results with loop
			for (int column = 0; column < 10; column++) {
				int difference = employeeTable[1][column] - employeeTable[0][column];
				
				System.out.println(" The current age and desired retirement age for employee # " 
				+ (column+1) + " is: " + employeeTable[0][column] + " " + employeeTable[1][column]);
				
				System.out.println(" Employee # " + (column+1) + " has to work " + 
									difference + " years before they can retire. ");
			}
	}
	
	public static int[][] getArray() {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Enter array values
		int[][] employeeTable = new int [2][10];
		System.out.println(" Enter each of the 10 employees current age in sequence, separated by a space, then press enter.");
		System.out.println(" Then type each desired retirement age, separated by a space, in corresponding sequence and press enter.");
		System.out.println(" Current ages can be between 19 and 70.");
		System.out.println(" The valid retirement ages you can enter are 62, 66, and 70.");
		for (int i = 0; i < employeeTable.length; i++)
			for (int j = 0; j < employeeTable[i].length; j++)
				employeeTable[i][j] = input.nextInt();
		
		return employeeTable;
		
	}
	
}
