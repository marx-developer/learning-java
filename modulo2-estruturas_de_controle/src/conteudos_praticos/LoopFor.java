/* ESTRUTURA DE REPETIÇÃO FOR (Para)
 * O for é uma estrutura de repetição controlada, usada para executar um bloco de código um número 
 * determinado de vezes. Ele é ideal quando sabemos quantas vezes queremos repetir uma ação.
 * 
 * 
 * * O FOR É COMPOSTO POR TRÊS PARTES PRINCIPAIS:
 * 1. Inicialização – Executada uma vez antes do loop começar.
 * 2. Condição – Verificada antes de cada iteração; se for false, o loop termina.
 * 3. Atualização – Executada após cada iteração, modificando a variável de controle.
 * 
 * 
 * SINTAXE:
 	for (inicialização; condição; atualização) {
    	// Código a ser repetido
	}
 * 
 * EXPLICAÇÃO DA SINTAXE:
 * inicialização → Criação e definição do valor inicial da variável de controle.
 * condição → Teste lógico que determina se o laço continuará executando.
 * incremento/decremento → Modifica a variável de controle a cada iteração.
 * 
 * 
 * FLUXO DE EXECUÇÃO: 
 * 1. Executa a inicialização.
 * 2. Verifica a condição:
 * 	- Se true, executa o bloco de código.
 * 	- Se false, o loop termina.
 * 3. Executa a atualização da variável.
 * 4. Repete o processo até a condição ser false.
 */

package conteudos_praticos;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// EXEMPLO PRÁTICO 1: Contador de 1 a 5
		for (int i = 1; i <= 5; i++) {
			// i = 1 → Começa o contator no 1.
			// i <= 10 → Continua enquanto a variável i for menor ou igual a 5.
			// i++ → Incrementa i a cada repetição.
			System.out.println("Número: " + i);
		}

		System.out.println();

		// EXEMPLO PRÁTICO 2: Criando Contagem Regressiva
		for (int i = 5; i >= 1; i--) {
			// i = 1 → Começa o contator no 5.
			// i >= 5 → Continua enquanto a variável i for maior ou igual a 1.
			// i++ → Decrementa i a cada repetição.
			System.out.println(i);
		}

		System.out.println();

		// EXEMPLO PRÁTICO 3: Percorrendo um Array para exibir mensagens com os nomes armazenados.
		String[] nomesClientes = { "Marx", "Emily Beatriz", "Laura", "Leonardo" };

		for (int i = 0; i < nomesClientes.length; i++) {
			// nomes.length retorna o tamanho do array.
			// O loop percorre cada índice do array e imprime o valor correspondente.
			System.out.println("Olá, " + nomesClientes[i] + "! Obrigado por comprar conosco!");
		}

		// EXEMPLO PRÁTICO 4: Criar uma tabuáda.
		System.out.printf("\nInforme o número da tabuada: ");
		int numeroTabuada = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
		}

		// EXEMPLO PRÁTICO 5: Calculando o Total de Vendas no Mês
		double[] valoresVendidos = { 1450.50, 1233.54, 1221.00, 3450.89, 1090.90 };
		double totalVendas = 0;

		System.out.printf("\nVALORES VENDIDOS: ");
		for (int i = 0; i < valoresVendidos.length; i++) {
			System.out.printf("R$ %.2f\n", valoresVendidos[i]);
		}

		for (int i = 0; i < valoresVendidos.length; i++) {
			totalVendas += valoresVendidos[i]; // Soma cada venda ao total
		}

		sc.nextLine();

		System.out.printf("VALOR TOTAL: R$ %.2f\n ", totalVendas);

		// EXEMPLO PRÁTICO 6: Validação de Senha (Tentativas Limitadas)
		// O sistema permite apenas três tentativas para inserir a senha correta.
		String senhaCorreta = "java2025";
		String senhaInformada;

		for (int tentativas = 1; tentativas <= 3; tentativas++) {
			System.out.printf("\nDigite a senha: ");
			senhaInformada = sc.nextLine();

			if (senhaInformada.equals(senhaCorreta)) {
				System.out.println("Acesso permitido!");
				return;
			} else {
				System.out.println("Senha incorreta! Tentativa " + tentativas + " de 3.");
			}
		}

		System.out.printf("\nAcesso bloqueado!");

		sc.close();

	}

}
