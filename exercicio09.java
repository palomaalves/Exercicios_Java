/*9 -Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das
seguintes categorias: Infantil A = 5 - 7 anos Infantil B = 8 - 10 anos juvenil A = 11- 13 anos
juvenil B = 14 - 17 anos Sênior = 18 - 25 anos. Apresentar mensagem “idade fora da faixa
etária” quando for outro ano não contemplado.*/

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int idade = 0;
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        
        if ((idade >= 5) && (idade <= 7)) {
            System.out.println("Categoria Infantil A");
        }
        else if ((idade >= 8) && (idade <= 10)) {
            System.out.println("Categoria Infantil B");
        }
        else if ((idade >= 11) && (idade <= 13)) {
            System.out.println("Categoria Juvenil A");
        }
        else if ((idade >= 14) && (idade <= 17 )) {
            System.out.println("Categoria Juvenil B");
        }
        
        else if ((idade >= 18) && (idade <= 25 )) {
            System.out.println("Categoria Sênior");
        }
        else {
            System.out.println("Idade fora da faixa etária"); 
        }

	}

}
