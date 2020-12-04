package com.javapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SpiralArray {

	public static void main(String[] args) throws IOException {

		int row, col;
		String str;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		row = S.nextInt();
		System.out.println("Enter no. of columns");
		col = S.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[][] = new int[row][col]; // defining 2d matrix
		System.out.println("Enter the elements of array");
		for (int i = 0; i < row; i++) // filling data in matrix
		{
			for (int j = 0; j < col; j++) {
				str = br.readLine();
				arr[i][j] = Integer.parseInt(str);

			}
		}

		printArray(row, col, arr);// function call
		spiralPrint(row, col, arr);
	}

	// function to print array
	static void printArray(int m, int n, int p[][]) {
		// m, n are row and column, p[][] is array
		System.out.println("Array is ");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print(p[i][j] + " \t");

			}
			System.out.println();

		}
	}

	// function to print array in spiral form
	static void spiralPrint(int r, int c, int a[][]) {
		int m = 0; // starting index for row
		int n = 0; // starting index for column
		int i; // iterator

		// external loop
		while (m < r && n < c) {
			// Print the first row
			for (i = n; i < c; i++) { // loop for column
				System.out.print(a[m][i]);
			}
			m++; // starting index value for row is incremented

			// Print the last column
			for (i = m; i < r; i++) { // loop for row
				System.out.print(a[i][c - 1]);
			}
			c--; // column size is decremented

			// Print the last row
			if (m < r) {
				for (i = c - 1; i >= n; i--) { // loop for column
					System.out.print(a[r - 1][i]);
				}
				r--; // row size is decremented
			}

			// Print the first column

			if (n < c) {
				for (i = r - 1; i >= m; i--) { // loop for row
					System.out.print(a[i][n]);
				}
				n++; // starting index value of column is incremented

			}
		}
	}// end of spiralPrint method
}// end of class