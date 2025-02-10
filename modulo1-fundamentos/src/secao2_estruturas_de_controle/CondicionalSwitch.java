/* ESTRUTURA CONDICIONAL SWITCH-CASE: 
 * É usado usado para comparar um valor com múltiplas opções fixas, evitando múltiplos if-else if.
 
 * SINTAXE: 
	switch (variavel) {
    	case valor1:
        	// Código para o caso valor1
        	break;
    	case valor2:
        	// Código para o caso valor2
        	break;
    	default:
        	// Código caso nenhum valor corresponda
	}
	
 * Importante: 
 * - O break é usado para sair do switch após executar um caso.
 * - O default (opcional) é executado quando nenhum case corresponde.
 */

package secao2_estruturas_de_controle;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// EXEMPLO PRÁTICO 1: Verificando dia da semana com a condicional SWITCH
		System.out.print("Informe um número do dia da semana: ");
		int dia = sc.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Dia invalido");
		}

		System.out.println();

		// EXEMPLO PRÁTICO 2: Usando a estrutura switch com String
		System.out.println("Gerente");
		System.out.println("Analista");
		System.out.println("Assistente");
		System.out.println("Auxiliar");
		System.out.println("Estagiário");
		System.out.println();

		System.out.printf("INFORME O CARGO: ");
		sc.nextLine(); // Limpa o buffer
		String cargo = sc.nextLine();

		switch (cargo.toLowerCase()) {
		case "gerente":
			System.out.println("Salário: R$ 9000");
			break;
		case "analista":
			System.out.println("Salário: R$ 5000");
			break;
		case "assistente":
			System.out.println("Salário: R$ 4000");
			break;
		case "auxiliar":
			System.out.println("Salário: R$ 3000");
			break;
		case "estagiário":
			System.out.println("Salário: R$ 1500");
			break;
		default:
			System.out.println("Cargo não reconhecido.");
		}

		sc.close();

	}

}
