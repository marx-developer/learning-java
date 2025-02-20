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
		// Adicionando produtos.
		prodCadatrados.add("Arroz");
		prodCadatrados.add("Feijão");
		prodCadatrados.add("Sal");
		prodCadatrados.add("Açucar");

		ArrayList<Integer> qtdProdCadatrados = new ArrayList<>();
		// Adicionando a quantidade dos produtos cadastrados.
		qtdProdCadatrados.add(10);
		qtdProdCadatrados.add(15);
		qtdProdCadatrados.add(18);
		qtdProdCadatrados.add(5);

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

			// Condicional com if/else, caso o usuário escolha sair ou escolha uma opção inválida.
			if (opcaoMenu == 5) {
				System.out.printf("\nSistema encerrado. Obrigado!");
				break;
			} else if (opcaoMenu <= 0 || opcaoMenu >= 5) {
				System.out.printf("\nOpção Inválida. Tente novamente!\n");
			}

			// Condicional com switch para as demais escolhas.
			switch (opcaoMenu) {
				case 1 -> {
					// Recebendo o nome do produto para ser adicionado no sistema.
					System.out.printf("\nDigite o nome do produto: ");
					String addNewProd = sc.nextLine();
					boolean prodLoc = false;
	
					// Verificando se o produto já existe em estoque.
					for (int i = 0; i < prodCadatrados.size(); i++) {
						// Capturando o índice do produto no array se ele já estiver em estoque.
						int iProdCad = prodCadatrados.indexOf(addNewProd);
	
						// Condicional caso o produto ja esteja em estoque.
						if (prodCadatrados.contains(addNewProd)) {
							System.out.printf("\nProduto em estoque. Deseja adicionar estoque? (Sim/Nao): ");
							String respNewProd = sc.nextLine();
	
							if (respNewProd.equalsIgnoreCase("Sim")) {
								System.out.printf("\nQuantidade a adicionar: ");
								int qtdAdd = sc.nextInt();
								if (qtdAdd > 0) {
									// Adicionando o quantidade do produto e somando ao valor atual.
									qtdProdCadatrados.set(iProdCad, qtdProdCadatrados.get(iProdCad) + qtdAdd);
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
							prodLoc = true;
							break;
						} 
					}
					if (!prodLoc) {
						// Adicionando o produto em estoque caso não esteja cadastrado.
						prodCadatrados.add(addNewProd);

						System.out.print("Quantidade: ");
						int qtdAdd = sc.nextInt();
						qtdProdCadatrados.add(qtdAdd);

						System.out.printf("\nProduto cadastrado com sucesso! Retornando ao menu...\n");
						System.out.printf("\n============================================================\n");
					}
				}
				case 2 -> {
					// Exibindo produtos cadastrados
					System.out.printf("\n=================== PRODUTOS CADASTRADOS ===================\n\n");
					for (int i = 0; i < prodCadatrados.size(); i++) {
						System.out.println(prodCadatrados.get(i) + ": " + qtdProdCadatrados.get(i) + " unidades");
					}
					// Recebendo o nome do produto
					System.out.printf("\nDigite o nome do produto para adicionar estoque: ");
					String addEstoque = sc.nextLine(); // Armazenando o nome do produto na variável
					boolean prodLoc = false;
	
					for (int i = 0; i < prodCadatrados.size(); i++) {
						int indice = prodCadatrados.indexOf(addEstoque);
	
						if (prodCadatrados.contains(addEstoque)) {
							System.out.print("Quantidade a adicionar: ");
							int qtdAdd = sc.nextInt();
							if (qtdAdd > 0) {
								qtdProdCadatrados.set(indice, qtdProdCadatrados.get(indice) + qtdAdd);
								System.out.printf("\nEstoque atualizado! Retornando ao menu...\n");
								System.out.printf("\n============================================================\n");
							} else {
								System.out.printf("Quantidade inválida! Retornando ao menu...\n");
								System.out.printf("\n============================================================\n");
							}
							prodLoc = true;
							break;
						}
					}
					if (!prodLoc) {
						System.out.printf("\nProduto não encontrado! Retornando ao menu...\n");
						System.out.printf("\n============================================================\n");
					}
				}
				case 3 -> {
					// Exibindo produtos cadastrados
					System.out.printf("\n=================== PRODUTOS CADASTRADOS ===================\n\n");
					for (int i = 0; i < prodCadatrados.size(); i++) {
						System.out.println(prodCadatrados.get(i) + ": " + qtdProdCadatrados.get(i) + " unidades");
					}
					// Recebendo o nome do produto
					System.out.printf("\nDigite o nome do produto para remover estoque: ");
					String remProd = sc.nextLine(); // Armazenando o nome do produto na variável
					boolean prodLoc = false;
	
					for (int i = 0; i < prodCadatrados.size(); i++) {
						int indice = prodCadatrados.indexOf(remProd);
	
						if (prodCadatrados.contains(remProd)) {
							System.out.printf("\nQuantidade a remover: ");
							int qtdRem = sc.nextInt();
	
							if (qtdRem > 0 && qtdRem <= qtdProdCadatrados.get(indice)) {
								qtdProdCadatrados.set(indice, qtdProdCadatrados.get(indice) - qtdRem);
								System.out.printf("\nEstoque atualizado! Retornando ao menu...\n");
								System.out.printf("\n============================================================\n");
							} else {
								System.out.printf("Quantidade inválida! Retornando ao menu...\n");
								System.out.printf("\n============================================================\n");
							}
							prodLoc = true;
							break;
						}
					}
					if (!prodLoc) {
						System.out.printf("\nProduto não encontrado! Retornando ao menu...\n");
						System.out.printf("\n============================================================\n");
					}
				}
				case 4 -> {
					System.out.printf("\n====================== ESTOQUE  ATUAL ======================\n\n");
					// Exibindo produtos cadastrados
					for (int i = 0; i < prodCadatrados.size(); i++) {
						System.out.println(prodCadatrados.get(i) + ": " + qtdProdCadatrados.get(i) + " unidades");
					}
					System.out.printf("\n============================================================\n");
				}
			} // Final do switch
		} // Final do while
		
		sc.close();
	}
}