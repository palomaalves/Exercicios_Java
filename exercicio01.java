/*1- Faça um algoritmo que lê uma temperatura em Fahrenheit e calcula a temperatura correspondente em Celsius. 
 * Ao final o programa deve exibir as duas temperaturas. – Usar a fórmula: C = (5 * (F-32) / 9)
 */
 
import java.util.Scanner;

public class exercicio01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Fahrenheit = new Scanner(System.in);
		float Celsius; 

		System.out.print("Conversor de temperatura: Graus Fahrenheit -> Celsius\n\n"); 
	
		System.out.print("Digite a temperatura em Fahrenheit: ");
		float f = Fahrenheit.nextFloat();
		
		Celsius = ( 5 * ( f - 32 ) / 9);
		
		String temperatura_celsius = String.format("%.2f", Celsius);

		System.out.printf("\n A medida convertida é: " + temperatura_celsius + "ºC\n");
		
	}

}


