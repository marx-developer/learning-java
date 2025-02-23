/* ENTRADA DE DADOS EM JAVA:
 * Para capturar dados do usuário no Java, usamos a classe Scanner do pacote java.util. 
 * Ela é a maneira mais comum e prática para realizar entradas de dados no console.*/

/* CONFIGURANDO O SCANNER:
 * 1 - Importa a classe: import java.util.Scanner
 * 2 - Criar um objeto da classe Scanner: Scanner scanner = new Scanner(System.in);
 * 3 - Usar métodos específicos para capturar diferentes tipos de dados (como texto, inteiros ou decimais).
 * 4 - Após o uso, feche o Scanner para evitar vazamentos de recursos: scanner.close(); */

/* MÉTODOS PARA LEITURA DE DADOS:
 * nextLine(): Lê uma linha completa de texto (até a quebra de linha).
 * next(): Lê a próxima palavra (até encontrar um espaço, tab ou quebra de linha).
 * nextInt(): Lê um número inteiro (do tipo int).
 * nextDouble(): Lê um número decimal (ponto flutuante, do tipo double).
 * nextFloat(): Lê um número decimal (ponto flutuante, do tipo float).
 * nextLong(): Lê um número inteiro longo (do tipo long).
 * nextShort(): Lê um número inteiro curto (do tipo short).
 * nextByte(): Lê um número inteiro pequeno (do tipo byte).
 * nextBoolean(): Lê um valor booleano (true ou false).
 * nextBigInteger(): Lê um número inteiro arbitrariamente grande (do tipo BigInteger).
 * nextBigDecimal(): Lê um número decimal arbitrariamente grande (do tipo BigDecimal). */

/* MÉTODOS PARA VERIFICAR DADOS DISPONÍVEIS: 
 * hasNext(): Verifica se há mais entradas disponíveis.
 * hasNextLine(): Verifica se há mais linhas disponíveis para leitura.
 * hasNextInt(): Verifica se o próximo token pode ser interpretado como um número inteiro.
 * hasNextDouble(): Verifica se o próximo token pode ser interpretado como um número decimal.
 * hasNextBoolean(): Verifica se o próximo token pode ser interpretado como um valor booleano. */

package conteudos_praticos;

//Importando a classe responsável pela entrada de dados
import java.util.Scanner; 

public class EntradaDeDados {

	public static void main(String[] args) {
		// EXEMPLO PRÁTICO DE ENTRADA DE DADOS
		
		// Declarando o objeto para entrada de dados.
		Scanner scanner = new Scanner(System.in);
				
		// Variaveis para armazenar os dados recebidos
		String nomeCliente;
		String cpf;
		double valorInicial;
		int taxaJuros;
				
		// Armazendando os dados recebidos nas variáveis		
		System.out.printf("Informe o nome completo: ");
		nomeCliente = scanner.nextLine(); // recebendo uma cadeia de caracteres completa.
				
		System.out.printf("Informe o CPF: ");
		cpf = scanner.next(); // recebendo uma cadeia de caracteres até a quebra de linha.
				
		System.out.printf("Informe o valor inicial: ");
		valorInicial = scanner.nextDouble(); // recebendo dados do tipo double.
		
		System.out.printf("Informe a taxa de juros: ");
		taxaJuros = scanner.nextInt(); // recebendo dados do tipo inteiro.
				
		// Calculando juros e o valor total
		double calcularJuros = (valorInicial * taxaJuros) / 100;
		double valorTotal = calcularJuros + valorInicial;
				
		// Exibindo informações do usuário na tela
		System.out.println("");
		System.out.println("========== SITUAÇÃO DO CLIENTE ==========");
		System.out.println("");
				
		System.out.printf("NOME COMPLETO: %s%n", nomeCliente);
		System.out.printf("CPF: %s%n", cpf);
		System.out.printf("VALOR INICIAL: R$ %.2f%n", valorInicial);
		System.out.printf("TAXA DE JUROS: %d%%%n", taxaJuros);
		System.out.printf("VALOR DO JUROS: R$ %.2f%n", calcularJuros);
		System.out.printf("VALOR TOTAL DA DÍVIDA: R$ %.2f", valorTotal);
				
		scanner.close();

	}

}
