//10 -Fa�a um algoritmo que receba um valor que foi depositado e exiba o valor com
//rendimento ap�s um m�s. Considere fixo o juro da poupan�a em 0,70% a.m.

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        double deposito = 0.0;
        double rendimento = 0.0;
        System.out.println("Digite o valor depositado: ");
        deposito = entrada.nextDouble();
        
        rendimento = deposito * 1.7;
        System.out.printf("Valor com redimento �: %.2f ", rendimento);


	}

}
