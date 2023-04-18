package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vet[]= {2,5,1,3,4,9,7,8,10,6};
		int posicao = 0, numeroPesquisado = 0, x;
		
		System.out.println(Arrays.toString(vet));
		
		System.out.println("Digite um numero inteiro: ");
		numeroPesquisado = sc.nextInt();
		
		for(x=0;x< vet.length;x++) {
			if(vet[x] == numeroPesquisado) {
				posicao = x;
				break;
			}
		}
		
		if (numeroPesquisado < 0 || numeroPesquisado > 10) {
			System.out.println("O numero "+numeroPesquisado+" não foi encontrado");
		} else {
			System.out.printf("O número %d foi encontrado na posição %d do vetor",numeroPesquisado,posicao);
		}
		
		
		
		
														
		
		

	}

}
