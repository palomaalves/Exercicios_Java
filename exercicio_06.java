//6- Declare um vetor de 10 posi��es e o preencha com os 10 primeiros n�meros �mpares e
//o escreva.


import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		 Scanner ent = new Scanner(System.in);
	        
	        // declara��o de vetor
	        int[] vetor = new int[10];
	        
	        //saida de dados
	        for (int i = 0; i < vetor.length; i++) {
	            vetor[i] = 2*i + 1;
	                System.out.print(vetor[i] + " ");
	        }

	
	

}}
