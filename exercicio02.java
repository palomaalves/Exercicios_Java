//2 - Determinar se um n�mero � par ou �mpar e positivo ou negativo

import java.util.Scanner;

public class exercicio02 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        
        if ((numero > 0) && (numero % 2 == 0)) {
            System.out.println("O numero � par e positivo.");
        }
        if ((numero < 0) && (numero % 2 != 0)) {
            System.out.println("O numero � impar e negativo.");
        }
        if ((numero < 0) && (numero % 2 == 0)) {
            System.out.println("O numero � par e negativo.");
        }
        if ((numero > 0) && (numero % 2 != 0)) {
            System.out.println("O numero � impar e positivo.");
        }

	}

}
