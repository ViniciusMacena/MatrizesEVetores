package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vet[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int soma = 0, impares = 0, pares = 0, x;
		double media = 0;
		System.out.println(Arrays.toString(vet));

		System.out.println("\nElementos impares:");
		for (x = 1; x < vet.length; x += 2) {
			System.out.print(vet[x] + " ");
		}

		System.out.println("\nElementos pares: ");
		for (x = 0; x < vet.length; x++) {
			soma += vet[x];
			media = (double) soma / vet.length;
			if (vet[x] % 2 == 0) {
				System.out.print(vet[x] + " ");
			}
		}

		System.out.printf("\nSoma: %d", soma);
		
		System.out.printf("\nMedia: %.2f ", media);

	}

}
