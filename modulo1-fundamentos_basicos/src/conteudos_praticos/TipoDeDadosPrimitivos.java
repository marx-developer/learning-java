/* TIPO DE DADOS PRIMITIVOS EM JAVA: 
 * Um tipo de dado primitivo especifica o tipo de uma variável e o tipo de valores que ela pode conter
 * Existem oito tipos de dados primitivos em Java, que estão divididos grupos:  
 
 * TIPOS NÚMEROS INTEIROS:
 * byte: Armazena um tipo inteiro de 8 bits com sinal, que pode armazenar valores de -128 a 127.
 * short: Armazena um tipo inteiro de 16 bits com sinal, que pode armazenar valores de -32,768 a 32,767.
 * int: Armazena um tipo inteiro de 32 bits com sinal, que pode armazenar valores de -2^31 a 2^31-1.
 * long: Armazena um tipo inteiro de 64 bits com sinal, que pode armazenar valores de -2^63 a 2^63-1.
  
 * TIPOS NÚMEROS DE PONTO FLUTUANTE:
 * float: Armazena um tipo de ponto flutuante de precisão simples de 32 bits.
 * double: Armazena um número de ponto flutuante de precisão dupla de 64 bits.
 
 * TIPO BOOLEANOS
 * boolean: Armazena um valor que pode ser verdadeiro ou falso. 
 * Valores booleanos são usados ​​principalmente para testes condicionais.
  
 * TIPO CARACTERE ÚNICO
 * char: Armazena um único caractere. O caractere deve ser cercado por aspas simples, como 'A' ou 'c'
 */


package conteudos_praticos;

public class TipoDeDadosPrimitivos {

	public static void main(String[] args) {	
		// EXEMPLOS DE TIPOS NÚMEROS INTEIROS:
		
		/* byte: Podemos utilizar em vez de int ou outros tipos inteiros para economizar memória 
		 * quando você tivermos certeza de que o valor estará entre -128 e 127.*/
		byte idade = 29; 
		System.out.println("Idade: " + idade);
		
		// short: Podemos utilizar para armazenar números inteiros de -32768 a 32767:
		short populacao = 6780;
		System.out.println("População: " + populacao);
		
		// int: Podemos utilizar para armazenar números inteiros de -2147483648 a 2147483647:
		int codigo = 12342;
		System.out.println("Código: " + codigo);
		
		/* long: Podemos utilizar para armazenar números inteiros de -9223372036854775808 a 9223372036854775807. 
		 * Isso é usado quando int não é grande o suficiente para armazenar o valor. 
		 * Devemos terminar o valor com um "L" para indicar que e um valor long. */ 
		long populacaoTotal = 8000000000L; // Usamos o sufixo "L" para representar um literal longo.
		System.out.println("População Total: " + populacaoTotal);
		
		
		// EXEMPLOS DE TIPOS NÚMEROS DE PONTO FLUTUANTE:
		// Devemos usar um tipo de ponto flutuante sempre que precisar de um número com um decimal.
		// Os tipos de dados float e double podem armazenar números fracionários. 
		// Devem terminar o valor com um "f" para floats e "d" para doubles:
		float altura = 1.75f; 
		double saldoBancario = 1000.89d;
		System.out.println("Altura " + altura);
		System.out.println("Saldo Bancário " + saldoBancario);
		
		
		// EXEMPLO TIPO BO0LEANO
		// Este tipo de dado só armazenar os valores true ou falso:
		boolean ehEstudante = true;
		System.out.println("É Estudante? " + ehEstudante);		
		
		
		// EXEMPLO TIPO CARACTERE
		// Este tipo de dado rmazenar um único caractere. 
		//O caractere deve ser cercado por aspas simples, como 'A' ou 'c':
		char genero = 'M';
		System.out.println("Gênero: " + genero);
		
		System.out.println();
		
		
		/* EXERCÍCIO DE FIXAÇÃO: 
		 * Programa para calcular e gerar o custo total de vários itens: */
		
		// Declarando as variáveis de diferentes tipos
		int items = 50;
		float valorPorItem = 8.99f;
		float valorTotal = items + valorPorItem;
		char cifrao = '$';
		
		// Imprimindo as variáveis na tela
		System.out.println("Quantidade Item: " + items);
		System.out.println("Valor Item: " + valorPorItem);
		System.out.println("Valor Total: " + valorTotal + cifrao);
		
	}
}