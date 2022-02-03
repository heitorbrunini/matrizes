package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("size of the square matrix: ");
		int n = sc.nextInt();
		sc.nextLine();
		int[][] matrix = new int[n][n];
		
		int[] diagonal = new int[n];

		/*
		 * for(int linha=0 ; linha < n ; linha++){ for(int coluna = 0; coluna < n ;
		 * coluna ++){
		 * System.out.printf("Insira o elemento [%d][%d]: ",linha+1,coluna+1);
		 * matrix[linha][coluna]=sc.nextInt(); } }
		 */
		 
		// recebendo linha por linha
		for (int i = 0; i < n; i++) {
			System.out.printf("enter line %d: ", i +1);
			String line = sc.nextLine();
			
			String[] lista = line.split(" ");
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Integer.parseInt(lista[j]);
				if (i == j) {
					diagonal[j] = Integer.parseInt(lista[j]);
				}
			}
		}

		for (int linha = 0; linha < n; linha++) {
			for (int coluna = 0; coluna < n; coluna++) {
				System.out.printf("%d ", matrix[linha][coluna]);
			}
			System.out.println();
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("tr(A) = ");
		
		for(int i = 0 ; i< n ; i++) {
			if (i == n-1) {
				sb.append("(%.2f) = " + diagonal[i]);
			} else {
				
			}
			System.out.printf("(%.2f)", diagonal[i]);
		}

		sc.close();
	}
}
