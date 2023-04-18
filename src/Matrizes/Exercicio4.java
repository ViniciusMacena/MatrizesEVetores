package Matrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		double [][] notas = new double[10][4];
		double [] media = new double [10];
		
		//Lendo as notas.
		for(int i = 0;i < 10;i++) {
			System.out.printf("Digite a nota do aluno %d ",i+1);
			for(int j = 0; j < 4; j++) {
				System.out.printf("Nota %d: ",j+1);
				notas[i][j] = sc.nextDouble();
			}
		}
	
		// Calculando a media de cada aluno
		for(int i = 0; i < 10; i++) {
			double soma = 0;
			for (int j = 0; j < 4; j++) {
				soma += notas[i][j];
			}
			media[i] = soma / 4;
		}
		
		// Exibindo a média.
		
		System.out.println("Média do aluno: ");
		for(int i = 0; i < 10; i++) {
			System.out.printf("Aluno %d: %.2f\n", i+1, media[i]);
		}
		
		
		

	}

}
