package secao1_introducao;

//
/* TIPO DE DADOS PRIMITIVOS EM JAVA: 
 *  Java possui oito tipos de dados primitivos, que são os blocos de construção 
 *  fundamentais para a manipulação de dados na linguagem. 
 
 *  Aqui estão eles: 
 
 *  byte: É um tipo inteiro de 8 bits com sinal, que pode armazenar valores de -128 a 127.
 *  short: É um tipo inteiro de 16 bits com sinal, que pode armazenar valores de -32,768 a 32,767.
 *  int: É um tipo inteiro de 32 bits com sinal, que pode armazenar valores de -2^31 a 2^31-1.
 *  long: É um tipo inteiro de 64 bits com sinal, que pode armazenar valores de -2^63 a 2^63-1.
 *  float: É um tipo de ponto flutuante de precisão simples de 32 bits.
 *  double: É um número de ponto flutuante de precisão dupla de 64 bits.
 *  char: É um caractere Unicode de 16 bits que pode representar caracteres individuais.
 *  boolean: É um valor que pode ser verdadeiro ou falso. */

public class TipoDeDadosPrimitivos {

	public static void main(String[] args) {
		// EXEMPLOS DE USO:
		byte idade = 29; 
		short populacao = 6780;
		int codigo = 12342;
		long populacaoTotal = 8000000000L; // Usamos o sufixo "L" para representar um literal longo.
		float altura = 1.75f; // Usamos o sufixo "f" para representar um literal float.
		double saldoBancario = 1000.89;
		char genero = 'M';
		boolean ehEstudante = true;
				
		System.out.println("Idade: " + idade);
		System.out.println("População: " + populacao);
		System.out.println("Código: " + codigo);
		System.out.println("População Total: " + populacaoTotal);
		System.out.println("Altura " + altura);
		System.out.println("Saldo Bancário " + saldoBancario);
		System.out.println("Gênero: " + genero);
		System.out.println("É Estudante? " + ehEstudante);
	}
}