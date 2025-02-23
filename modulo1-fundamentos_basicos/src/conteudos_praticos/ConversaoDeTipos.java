/* CONVERSÃO DE TIPOS (CASTING):
 * A conversão de tipos, também conhecida como casting, é o processo de transformar o tipo 
 * de dado de uma variável em outro tipo. Em Java, ela é necessária quando trabalhamos com 
 * diferentes tipos de dados, seja para cálculos, manipulação de valores ou compatibilidade 
 * entre variáveis.
 * 
 * Em Java, existem dois tipos de conversão:
 * 
 * CONVERSÃO IMPLÍCITA (Widening Casting):
 * Ocorre automaticamente quando há ampliação de tipos (de um tipo menor para um tipo maior 
 * na hierarquia de dados). É segura, pois não há perda de dados.
 * Ordem Hierárquica dos Tipos Numéricos: byte-> short-> char-> int-> long-> float-> double
 * 
 * CONVERSÃO EXPLÍCITA (Narrowing Casting):
 * Deve ser feita manualmente, pois ocorre quando há redução de tipos (de um tipo maior para 
 * um tipo menor na hierarquia de dados). Pode resultar em perda de dados ou precisão.
 * Ordem Hierárquica dos Tipos Numéricos: double-> float-> long-> int-> char-> short-> byte
 */

package conteudos_praticos;

public class ConversaoDeTipos {

	public static void main(String[] args) {
		// EXEMPLO DE CONVERSÃO IMPLÍCITA (Widening Casting)
		// A conversão é feita automaticamente ao passar um tipo de tamanho menor para um tipo de tamanho maior:
		int numInt = 9;
		double numDouble = numInt; // Conversão implícita (int para double)
		System.out.println(numInt);
		System.out.println(numDouble); // Saída: 9.0
		
		
		// EXEMPLO DE CONVERSÃO EXPLÍCITA (Narrowing Casting)
		// A conversão deve ser feita manualmente colocando o tipo entre parênteses () antes do valor:
		double numDouble2 = 8.99d;
		int numInt2 = (int) numDouble2; // Conversão explícita (double para int)
		System.out.println(numDouble2);
		System.out.println(numInt2); // Saída: 8 (parte fracionária é descartada)
		
		
		/* EXERCÍCIO DE FIXAÇÃO
		 * Programa para calcular a porcentagem da pontuação de um usuário em relação à pontuação 
		 * máxima em um jogo. 
		 * Usamos conversão de tipo para garantir que o resultado seja um valor de ponto flutuante, 
		 * em vez de um inteiro: */
		
		int pontuacaoMax = 500;
		int pontuacaoAtual = 423;
		
		// Calculando a porcentagem da pontuação atual em relação a pontuação máxima.
		float porcetagemPontuacao = (float) pontuacaoAtual / pontuacaoMax * 100.0f; // Conversão explícita (int para float)
		
		System.out.println("Pontuação Máxima: " + pontuacaoMax);
		System.out.println("Pontuação Atual: " + pontuacaoAtual);
		System.out.println("Progresso do Jogo: " + porcetagemPontuacao + "%");
		
	}

}
