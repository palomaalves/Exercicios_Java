//7 - Leia um vetor de 10 posições e troque os 5 primeiros valores pelos 5 últimos e vice-versa.
//Escreva ao final o vetor obtido.

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		

		        int aux; // variavel auxiliar para inverter os elementos do vetor
		        int vetor[] = new int[10]; // vetor original
		        int novovet[] = new int[10]; // vetor invertido

		        Scanner num = new Scanner(System.in);

		        //declarando vetor
		        for(int i = 0; i<10; i++) {
		            System.out.println("Digite o "+(i+1)+" numero do vetor: ");
		            int n = num.nextInt();
		            vetor[i] = n;
		        }

		        //TROCANDO OS ELEMENTOS 
		        for(int i = 0; i<5; i++) {
		            aux = vetor[i];
		            vetor[i] = vetor[i+5];
		            novovet[i] = vetor[i];
		            novovet[i+5] = aux;
		        }
		        
		        System.out.println("\nVETOR INVERTIDO: \n");

		        //IMPRESSAO DO VETOR:
		        for(int i = 0; i<10; i++) {
		            System.out.print(novovet[i]+" "); 
		        }
		    }
		}

	
