/* OPERADORES LÓGICOS: 
 * São usados para combinar ou inverter expressões booleanas, retornando um valor de verdadeiro (true) 
 * ou falso (false). Eles são frequentemente utilizados em instruções condicionais, como if, para 
 * tomar decisões baseadas em múltiplas condições.
 * 
 * Lista de Operadores:
 * 
 * E Lógico (&&): 
 * Retorna true se ambas as condições forem verdadeiras.
 * Se qualquer condição for falsa, o resultado será falso.
 * 
 * OU Lógico (||): 
 * Retorna true se pelo menos uma das condições for verdadeira.
 * Só retorna falso se todas as condições forem falsas.
 * 
 * NÃO Lógico (!): 
 * Inverte o valor de uma expressão booleana:
 * !true → false
 * !false → true
 * 
 * PRECEDÊNCIA DOS OPERADORES LÓGICOS
 * 1. ! (NÃO) tem a maior precedência e é avaliado primeiro.
 * 2. && (E) tem precedência maior do que || (OU).
 * 3. || (OU) é avaliado por último.
 */

package conteudos_praticos;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// EXEMPLO: USO DE OPERADORES LÓGICOS

		// Condições a serem testadas
		boolean condicao1 = true;
		boolean condicao2 = false;

		// Operador NÃO lógico (!)
		System.out.println("Exemplos com operador NÃO lógico (!): Inverte o valor booleano (true vira false e vice-versa):");
		System.out.println("!true = " + (!condicao1));
		System.out.println("!false = " + (!condicao2));
		System.out.println();

		System.out.println("Exemplos com operadores E lógico (&&): Retorna true se ambas as condições forem true:");
		System.out.println("True && True = " + (condicao1 && !condicao2));
		System.out.println("False && False = " + (!condicao1 && condicao2));
		System.out.println("True && False = " + (condicao1 && condicao2));
		System.out.println();

		// Operador OU lógico (||)
		System.out.println(
				"Exemplos com operadores OU lógico (||): Retorna true se pelo menos uma das condições for true:");
		System.out.println("True || True = " + (condicao1 || !condicao2));
		System.out.println("False || False = " + (!condicao1 || condicao2));
		System.out.println("True || False = " + (condicao1 || condicao2));
		System.out.println();

		// EXEMPLO PRÁTICO COM MÚLTIPLAS CONDIÇÕES
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();

		System.out.print("Possui habilitação? (true/false): ");
		boolean temHabilitacao = sc.nextBoolean();

		boolean podeDirigir = idade >= 18 && temHabilitacao;

		System.out.println();
		System.out.println("Idade atual: " + idade);
		System.out.println("Possui habilitação: " + temHabilitacao);
		System.out.println("Pode dirigir? " + podeDirigir);

		sc.close();
	}

}
