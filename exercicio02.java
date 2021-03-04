//2 - Determinar se um número é par ou ímpar e positivo ou negativo

import java.util.Scanner;

public class exercicio02 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        
        if ((numero > 0) && (numero % 2 == 0)) {
            System.out.println("O numero é par e positivo.");
        }
        if ((numero < 0) && (numero % 2 != 0)) {
            System.out.println("O numero é impar e negativo.");
        }
        if ((numero < 0) && (numero % 2 == 0)) {
            System.out.println("O numero é par e negativo.");
        }
        if ((numero > 0) && (numero % 2 != 0)) {
            System.out.println("O numero é impar e positivo.");
        }

	}

}
