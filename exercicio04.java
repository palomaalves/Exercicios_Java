//4 - Faça um algoritmo que receba dois números e ao final mostre a soma, subtração,
//multiplicação e a divisão dos números lidos.


import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int soma = 0;
        int subtração = 0;
        int multiplicação = 0;
        float divisão = 0;
        System.out.println("Digite um numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite um numero: ");
        numero2 = entrada.nextInt();
        soma = numero1 + numero2;
        subtração = numero1 - numero2;
        multiplicação = numero1 * numero2;
        divisão = numero1 / numero2;
        System.out.printf("A soma dos numeros é: %d\n ", soma);
        System.out.printf("A subtração dos numeros é: %d\n ", subtração);
        System.out.printf("A multiplicação dos numeros é: %d\n ", multiplicação);
        System.out.printf("A divisão dos numeros é: %.2f\n ", divisão);


	}

}
