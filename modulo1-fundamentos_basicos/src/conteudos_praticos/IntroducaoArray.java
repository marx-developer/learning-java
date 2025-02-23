/* INTRODUÇÃO A ARRAYS
 * Um array é uma estrutura de dados que armazena múltiplos valores do mesmo tipo em uma única 
 * variável. Ele é usado quando queremos trabalhar com uma coleção de elementos sem precisar 
 * criar várias variáveis separadas.
 * 
 * Em Java, os arrays:
 * Possuem tamanho fixo (definido no momento da criação).
 * São indexados a partir de 0 (ou seja, o primeiro elemento está na posição 0).
 * Podem armazenar tipos de dados primitivos e não primitivos.
 * 
 * A sintaxe básica para declarar um array é:
 * tipo[] nomeArray; 
 * nomeArray = new tipo[tamanho];
 * 
 * Ou diretamente:
 * tipo[] nomeArray = new tipo[tamanho];
 * 
 * Também podemos inicializar um array com valores diretamente:
 * int[] numeros = {10, 20, 30, 40, 50};
 */

package conteudos_praticos;

public class IntroducaoArray {

	public static void main(String[] args) {
		// Criando um array do tipo String com 5 posições.
		String[] carros = new String[5];

		// Atribuindo valores as posições do array
		carros[0] = "BMW";
		carros[1] = "Mercedez";
		carros[2] = "Porsche";
		carros[3] = "Lamborghini";
		carros[4] = "Audi";

		// Acessando os valores do array
		System.out.println("Elemento na posição 2: " + carros[2]);
		System.out.println("Elemento na posição 0: " + carros[0]);
		System.out.println("Elemento na posição 5: " + carros[4]);

		// Alterando um elemento do array
		carros[4] = "Toyota";
		System.out.println("Elemento na posição 5 (alterado): " + carros[4]);

		// Verificando o comprimento do array
		System.out.println("Comprimento do array: " + carros.length);
	}

}
