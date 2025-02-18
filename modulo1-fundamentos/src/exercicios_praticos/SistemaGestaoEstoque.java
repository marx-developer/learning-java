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
import java.util.ArrayList;

public class SistemaGestaoEstoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcaoMenu; // Variável para armazenar a escolha do usuário.
		
		ArrayList<String> prodCadatrados = new ArrayList<>();
		prodCadatrados.add("Arroz");
		prodCadatrados.add("Feijão");
		prodCadatrados.add("Macarrão");
		prodCadatrados.add("Açucar");
		
		ArrayList<Integer> qtdProd = new ArrayList<>();
		qtdProd.add(10);
		qtdProd.add(15);
		qtdProd.add(18);
		qtdProd.add(5);

		/*String[] prodCadatrados = new String[] { "Arroz", "Feijão", "Macarrão", "Açucar", "Leite", "Oleo" };
		int[] qtdProd = new int[] { 5, 4, 5, 4, 3, 2 };
		int totalProd = 5;*/

		System.out.printf("================== MENU GESTÃO DE ESTOQUE ==================\n");
		System.out.println("\n1. Cadastrar Novo Produto");
		System.out.println("2. Adicionar Estoque");
		System.out.println("3. Remover Estoque");
		System.out.println("4. Exibir Estoque");
		System.out.printf("5. Sair\n");
		System.out.printf("\n============================================================\n");

		while (true) {
			System.out.printf("\nEscolha uma opção do menu: ");
			System.out.printf("");
			opcaoMenu = sc.nextInt(); // Recebendo a escolhida opção do usuário.
			sc.nextLine(); // Limpar buffer

			// Condicional com if/else, caso o usuário escolha sair ou escolha uma opção
			// inválida.
			if (opcaoMenu == 5) {
				System.out.printf("\nSistema encerrado. Obrigado!");
				break;
			} else if (opcaoMenu <= 0 || opcaoMenu >= 5) {
				System.out.printf("\nOpção Inválida. Tente novamente!\n");
			}

			// Condicional com switch para as demais ecolhas.
			switch (opcaoMenu) {
			case 1 -> {
				// Recebendo o nome do produto
				System.out.printf("\nDigite o nome do produto: ");
				String addNewProd = sc.nextLine(); // Armazenando o nome do produto na variável

				// Loop caso o produto já esteja em estoque
				for (int i = 0; i < prodCadatrados.size();) {
					if (prodCadatrados.get(i).contains(addNewProd)) {
						System.out.printf("\nProduto em estoque. Deseja adicionar estoque? (Sim/Nao): ");
						String respNewProd = sc.nextLine();
						if (respNewProd.equalsIgnoreCase("Sim")) {
							System.out.printf("\nQuantidade a adicionar: ");
							int qtdAdd = sc.nextInt();
							if (qtdAdd > 0) {
								
								qtdProd.set(i, qtdAdd);
								System.out.printf("\nEstoque atualizado! Retornando ao menu...\n");
								System.out.printf("\n============================================================\n");
							} else {
								System.out.printf("Quantidade inválida! Retornando ao menu...\n");
								System.out.printf("\n============================================================\n");
							}
						} else if (respNewProd.equalsIgnoreCase("Nao") || respNewProd.equalsIgnoreCase("Não")) {
							System.out.println("\nOk! Retornando ao menu...");
							System.out.printf("\n============================================================\n");
						} else {
							System.out.println("Opção Inválida! Retornando ao menu...");
							System.out.printf("\n============================================================\n");
						}
						break;
					} else {
						prodCadatrados.add(addNewProd);
						System.out.print("Quantidade: ");
						int qtdAdd = sc.nextInt();
						prodCadatrados.add(addNewProd);
						qtdProd.add(qtdAdd);

						System.out.printf("\nProduto cadastrado com sucesso! Retornando ao menu...\n");
						System.out.printf("\n============================================================\n");
						break;
					}
				}

			}/*
			case 2 -> {
				// Exibindo produtos cadastrados
				System.out.printf("\n=================== PRODUTOS CADASTRADOS ===================\n\n");
				for (int i = 0; i < prodCadatrados.size(); i++) {
					System.out.println(prodCadatrados.get(i) + ": " + qtdProd.get(i) + " unidades");
				}
				// Recebendo o nome do produto
				System.out.printf("\nDigite o nome do produto para adicionar estoque: ");
				String addEstoProd = sc.nextLine(); // Armazenando o nome do produto na variável
				boolean prodAddLoc = false;

				for (int i = 0; i < prodCadatrados.size(); i++) {
					if (prodCadatrados.contains(addEstoProd)) {
						System.out.print("Quantidade a adicionar: ");
						int qtdAdd = sc.nextInt();
						if (qtdAdd > 0) {
							qtdProd.add(qtdAdd);
							System.out.println("\nEstoque atualizado!");
						} else {
							System.out.println("Quantidade inválida! Retornando ao menu...");
						}
						prodAddLoc = true;
						break;
					} 
				}
				if (!prodAddLoc)
					System.out.printf("\nProduto não encontrado! Retornando ao menu...\n");
				System.out.printf("\n============================================================\n");
				break;
			}
			case 3 -> {
				// Exibindo produtos cadastrados
				System.out.printf("\n============== PRODUTOS CADASTRADOS ==============\n\n");
				for (int i = 0; i < prodCadatrados.size(); i++) {
					System.out.println(prodCadatrados[i] + " ➝ " + qtdProd[i] + " unidades");
				}
				// Recebendo o nome do produto
				System.out.printf("\nDigite o nome do produto para remover estoque: ");
				String removerProd = sc.nextLine(); // Armazenando o nome do produto na variável
				boolean prodRemLoc = false;

				for (int i = 0; i < prodCadatrados.size(); i++) {
					if (prodCadatrados[i].equalsIgnoreCase(removerProd)) {
						System.out.printf("\nQuantidade a remover: ");
						int qtdRem = sc.nextInt();
						if (qtdRem > 0 && qtdRem <= qtdProd[i]) {
							qtdProd[i] -= qtdRem;
							System.out.println("Estoque atualizado!");
						} else {
							System.out.printf("\nQuantidade inválida! Retornando ao menu...");
						}
					}
					prodRemLoc = true;
					break;
				}
				if (!prodRemLoc)
					System.out.printf("\nProduto não encontrado!\n");
				break;
			}*/
			case 4 -> {
				System.out.printf("\n====================== ESTOQUE  ATUAL ======================\n\n");
				// Exibindo produtos
				for (int i = 0; i < prodCadatrados.size(); i++) {
					System.out.println(prodCadatrados.get(i) + ": " + qtdProd.get(i) + " unidades");
				}
				
				break;
			}
			} // Final do switch

		} // Final do while
		//sc.close();
	}
}