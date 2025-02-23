/* OPERADORES DE ATRIBUIÇÃO: 
 * São usados ​​para atribuir valores a variáveis.
 
 * Lista de Operadores:
 * = equivale: a = a
 * += equivale: a = a + b
 * -= equivale: a = a - b
 * *= equivale: a = a * b
 * /= equivale: a = a / b
 * %= equivale: a = a % b
 */

package conteudos_praticos;

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		System.out.println("------ EXEMPLO COM OPERADORES DE ATRIBUIÇÃO ------");
		System.out.println();
		
		int numero = 21;
		
		// Operador de atribuição simples
		System.out.println("Valor inicial da variável: " + numero);
		// Operador de adição e atribuição (+=)
		numero += 5;
		System.out.println("Após += 5 (equivalente a: numero = numero + 5): " + numero);
		// Operador de subtração e atribuição (-=)
		numero -= 3; 
		System.out.println("Após -= 3 (equivalente a: numero = numero - 3): " + numero);
		// Operador de multiplicação e atribuição (*=)
		numero *= 2; 
		System.out.println("Após *= 2 (equivalente a: numero = numero * 2): " + numero);
		// Operador de divisão e atribuição (/=)
		numero /= 4; 
		System.out.println("Após /= 4 (equivalente a: numero = numero / 4): " + numero);
		// Operador de módulo e atribuição (%=)
		numero %= 3;
		System.out.println("Após %= 3 (equivalente a: numero = numero % 3): " + numero);
	}
}