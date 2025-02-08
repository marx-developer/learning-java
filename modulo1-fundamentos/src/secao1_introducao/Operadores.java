/* OPERADORES EM JAVA:
 * Operadores são usados ​​para executar operações em variáveis ​​e valores.
 * Java divide os operadores nos seguintes grupos:
 * 
 * 
 * OPERADORES ARITMÉTICOS: São usados para realizar operações matemáticas básicas.
 * Lista de Operadores:
 * Soma: +
 * Subtração: -
 * Multiplicação: * 
 * Divisão (inteira ou real): / 
 * Módulo (resto da divisão) % 
 * Incremento: ++
 * Decremento: --
 * 
 * 
 * OPERADORES DE ATRIBUIÇÃO: São usados ​​para atribuir valores a variáveis.
 * Lista de Operadores:
 * = equivale: a = a
 * += equivale: a = a + b
 * -= equivale: a = a - b
 * *= equivale: a = a * b
 * /= equivale: a = a / b
 * %= equivale: a = a % b
 * 
 * 
 * OPERADORES DE COMPARAÇÃO: São usados ​​para comparar dois valores (ou variáveis).
 * O resultado de uma comparação é sempre um valor booleano: true (verdadeiro) ou false (falso).
 * Lista de Operadores:
 * == (igual a): Verifica se dois valores são iguais.
 * != (diferente de): Verifica se dois valores são diferentes.
 * > (maior que): Verifica se o valor à esquerda é maior que o valor à direita.
 * < (menor que): Verifica se o valor à esquerda é menor que o valor à direita.
 * >= (maior ou igual a): Verifica se o valor à esquerda é maior ou igual ao valor à direita.
 * <= (menor ou igual a): Verifica se o valor à esquerda é menor ou igual ao valor à direita.
 * 
 * 
 * OPERADORES LÓGICOS: São usados para combinar ou inverter expressões booleanas, retornando um 
 * valor de verdadeiro (true) ou falso (false). Eles são frequentemente utilizados em instruções 
 * condicionais, como if, para tomar decisões baseadas em múltiplas condições.
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
 * 
 * PRECEDÊNCIA DOS OPERADORES ARITMÉTICOS:
 * 1. Parênteses: Calculados primeiro.
 * 2. Multiplicação, Divisão e Módulo (, /, %): Realizados antes de soma e subtração.
 * 3. Soma e Subtração (+, -): Realizados por último.
 * 
 * 
 * PRECEDÊNCIA DOS OPERADORES LÓGICOS
 * 1. ! (NÃO) tem a maior precedência e é avaliado primeiro.
 * 2. && (E) tem precedência maior do que || (OU).
 * 3. || (OU) é avaliado por último.
 * */

package secao1_introducao;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// EXEMPLO PRÁTICO OPERADORES ARITMÉTICOS:
		System.out.println("EXEMPLO COM OPERADORES ARITMÉTICOS:");
		int a = 10, b = 3;

		System.out.println("Soma: " + (a + b)); // Soma
		System.out.println("Subtração: " + (a - b)); // Subtração
		System.out.println("Multiplicação: " + (a * b)); // Multiplicação
		System.out.println("Divisão Inteira: " + (a / b)); // Divisão inteira
		System.out.println("Módulo (resto): " + (a % b)); // Resto da divisão

		System.out.println();

		// EXEMPLO PRÁTICO COM OPERADORES DE INCREMENTO E DECREMENTO
		System.out.println("EXEMPLO COM OPERADOR DE INCREMENTO:");
		int exemploIncremento = 5;

		System.out.println("Valor inicial da variável: " + exemploIncremento);
		System.out.println("Valor após o Pré-incremento: " + ++exemploIncremento); // Pré-incremento: imprime 6
		System.out.println("Valor após o Pós-incremento: " + exemploIncremento++); // Pós-incremento: imprime 6,
		System.out.println("Valor final: " + exemploIncremento); // depois a vira 7
		System.out.println();

		System.out.println("EXEMPLO COM OPERADOR DE DECREMENTO:");
		int exemploDecremento = 5;

		System.out.println("Valor inicial da variável: " + exemploDecremento);
		System.out.println("Valor após o Pré-decremento: " + --exemploDecremento); // Pré-decremento: imprime 4
		System.out.println("Valor após o Pós-decremento: " + exemploDecremento--); // Pós-decremento: imprime 4, depois
		System.out.println("Valor final: " + exemploDecremento); // b vira 3

		System.out.println();

		// EXEMPLO PRÁTICO COM OPERADORES DE ATRIBUIÇÃO:
		System.out.println("EXEMPLO COM OPERADORES DE ATRIBUIÇÃO:");
		int x = 10;

		System.out.println("Valor inicial da variável: " + x);
		x += 5; // x = x + 5
		System.out.println("Após soma: " + x); // 15
		x -= 3; // x = x - 3
		System.out.println("Após subtração: " + x); // 12
		x *= 2; // x = x * 2
		System.out.println("Após multiplicação: " + x); // 24
		x /= 4; // x = x / 4
		System.out.println("Após divisão: " + x); // 6
		x %= 3; // x = x % 3
		System.out.println("Após módulo: " + x); // 0

		System.out.println();

		// EXEMPLO PRÁTICO COM OPERADOR && (E Lógico)
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();

		System.out.println("Possui habilitação? (true/false)");
		boolean temCNH = sc.nextBoolean();

		if (idade >= 18 && temCNH) {
			System.out.println("Pode dirigir.");
		} else {
			System.out.println("Não pode dirigir.");
		}

		// EXEMPLO PRÁTICO COM OPERADOR || (OU Lógico)
		
		
		
		sc.close();

	}

}
