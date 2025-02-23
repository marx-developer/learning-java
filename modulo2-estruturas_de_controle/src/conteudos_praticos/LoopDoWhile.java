/* ESTRUTURA DE REPETIÇÃO DO-WHILE (Faça Enquanto) 
 * O do-while é uma estrutura de repetição que executa um bloco de código pelo menos uma vez, 
 * independentemente da condição. Após a primeira execução, ele continua repetindo o código 
 * enquanto a condição for verdadeira.
 * 
 * SINTAXE: 
	do {
    	// Bloco de código executado pelo menos uma vez
	} while (condicao);
 * 
 * FLUXO DE EXECUÇÃO: 
 * 1. Executa o bloco de código primeiro.
 * 2. Depois verifica a condição.
 * 3. Se a condição for true, repete o processo.
 * 4. Se for false, encerra o loop.
 */

package conteudos_praticos;

import java.util.Scanner;

public class LoopDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// EXEMPLO PRÁTICO 1: Contador de 1 a 5
		int numero = 1;

		do {
			System.out.println("Número: " + numero);
			numero++; // Incrementa o número
			// O bloco é executado primeiro antes de verificar a condição.
		} while (numero <= 5); // O loop para quando numero > 5.

		// EXEMPLO PRÁTICO 2: Permitir até 3 tentativas para inserir um valor de saque
		// válido.
		System.out.printf("\nDIGITE UM VALOR MÚLTIPLO DE 10 PARA SAQUE: ");
		int valorSaque = sc.nextInt();

		int tentativas = 0;

		do {
			if (valorSaque % 10 == 0) {
				System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso!");
			} else {
				System.out.printf("Valor inválido! Tente novamente: ");
				valorSaque = sc.nextInt();
				tentativas++;
			}
		} while (valorSaque % 10 != 0 && tentativas < 2);

		// Caso o número de tentativas seja maior que 3.
		if (tentativas >= 2) {
			System.out.println("Número máximo de tentativas atingido. Operação cancelada.");
		}

		sc.nextLine();

		// EXEMPLO PRÁTICO 3: Validação de Senha
		// O sistema permite apenas três tentativas para inserir a senha correta.
		System.out.printf("\nDIGITE A SENHA PARA ACESSAR O SISTEMA: ");
		String senhaInformada = sc.nextLine();

		String senhaCorreta = "java2025";
		int tentativasAcesso = 0;

		do {
			if (senhaInformada.equals(senhaCorreta)) {
				System.out.println("Acesso permitido!");
			} else {
				System.out.println("\nSenha incorreta! Tente novamente.");
				System.out.print("Digite a senha: ");
				senhaInformada = sc.nextLine();
				tentativasAcesso++;
			}
		} while (!senhaInformada.equals(senhaCorreta) && tentativasAcesso < 2);

		if (tentativasAcesso >= 2) {
			System.out.printf("\nAcesso bloqueado!");
		}

		sc.close();

	}

}
