//4 - Fa�a um algoritmo que receba dois n�meros e ao final mostre a soma, subtra��o,
//multiplica��o e a divis�o dos n�meros lidos.


import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int soma = 0;
        int subtra��o = 0;
        int multiplica��o = 0;
        float divis�o = 0;
        System.out.println("Digite um numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite um numero: ");
        numero2 = entrada.nextInt();
        soma = numero1 + numero2;
        subtra��o = numero1 - numero2;
        multiplica��o = numero1 * numero2;
        divis�o = numero1 / numero2;
        System.out.printf("A soma dos numeros �: %d\n ", soma);
        System.out.printf("A subtra��o dos numeros �: %d\n ", subtra��o);
        System.out.printf("A multiplica��o dos numeros �: %d\n ", multiplica��o);
        System.out.printf("A divis�o dos numeros �: %.2f\n ", divis�o);


	}

}
