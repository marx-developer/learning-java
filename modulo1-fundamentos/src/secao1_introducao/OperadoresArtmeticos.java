/* OPERADORES ARITMÉTICOS: 
 * São usados para realizar operações matemáticas básicas.
 * 
 * Lista de Operadores:
 * Soma: +
 * Subtração: -
 * Multiplicação: * 
 * Divisão (inteira ou real): / 
 * Módulo (resto da divisão) % 
 * Incremento: ++
 * Decremento: --
 * 
 * PRECEDÊNCIA DOS OPERADORES ARITMÉTICOS:
 * 1. Parênteses: Calculados primeiro.
 * 2. Multiplicação, Divisão e Módulo (, /, %): Realizados antes de soma e subtração.
 * 3. Soma e Subtração (+, -): Realizados por último.
 */

package secao1_introducao;

public class OperadoresArtmeticos {

	public static void main(String[] args) {
		System.out.println("------ EXEMPLO: USO DE OPERADORES ARITMÉTICOS BÁSICOS ------");
		System.out.println();
		
		int num1 = 30;
		int num2 = 7;
		int soma = num1 + num2;
		int subtracao = num1 - num2;
		int multiplicacao = num1 * num2;
		int divisao = num1 / num2;
		int resto = num1 % num2;
		double divisaoReal = (double) num1 / num2;

		// Adição: soma dois valores.
		System.out.println("Soma: " + num1 + " + " + num2 + " = " + soma);
		// Subtração: subtrai um valor do outro.
		System.out.println("Subtração: " + num1 + " - " + num2 + " = " + subtracao);
		// Multiplicação: multiplica os valores.
		System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + multiplicacao);
		// Divisão: divide os valores (cuidado com a divisão entre inteiros!).
		System.out.println("Divisão: " + num1 + " / " + num2 + " = " + divisao);
		// Módulo (resto da divisão): retorna o resto da divisão.
		System.out.println("Resto da divisão: " + num1 + " % " + num2 + " = " + resto);
		// Divisão com números reais
		System.out.println("Divisão real: " + num1 + " / " + num2 + " = " + divisaoReal);
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("------ EXEMPLO: USO DE OPERADORES DE INCREMENTO E DECREMENTO ------");
		System.out.println();
		
		int numero1 = 10;
		System.out.println("Valor inicial da variável: " + numero1);
		System.out.println();

		// Incremento pós-fixado (usa o valor antes de incrementar)
		System.out.println("Pós-incremento (variável++) usa o valor atual e só depois incrementa: " + numero1++);
		System.out.println("Valor da variável pós-incremento: " + numero1);
		System.out.println();
		// Incremento pré-fixado (incrementa antes de usar o valor)
		System.out.println("Pré-incremento (++numero) incrementa antes de usar o valor: " + ++numero1);
		System.out.println();
		// Decremento pós-fixado (usa o valor antes de decrementar)
		System.out.println("Pós-decremento (numero--) usa o valor atual e depois decrementa: " + numero1--);
		System.out.println("Valor da variável pós-decremento: " + numero1);
		System.out.println();
		// Decremento pré-fixado (decrementa antes de usar o valor)
		System.out.println("Pré-decremento (--numero) decrementa antes de usar o valor: " + --numero1);

	}

}
