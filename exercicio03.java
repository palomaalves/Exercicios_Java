//3 - Faça um algoritmo que receba dois números e exiba o resultado da sua soma.

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int soma = 0;
        System.out.println("Digite um numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite um numero: ");
        numero2 = entrada.nextInt();
        soma = numero1 + numero2;
        System.out.printf("A soma dos numeros é: %d ", soma);


	}

}
