//8- Leia um vetor de 20 posições. Contar e escrever quantos valores pares ele possui.

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		        Scanner ent = new Scanner(System.in);
		        
		        // declaração de vetor
		        int[] vetor = new int[20];
		        
		        // entrada de dados
		        for(int i = 0; i < vetor.length; i++){
		            System.out.println("Digite um número: ");
		            vetor[i] = ent.nextInt();
		        }
		        int contar = 0;
		        
		        //saida de dados
		        for (int i = 0; i < vetor.length; i++) {
		            if (vetor[i] % 2 == 0) {
		                contar++;
		                System.out.print(vetor[i] + " ");
		            	}
		            }System.out.print("\n O vetor possui " + contar+ " numeros pares ");
	}
}