/* ESTRUTURA DE REPETIÇÃO FOR-EACH (Para Cada)
 * O for-each é uma variação do laço for que é usado para percorrer elementos de arrays e 
 * coleções de forma mais simples e legível.
 * 
 * 
 * SINTAXE:
 	for (Tipo variavel : coleção) {
    	// Código a ser executado
	}
 *
 *
 * EXPLICAÇÃO DA SINTAXE:
 * Tipo → Tipo dos elementos da coleção (ex: int, String, double).
 * variavel → Variável temporária que recebe cada elemento durante a iteração.
 * coleção → O array ou coleção que será percorrido.
 * 
 * 
 * FLUXO DE EXECUÇÃO:
 * 1. Pega o primeiro elemento da coleção e armazena na variável temporária.
 * 2. Executa o código dentro do bloco { }.
 * 3. Passa para o próximo elemento e repete o processo.
 * 4. Para a execução quando não houver mais elementos na coleção.
 */


package conteudos_praticos;

public class LoopForEach {

	public static void main(String[] args) {
		// EXEMPLO PRÁTICO 3: Percorrendo um Array para exibir mensagens com os nomes armazenados.
		String[] nomesClientes = { "Marx", "Emily Beatriz", "Laura", "Leonardo" };
		
		for (String nome : nomesClientes) {
			System.out.println("Olá, " + nome + "! Obrigado por comprar conosco!");
		}
		
		// EXEMPLO PRÁTICO 2: Calculando o Total de Vendas no Mês
		double[] valoresVendidos = { 1450.50, 1233.54, 1221.00, 3450.89, 1090.90 };
		double totalVendas = 0;
		
		System.out.printf("\nVALORES VENDIDOS: \n");
		
		for (double valores : valoresVendidos) {
			System.out.printf("R$ %.2f\n", valores);
			totalVendas += valores;
		}
		
		System.out.printf("VALOR TOTAL DE VENDAS: R$ %.2f\n ", totalVendas);
	}

}
