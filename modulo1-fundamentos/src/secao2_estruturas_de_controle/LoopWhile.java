/* ESTRUTURA DE REPETIÇÃO WHILE (Enquanto)
 * O while é uma estrutura de repetição que executa um bloco de código repetidamente enquanto 
 * uma condição for verdadeira. Ele é usado quando não sabemos exatamente quantas vezes o loop 
 * será executado, pois a repetição depende de uma condição dinâmica.
 * 
 * SINTAXE: 
 	while (condicao) {
    	// Bloco de código a ser executado enquanto a condição for verdadeira
	}
 *  
 * FLUXO DE EXECUÇÃO: 
 * 1. O programa verifica se a condicao é true.
 * 2. Se for true, executa o bloco de código.
 * 3. Depois de executar, verifica a condição novamente.
 * 4. O processo se repete até que a condição seja false.
 * 
 * O while é uma ferramenta poderosa para repetir um bloco de código enquanto uma condição for 
 * verdadeira. Ele é útil quando não sabemos quantas vezes a repetição será necessária.
 */

package secao2_estruturas_de_controle;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// EXEMPLO PRÁTICO 1: Criando um contador de 1 a 5
		int numeroContador = 1; // Inicializa o contador em 1

		while (numeroContador <= 5) {
			// numeroContador começa em 1.
			// O while verifica se numero <= 5.
			// Se for verdadeiro, imprime e incrementa numero.
			System.out.println("Número: " + numeroContador);
			numeroContador++; // Incrementa o número
			// O loop para quando numero chega a 6.
		}

		// EXEMPLO PRÁTICO 2: Permitir até 3 tentativas para inserir um valor de saque válido.
		int tentativas = 0;

		System.out.printf("\nDigite um valor múltiplo de 10 para saque: ");
		int valorSaque = sc.nextInt();

		while (valorSaque % 10 != 0 && tentativas < 2) {
			System.out.printf("Valor inválido! \nTente novamente: ");
			valorSaque = sc.nextInt();
			tentativas++;
			/*
			 * Este loop reperitá ate que o valor de saque seja múltiplo de 10 e o número de
			 * tentativas for menor que 3.
			 */
		}

		// Condicional caso o valor de saque seja multiplo de 0
		if (valorSaque % 10 == 0) {
			System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso!");
		} else {
			// Caso o número de tentativas seja maior que 3.
			System.out.println("Número máximo de tentativas atingido. Operação cancelada.");
		}

		sc.nextLine();

		// EXEMPLO PRÁTICO 3: Validação de Senha
		// O sistema permite apenas três tentativas para inserir a senha correta.
		String senhaCorreta = "java2025";
		int tentativasAcesso = 0;

		System.out.printf("\nDIGITE A SENHA PARA ACESSAR O SISTEMA: ");
		String senhaInformada = sc.nextLine();

		while (!senhaInformada.equals(senhaCorreta) && tentativasAcesso < 2) {
			System.out.println("\nSenha incorreta! Tente novamente.");
			System.out.print("Digite a senha: ");
			senhaInformada = sc.nextLine();
			tentativasAcesso++;
		}

		if (senhaInformada.equals(senhaCorreta)) {
			System.out.println("\nAcesso permitido!");
		} else {
			System.out.printf("\nAcesso bloqueado!");
		}

		sc.close();

	}

}
