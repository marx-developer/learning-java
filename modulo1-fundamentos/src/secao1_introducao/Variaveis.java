package secao1_introducao;

/* VARIÁVEIS: 
 * Uma variável é um espaço na memória do computador onde podemos armazenar 
 * um valor que pode ser usado ou modificado durante a execução do programa. 
 */

/* Em Java, existem diferentes tipos de variáveis, por exemplo:
 * String: armazena texto, como "Olá". Valores de string são cercados por aspas duplas.
 * int: armazena números inteiros (números inteiros), sem decimais, como 123 ou -123.
 * float: armazena números de ponto flutuante, com decimais, como 19,99 ou -19,99.
 * char: armazena caracteres únicos, como 'a' ou 'B'. Os valores char são cercados por aspas simples.
 * boolean: armazena valores com dois estados: verdadeiro ou falso.
 */
					
/* Em Java, toda variável possui:
 * Um tipo (que define o tipo de dado armazenado).
 * Um nome (identificador).
 * Um valor (o dado propriamente dito).
 * Um escopo (a região do programa onde a variável é acessível). 
 */

/* As regras gerais para nomear variáveis ​​são:
 * Os nomes podem conter letras, dígitos, sublinhados e cifrões
 * Os nomes devem começar com uma letra
 * Os nomes devem começar com uma letra minúscula e não podem conter espaços em branco
 * Os nomes também podem começar com $ e _
 * Os nomes diferenciam maiúsculas de minúsculas ("myVar" e "myvar" são variáveis ​​diferentes)
 * Palavras reservadas (como palavras-chave Java, como intou boolean) não podem ser usadas como nomes
 */

public class Variaveis {

	public static void main(String[] args) {
		/* DECLARANDO VARIÁVEIS:
		 
		 Para criar uma variável, devemos especificar o tipo e atribuir um valor a ela: 
		 Sintaxe: type variableName = value;
		 
		 - type é um dos tipos do Java
		 - variableName é o nome da variável (como x ou name ). 
		 - O sinal de igual é usado para atribuir valores à variável.
		*/
		
		//EXEMPLOS DE DECLARAÇÃO DE VARIÁVEIS:
		
		// Criando uma variável para armazenar texto:
		String nome = "Marx";
		System.out.println("Meu nome é " + nome);
		
		// Criando uma variável para armazenar um número:
		int idade = 29;
		System.out.println("Eu tenho " + idade + " anos.");
		
		// Podemos criar uma variável sem atribuir um valor e atribuir o valor depois:
		double altura;
		altura = 1.86;
		System.out.println("Eu tinha " + altura + " de altura.");
		
		// Se atribuir um novo valor a uma variável existente, ele substituirá o valor anterior:
		altura = 1.96;
		System.out.println("Agora tenho " + altura);
		
		// Podemos utilizar o caractere + para adicionar uma variável a outra variável:
		String primeiroNome = "Marx ";
		String segundoNome = "Santos";
		String nomeCompleto = primeiroNome + segundoNome;
		System.out.println("Meu nome completo é " + nomeCompleto);
		
		// Podemos declarar mais de uma variável do mesmo tipo utilizando virgulas para separa-las:
		int x = 5, y = 32, z = 22;
		System.out.println(x + y + z);
		
		// Podemos atribuir o mesmo valor para várias variáveis em uma linha:
		int a, b, c;
		a = b = c = 43;
		System.out.println(a + b + c);
		
		
		/* Podemos criar variáveis que quando atribuimos uma valor a ela, não podemos mais alterar.
		 * Para fazer isso, devemos utilizar a palavra-chave "final", isso declarará a variável 
		 * como final ou constante, o que significa imutável.
		 */
		final String saudacaoFixa = "Olá, bom dia!";
		System.out.println(saudacaoFixa);
		
		System.out.println();
		
		/* EXERCÍCIO DE FIXAÇÃO
		 * Programa para calcular a área de um retângulo (multiplicando o comprimento pela largura):
		 */
				
		// Declarando as variáveis
		int comprimento = 10;
		int largura = 20;
		int area;
		
		// Calculando a área do retangulo:
		area = comprimento * largura;
		
		// Imprimindo as variáveis:
		System.out.println("O comprimento do retangulo é: " + comprimento);
		System.out.println("A largura do retangulo é: " + largura);
		System.out.println("A área do retando é: " + area);	
	}
}