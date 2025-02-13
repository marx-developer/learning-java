/* SISTEMA DE GERENCIAMENTO DE NOTAS: 
 * Este exercício prático teve a finalidade de criar um programa que utiliza permite a entrada e
 * saída de dados, estruturas condicionais avançadas (if-else, switch e operadores ternários),  
 * para implementar um sistema de gerenciamento de notas. Ele permite que o usuário insira as notas 
 * de um aluno, calcule a média e determine a situação acadêmica com base em critérios configuráveis.
 * 
 * 
 * 
 */

package exercicios_praticos;

import java.util.Scanner;

public class SistemaGerenciamentoNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Constantes para armazenar a média para aprovação
		final double MEDIA_APROVACAO = 6.0;
		final double MEDIA_RECUPERACAO = 5.0;

		System.out.printf("=== Sistema de Gerenciamento de Notas ===\n\n");

		// Configurando a entrada das notas
		System.out.print("Digite a nota 1: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a nota 2: ");
		double nota2 = sc.nextDouble();

		System.out.print("Digite a nota 3: ");
		double nota3 = sc.nextDouble();

		// Calculando a média das notas
		double mediaNotas = (nota1 + nota2 + nota3) / 3;

		// Verificando a situação do aluno e armazenado na variável com a condicional
		// if-else if
		String situacaoAluno;
		if (mediaNotas >= MEDIA_APROVACAO) {
			situacaoAluno = "Aprovado";
		} else if (mediaNotas >= MEDIA_RECUPERACAO) {
			situacaoAluno = "Recuperaçao";
		} else {
			situacaoAluno = "Reprovado";
		}

		// Saída da média final e situação do aluno
		System.out.printf("\nMédia do aluno: %.2f\n", mediaNotas);
		System.out.printf("Situação: %s\n\n", situacaoAluno);

		// Saída com o detalhamento da situação do aluno utilizando a condicional switch
		switch (situacaoAluno) {
			case "Aprovado" -> {
				System.out.println("Parabéns! Continue assim.");
				System.out.print("Deseja se inscrever em cursos avançados? (S/N): ");
				// recebendo resposta, colocanto em caixa alta e obtendo apenas a primeira letra
				char resposta = sc.next().toUpperCase().charAt(0);
				// aninhando uma condicional if else
				if (resposta == 'S') {
					System.out.println("Cursos recomendados: Java Avançado, Estruturas de Dados.");
				} else {
					System.out.println("Tudo bem! Aproveite suas férias!");
				}
			}
			case "Recuperaçao" -> {
				System.out.println("Você precisa melhorar sua performance.");
				System.out.println("Revisar as matérias e realizar provas adicionais.");
	
			}
			case "Reprovado" -> {
				System.out.println("Infelizmente, você foi reprovado.");
				System.out.println("Considere pedir ajuda ao professor e rever os conteúdos.");
			}
		}

		// Mensagem adicional com operador ternário
		String mensagemFinal = mediaNotas >= MEDIA_RECUPERACAO 
				? "Boa sorte na próxima etapa!"
				: "Estude mais para melhorar no próximo semestre.";
		
		System.out.println("\n" + mensagemFinal);

		sc.close();
	}

}
