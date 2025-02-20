/* OPERADOR TERNÁRIO: 
 * O operador ternário (? :) é uma forma simplificada do if-else, usada para expressões curtas. 
 * Ele permite avaliar uma condição e retornar um valor dependendo se essa condição for 
 * verdadeira (true) ou falsa (false).
  
 * SINTAXE: 
 * variavel = (condição) ? valor_se_verdadeiro : valor_se_falso;
 * - condição → Expressão booleana (true ou false).
 * - valor_se_verdadeiro → Retornado se a condição for true.
 * - valor_se_falso → Retornado se a condição for false.
 * 
 * OBS: É chamado de "ternário" porque usa três operandos: condição, valor verdadeiro e valor falso.
 */
package conteudos_praticos;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// EXEMPLO PRÁTICO 1: Verificando se é maior ou menor de idade.
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();
		
		String verificarIdade = (idade >= 18) ? "maior de idade." : "menor de idade.";
		System.out.println("Você é " + verificarIdade);
		
		System.out.println();
		
		// EXEMPLO PRÁTICO 2: Verificando se pode dirigir.
		System.out.print("Você possui habilitação? (true/false): ");
		boolean possuiCNH = sc.nextBoolean();
		
		String podeDirigir = (idade >= 18 && possuiCNH) ? "pode dirigir." : "não pode dirigir.";
		System.out.println("Você " + podeDirigir);

		sc.close();
	}

}
