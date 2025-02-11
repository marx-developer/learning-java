/* ESTRUTURA CONDICIONAL IF-ELSE (Se, Senão): 
 * Ela permite que o programa execute um bloco de código caso a condição do if seja falsa.
 
 * SINTAXE:
	if (condição) {
		// Bloco de código se a condição for verdadeira
 	} else {
    	// Bloco de código se a condição for falsa
 	}
  */

package secao2_estruturas_de_controle;

import java.util.Scanner;

public class CondicionalIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// EXEMPLO PRÁTICO 1: Verificando se é maior ou menor de idade.
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Você e maior de idade.");
		} else {
			System.out.println("Você é menor de idade.");
		}

		System.out.println();

		// EXEMPLO PRÁTICO 2: Verificando se pode dirigir.
		System.out.print("Você possui habilitação? (true/false): ");
		boolean possuiCNH = sc.nextBoolean();

		if (idade >= 18 && possuiCNH) {
			System.out.println("Você pode dirigir.");
			;
		} else {
			System.out.println("Você não pode dirigir.");
		}

		sc.close();

	}

}
