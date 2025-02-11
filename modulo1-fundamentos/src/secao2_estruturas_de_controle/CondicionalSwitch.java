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

		String salarioCargo;

		switch (cargo.toLowerCase()) {
		case "gerente":
			salarioCargo = "Salário: R$ 9000";
			break;
		case "analista":
			salarioCargo = "Salário: R$ 5000;";
			break;
		case "assistente":
			salarioCargo = "Salário: R$ 4000";
			break;
		case "auxiliar":
			salarioCargo = "Salário: R$ 3000";
			break;
		case "estagiário":
			salarioCargo = "Salário: R$ 1500";
			break;
		default:
			salarioCargo = "Cargo não reconhecido.";
		}
		
		System.out.println(salarioCargo);
		System.out.println();

		/*
		 * A partir do Java 12, a estrutura switch foi aprimorada e agora suporta uma
		 * nova sintaxe com -> (chamada de "switch expression"). Essa nova forma torna o
		 * código mais conciso e reduz a necessidade do break manual.
		 * 
		 * Vantagens do ->
		 * - Mais legível e conciso – Remove a necessidade de break. 
		 * - Pode ser usado como expressão – Retorna um valor diretamente.
		 */
		
		// Exemplo com o switch expression
		System.out.println("Gerente");
		System.out.println("Analista");
		System.out.println("Assistente");
		System.out.println("Auxiliar");
		System.out.println("Estagiário");
		System.out.println();

		System.out.printf("INFORME O CARGO: ");
		String cargo2 = sc.nextLine();

		String salarioCargo2 = switch (cargo2.toLowerCase()) {
		case "gerente" -> "Salário: R$ 9000";
		case "analista" -> "Salário: R$ 5000;";
		case "assistente" -> "Salário: R$ 4000";
		case "auxiliar" -> "Salário: R$ 3000";
		case "estagiário" -> "Salário: R$ 1500";
		default -> "Cargo não reconhecido.";
		};
		
		System.out.println(salarioCargo2);

		sc.close();

	}

}
