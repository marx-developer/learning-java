/* DESCRIÇÃO DO EXERCÍCIO PRÁTICO: 
 * 
 * SISTEMA PARA CONTROLE DE VENDAS
 * Um lojista precisa de um sistema para registrar as vendas de um determinado dia. O sistema deve:
 * - Pedir ao usuário quantas vendas foram feitas.
 * - Solicitar o valor de cada venda.
 * - Calcular e exibir:
 * 		O total vendido no dia.
 * 		A média das vendas.
 * 		O número de vendas acima de R$ 1000,00.
 * 
 * OBJETIVO DE APRENDIZADO DO EXERCÍCIO:
 * - Praticar o uso do for para repetir ações baseadas na quantidade de vendas.
 * - Praticar entrada e saída de dados com Scanner.
 * - Praticar o uso das estruturas condicionais (if) dentro do for.
 * - Praticar cálculo de soma, média e contagem de elementos específicos.
 */

package exercicios_praticos;

import java.util.Scanner;

public class SistemaControleVendas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("================== CONTROLE DE VENDAS ==================\n\n");
		
		System.out.printf("Informe quantas vendas foram realizadas hoje: ");
		int quantidadeVendas = sc.nextInt(); // Recebendo a quantidade de vendas do dia
		
		double valorVenda; // Variável para armazenar o valor de cada venda.
		double valorTotalVendas = 0; // Variável para armazenar o valor total de vendas.
		int vendasAcimaMil = 0; // Variável para armazenar vendas acima de R$ 1000,00.
		
		// Loop de repetição para capturar a quantidade de vendas
		for (int i = 1; i <= quantidadeVendas; i++) {
			System.out.printf("Informe o valor da venda %d: ", i);
			valorVenda = sc.nextDouble(); // Recebendo o valor da venda
			
			valorTotalVendas += valorVenda; // Somando o valor de cada venda 
			
			// Contador para vendas acima de R$ 1000,00.
			if (valorVenda > 1000) {
				vendasAcimaMil++; 
			}
		}
		
		// Calculando a média de vendas
		double mediaVendas = valorTotalVendas / quantidadeVendas; 
	
		System.out.printf("\n\n===== RELATÓRIO DE VENDAS =====\n\n");
		System.out.printf("Quantidade de Vendas: %d\n", quantidadeVendas);
		System.out.printf("Valor Total Vendido: R$ %.2f\n", valorTotalVendas);
		System.out.printf("Valor Média Vendas: R$ %.2f\n", mediaVendas);
		System.out.printf("Vendas Acima de R$ 1000,00: %d", vendasAcimaMil);
		
		sc.close();
	}
}