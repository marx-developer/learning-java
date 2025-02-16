/* DESCRIÇÃO DO EXERCÍCIO PRÁTICO: 
 * 
 * SISTEMA PARA GESTÃO DE ESTOQUE DE PRODUTOS
 * O sistema deve permitir que o usuário:
 * - Cadastrar produtos (nome e quantidade).
 * - Adicionar estoque a um produto existente.
 * - Remover itens do estoque (se houver quantidade disponível).
 * - Exibir a lista de produtos e quantidades.
 * - Sair do programa.
 * 
 * OBJETIVO DE APRENDIZADO DO EXERCÍCIO:
 * - Praticar o uso do FOR para percorrer a lista de produtos e exibir os dados.
 * - Praticar o uso do WHILE para manter o menu ativo até o usuário decidir sair.
 * - Praticar o uso do DO-WHILE para validar entradas e evitar valores negativos.
 * - Praticar o uso de ARRAYS para armazenar os produtos e quantidades.
 * - Praticar a manipulação de Strings para comparar nomes de produtos.
 */

package exercicios_praticos;

import java.util.Scanner;

public class SistemaGestaoEstoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcaoMenu; // Variável para armazenar a escolha do usuário.

		String[] prodCadatrados = {"Arroz", "Feijão", "Macarrão", "Açucar", "Leite", "Oleo"};
		int[] qtdProd = {5, 4, 5, 4, 3, 2} ;
		int totalProd = 5;

		System.out.printf("================== GESTÃO DE ESTOQUE ==================\n");
		while (true) {
			System.out.println("\n1. Cadastrar Produto");
			System.out.println("2. Adicionar Estoque");
			System.out.println("3. Remover Estoque");
			System.out.println("4. Exibir Estoque");
			System.out.printf("5. Sair\n");
			System.out.print("\nEscolha uma opção: ");
			opcaoMenu = sc.nextInt(); // Recebendo a opção do usuário.
			sc.nextLine(); // Limpar buffer

			// Condicional caso o usuário escolha sair ou escolha uma opção inválida.
			if (opcaoMenu == 5) {
				System.out.printf("\nSistema encerrado. Obrigado!");
				break;
			} else if (opcaoMenu <= 0 || opcaoMenu >= 5) {
				System.out.printf("\nOpção Inválida. Tente novamente!\n");
			}

			switch (opcaoMenu) {
				case 1 -> {
					if (totalProd >= prodCadatrados.length) {
						System.out.printf("\nEstoque cheio! Não é possível cadastrar mais produtos.\n");
					} else {
						System.out.print("\nNome do produto: ");
						prodCadatrados[totalProd] = sc.nextLine();
	
						do {
							System.out.print("Quantidade: ");
							qtdProd[totalProd] = sc.nextInt();
						} while (qtdProd[totalProd] < 0);
	
						totalProd++;
						System.out.printf("\nProduto cadastrado com sucesso!\n");
					}
					break;
				}
				case 2 -> {
					
					// Exibindo produtos 
					for (int i = 0; i < totalProd; i++) {
						System.out.println(prodCadatrados[i] + " ➝ " + qtdProd[i] + " unidades");
					}
					
					System.out.printf("\nDigite o nome do produto para adicionar estoque: ");
					String addProd = sc.nextLine();
					boolean prodAddLoc = false;
					
					for (int i = 0; i < totalProd; i++) {
						if (prodCadatrados[i].equalsIgnoreCase(addProd)) {
							System.out.print("Quantidade a adicionar: ");
							int qtdAdd = sc.nextInt();
							if (qtdAdd > 0) {
								qtdProd[i] += qtdAdd;
								System.out.println("Estoque atualizado!");
							} else {
								System.out.println("Quantidade inválida!");
							}
							prodAddLoc = true;
							break;
						}
					}
					if (!prodAddLoc)
						System.out.printf("\nProduto não encontrado!\n");
					break;
				}
				case 3 -> {
					// Exibindo produtos 
					for (int i = 0; i < totalProd; i++) {
						System.out.println(prodCadatrados[i] + " ➝ " + qtdProd[i] + " unidades");
					}
					
					System.out.printf("\nQual produto deseja remover estoque: ");
					String removerProd = sc.nextLine();
					boolean prodRemLoc = false;
	
					for (int i = 0; i < totalProd; i++) {
						if (prodCadatrados[i].equalsIgnoreCase(removerProd)) {
							System.out.printf("\nQuantidade a remover: ");
							int qtdRem = sc.nextInt();
							if (qtdRem > 0 && qtdRem <= qtdProd[i]) {
								qtdProd[i] -= qtdRem;
								System.out.println("Estoque atualizado!");
							} else {
								System.out.printf("\nQuantidade inválida!");
							}
						}
						prodRemLoc = true;
						break;
					}
					if (!prodRemLoc)
						System.out.printf("\nProduto não encontrado!\n");
					break;
				}
				case 4 -> {
					System.out.printf("\nESTOQUE ATUAL: \n");
					// Exibindo produtos 
					for (int i = 0; i < totalProd; i++) {
						System.out.println(prodCadatrados[i] + " ➝ " + qtdProd[i] + " unidades");
					}
					break;
				}
			} // Final do switch

		} // Final do while
		sc.close();
	}
}