/*5-Escrever um algoritmo que leia o nome de um vendedor, o seu salário fixo 
 * e o total de vendas efetuadas por ele no mês (em dinheiro). 
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
 * informar o seu nome, o salário fixo e salário no final do mês.
 */

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		        
		String nome = " ";
		double salario = 0.0;
		double comissao = 0.0;
		double vendas = 0.0;
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		        
		System.out.println("Digite seu salario: ");
		salario = entrada.nextDouble();
		        
		System.out.println("Digite o valor das vendas: ");
		vendas = entrada.nextDouble();
		        
		comissao = 0.15 * vendas;
		        
		double salariofinal = (salario + comissao);
		        
		System.out.println("\nNome: " + nome + "\nSalario Fixo : " + salario + "\nSalario com comissao: " + salariofinal);
		        
	 }
}
