/* ESTRUTURAS CONDICIONAIS:
 * As estruturas condicionais em Java são blocos de código que permitem que o programa 
 * tome decisões com base em condições. Elas são fundamentais para controlar o fluxo de 
 * execução do programa e implementar lógicas de decisão.
 * 
 * ESTRUTURAS CONDICIONAIS BÁSICAS:
 * 
 * ESTRUTURA: if (Se): é usada para executar um bloco de código somente se uma condição for verdadeira.
 * SINTAXE:
 	if (condição) {
    	// Bloco de código executado se a condição for verdadeira
	}
 * 
 * 
 * ESTRUTURA: if-else (Se, Senão): permite que o programa execute um bloco de código caso a condição do if seja falsa.
 * SINTAXE:
	if (condição) {
		// Bloco de código se a condição for verdadeira
 	} else {
    	// Bloco de código se a condição for falsa
 	}
 * 
 * 
 * ESTRUTURA: if-else if (Se, Senão Se): é usado para testar múltiplas condições.
 * SINTAXE:
	if (condição1) {
    	// Executa se condição1 for verdadeira
	} else if (condição2) {
    	// Executa se condição2 for verdadeira
	} else {
    	// Executa se todas as condições forem falsas
	}
 * 
 *  
 * ESTRUTURA: switch: é usado para simplificar a escolha entre múltiplas opções de valor.
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
 * Importante: O break é usado para sair do switch após executar um caso.
 * 
 * 
 * Quando usar as condições:
 * if: Para testar uma única condição.
 * if-else: Quando há apenas duas possibilidades.
 * if-else if: Para múltiplas condições dependentes.
 * switch: Para comparar uma variável com múltiplos valores.
 */

package secao2_estruturas_de_controle;

import java.util.Scanner;

public class CondicionaisIfElseSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// EXEMPLOS DE USO

		// Verificando se é maior de idade com condicional IF
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Você e maior de idade.");
		}

		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();

		// Verificando se pode dirigir com a condicional IF...ELSE
		System.out.print("Você possui habilitação? (true/false): ");
		boolean possuiCNH = sc.nextBoolean();

		if (idade >= 18 && possuiCNH) {
			System.out.println("Você pode dirigir.");
			;
		} else {
			System.out.println("Você não pode dirigir.");
		}

		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();

		// Verificando se o aluno foi aprovado com a condicional IF...ELSE IF
		System.out.print("Infome a nota do aluno (0 a 10): ");
		int nota = sc.nextInt();

		if (nota > 10) {
			System.out.println("Nota inválida");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Nota A: Aluno aprovado!");
		} else if (nota >= 8 && nota < 9) {
			System.out.println("Nota B: Aluno aprovado!");
		} else if (nota >= 7 && nota < 8) {
			System.out.println("Nota C: Aluno aprovado!");
		} else {
			System.out.println("Aluno Reprovado!");
		}

		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();

		// Verificando dia da semana com a condicional SWITCH
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
		System.out.println("-------------------------------------------------");
		System.out.println();

		// Usando a estrutura switch com String
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
