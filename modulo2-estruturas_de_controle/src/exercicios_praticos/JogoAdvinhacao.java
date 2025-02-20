/* DESCRIÇÃO DO EXERCÍCIO PRÁTICO: 
 * 
 * JOGO DE ADVINHAÇÃO
 * Este exercício teve como objetivo criar um jogo onde o computador escolhe um número aleatório 
 * entre 1 e 100, e o usuário deve tentar adivinhar. O programa deve continuar pedindo palpites 
 * até que o usuário acerte.
 * 
 * OBJETIVO DE APRENDIZADO DO EXERCÍCIO:
 * - Praticar o uso do while para repetir o jogo até que o usuário acerte.
 * - Praticar break para encerrar o loop quando a resposta estiver correta.
 * - Praticar o uso das classe Random para gerar um número aleatório.
 * - Praticar o uso de contadores para contar as tentativas.
 */

package exercicios_praticos;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int numeroSecreto = random.nextInt(100) + 1; // Gerando o número secreto.
		int palpite, tentativas = 0;

		System.out.println("Bem-vindo ao Jogo de Adivinhação!");
		System.out.println("Tente adivinhar o número entre 1 e 100.");

		while (true) {
			System.out.printf("\nDigite seu palpite: ");
			palpite = sc.nextInt();
			tentativas++;

			if (palpite < numeroSecreto) {
				System.out.println("O número secreto é MAIOR! Tente novamente.");
			} else if (palpite > numeroSecreto) {
				System.out.println("O número secreto é MENOR! Tente novamente.");
			} else {
				System.out.println(
						"\n🎉 Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas!");
				break; // Sai do loop quando o usuário acerta
			}
		}

	}

}
