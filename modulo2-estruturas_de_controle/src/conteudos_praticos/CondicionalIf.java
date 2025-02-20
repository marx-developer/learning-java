/* ESTRUTURA CONDICIONAL IF:
 * É usada para executar um bloco de código somente se uma condição for verdadeira.
  
 * SINTAXE:
 	if (condição) {
    	// Bloco de código executado se a condição for verdadeira
	}
 */

package conteudos_praticos;

import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// EXEMPLO PRÁTICO 1: Verificando se é maior de idade
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Você e maior de idade.");
		}
		System.out.println();

		// EXEMPLO PRÁTICO 2: Verificando se um número é positivo
		System.out.print("Informe um número inteiro: ");
		int numero = sc.nextInt();

		if (numero > 0) {
			System.out.println("O número é positivo.");
		}

		sc.close();

	}

}