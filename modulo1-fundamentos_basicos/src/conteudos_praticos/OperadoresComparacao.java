/* OPERADORES DE COMPARAÇÃO: 
 * São usados ​​para comparar dois valores (ou variáveis).
 * O resultado de uma comparação é sempre um valor booleano: true (verdadeiro) ou false (falso).
 * 
 * Lista de Operadores:
 * == (igual a): Verifica se dois valores são iguais.
 * != (diferente de): Verifica se dois valores são diferentes.
 * > (maior que): Verifica se o valor à esquerda é maior que o valor à direita.
 * < (menor que): Verifica se o valor à esquerda é menor que o valor à direita.
 * >= (maior ou igual a): Verifica se o valor à esquerda é maior ou igual ao valor à direita.
 * <= (menor ou igual a): Verifica se o valor à esquerda é menor ou igual ao valor à direita.
 */

package conteudos_praticos;

public class OperadoresComparacao {

	public static void main(String[] args) {
		// EXEMPLO: USO DE OPERADORES DE COMPARAÇÃO
		
		int num1 = 10;
		int num2 = 20;

		boolean igual = num1 == num2;
		System.out.println(num1 + " igual (==) a " + num2 + ": " + igual);

		boolean diferente = num1 != num2;
		System.out.println(num1 + " diferente (!=) de " + num2 + ": " + diferente);

		boolean maior = num1 > num2;
		System.out.println(num1 + " maior que (>) " + num2 + ": " + maior);

		boolean menor = num1 < num2;
		System.out.println(num1 + " menor que (<) " + num2 + ": " + menor);

		boolean maiorOuIgual = num1 >= num2;
		System.out.println(num1 + " maior ou igual (>=) " + num2 + ": " + maiorOuIgual);
		
		boolean menorOuIgual = num1 <= num2;
		System.out.println(num1 + " menor ou igual (<=) " + num2 + ": " + menorOuIgual);

	}

}
