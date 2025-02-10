/* ESTRUTURA CONDICIONAL IF-ELSE IF (Se, Senão Se): 
 * Permite testar várias condições sequencialmente..
 
 * SINTAXE:
	if (condição1) {
    	// Executa se condição1 for verdadeira
	} else if (condição2) {
    	// Executa se condição2 for verdadeira
	} else {
    	// Executa se todas as condições forem falsas
	}
 */

package secao2_estruturas_de_controle;

import java.util.Scanner;

public class CondicionalIfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// EXEMPLO PRÁTICO 1: Verificando se o aluno foi aprovado ou reprovado
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
		
		// EXEMPLO PRÁTICO 1: Criando uma classificação de idade
		System.out.print("Informe a idade: ");
		int idade = sc.nextInt();
		
		if (idade < 12) {
			System.out.println("Criança.");
		} else if (idade < 18) {
			System.out.println("Adolescente.");
		} else if (idade < 60) {
			System.out.println("Adulto.");
		} else {
			System.out.println("Idoso.");
		}
		
		sc.close();

	}

}
