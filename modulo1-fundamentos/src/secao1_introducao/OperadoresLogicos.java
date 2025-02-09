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

package secao1_introducao;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// EXEMPLO: USO DE OPERADORES LÓGICOS

		// Condições a serem testadas
		boolean condicaoTrue = true;
		boolean condicaoFalse = false;
		
		System.out.println("Exemplos com operadores E lógico (&&): Retorna true se ambas as condições forem true:");
		System.out.println("True && True = " + (condicaoTrue && condicaoTrue));
		System.out.println("False && False = " + (condicaoFalse && condicaoFalse));
		System.out.println("True && False = " + (condicaoTrue && condicaoFalse));
		System.out.println();

		// Operador OU lógico (||)
		System.out.println("Exemplos com operadores OU lógico (||): Retorna true se pelo menos uma das condições for true:");
		System.out.println("True || True = " + (condicaoTrue || condicaoTrue));
		System.out.println("False || False = " + (condicaoFalse || condicaoFalse));
		System.out.println("True || False = " + (condicaoTrue || condicaoFalse));
		System.out.println();

		// Operador NÃO lógico (!)
		System.out.println("Exemplos com operador NÃO lógico (!): Inverte o valor booleano (true vira false e vice-versa):");
		System.out.println("!true = " + (!condicaoTrue));
		System.out.println("!false = " + (!condicaoFalse));
		System.out.println();
		
		
		// EXEMPLO PRÁTICO COM MÚLTIPLAS CONDIÇÕES	
		int idade = 25;
		boolean temHabilitacao = false;
		boolean podeDirigir = idade >= 18 && temHabilitacao;
		
		System.out.println("Idade atual: " + idade);
		System.out.println("Possui habilitação: " + temHabilitacao);
		System.out.println("Pode dirigir? " + podeDirigir);
	}

}
