package secao1_introducao;

/* VARIÁVEIS: 
 * Uma variável é um espaço na memória do computador onde podemos armazenar 
 * um valor que pode ser usado ou modificado durante a execução do programa. */
					
/* Em Java, toda variável possui:
 * - Um tipo (que define o tipo de dado armazenado).
 * - Um nome (identificador).
 * - Um valor (o dado propriamente dito).
 * - Um escopo (a região do programa onde a variável é acessível). 
 */

public class Variaveis {

	public static void main(String[] args) {
	//EXEMPLOS DE DECLARAÇÃO DE VARIÁVEIS:
		
	// Declarando uma variável e depois inicializando
	int numero; // Declaração
	numero = 29; // Inicialização
	System.out.println("Número: " + numero); // Imprimindo o valor da variável numero
										
	// Declarando e inicializando uma variável sumultaneamente 
	String nome = "Marx";
	System.out.println("Meu nome é " + nome);
								
	// Declarando multiplas variáveis
	int valor1 = 10, valor2 = 20, valor3 = 30;
								
	// Processando dados com variáveis
	int soma = valor1 + valor2 + valor3;
	System.out.println(soma);
				
				
	/* CONSTANTES:
	 * Assim como uma variável final, uma constante é declarada quando precisamos 
	 * lidar com dados que não devem ser alterados durante a execução do programa. */
				
	/* No Java declaramos uma constante utilizando as palavras-chave final ou 
	 * static final antes do tipo da variável. */
	final String msgPadrao = "Olá, bom dia!";
	System.out.println(msgPadrao);		
	}
}