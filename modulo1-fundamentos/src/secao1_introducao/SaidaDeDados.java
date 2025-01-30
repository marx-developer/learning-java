/* SAÍDA DE DADOS EM JAVA: 
 * A saída de dados em Java é essencial para exibir informações ao usuário. 
 * O principal método usado para isso é o System.out, que pertence à classe padrão System. */

/* PRINCIPAIS MANEIRAS PARA REALIZAR SAÍDA DE DADOS:
 * System.out.print(): Exibe a mensagem sem quebra de linha.
 * System.out.println(): Exibe a mensagem e adiciona uma quebra de linha.
 * System.out.printf(): Permite exibir mensagens formatadas usando placeholders.*/

/* PRINCIPAIS PLACEHOLDERS NO PRINTF(): 
 * %d: Exibe um número inteiro.
 * %f: Exibe um número decimal.
 * %s: Exibe uma cadeia de caracteres. 
 * %c: Exibe um caractere único.
 * %n: Adiciona uma quebra de linha.
 * %x: Exibe um inteiro em hexadecimal.
 * %o: Exibe um inteiro em octal.
 * %%: Exibe um sinal de porcentagem. */

package secao1_introducao;

public class SaidaDeDados {

	public static void main(String[] args) {
		// EXEMPLO PRÁTICO DE SAÍDA DE DADOS
		
		String nome = "Marx dos Santos";
		int idade = 29;
		double altura = 1.86;
				
		// Exibindo mensagem na tela sem quebra de linha
		System.out.print("Olá, ");
		System.out.print("Meu nome é " + nome);
		System.out.print(", tenho " + idade + " anos e minha altura é " + altura);
				
		System.out.println();
		System.out.println();
				
		// Exibindo mensagem na tela com quebra de linha
		System.out.println("Olá, ");
		System.out.println("Meu nome é " + nome);
		System.out.println(", tenho " + idade + " anos e minha altura é " + altura);
				
		System.out.println();
		System.out.println();
				
		// Exibindo mensagem na tela formatadas usando placeholders
		System.out.printf("Olá, meu nome é %s, tenho %d e minha altura é %.2f", nome, idade, altura);
	}
}
