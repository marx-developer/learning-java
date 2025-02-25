/* INTRODUÇÃO AOS MÉTODOS 
 * - Os métodos são blocos de códigos que só é executado quando é chamado. Eles executam 
 * uma tarefa específica e também são conhecidos como funções. 
 * - Os métodos tem a finalidade de definir o código uma vez e utiliza-lo muitas vezes.
 * - Eles ajudam a organizar o código, evitando repetições e tornando o programa mais 
 * modular e reutilizável.
 * 
 * 
 * SINTAXE DE UM MÉTODO:
 * Um método deve ser declarado dentro de uma classe. Ele é definido com o nome do método, 
 * seguido por parênteses:
 
 	modificador_retorno nomeDoMetodo(parâmetros) {
	    // Corpo do método
	    return valor; // (se necessário)
	}

 * modificador → Define a visibilidade do método (public, private, protected ou sem modificador).
 * retorno → Tipo de dado que o método retorna (void se não retornar nada).
 * nomeDoMetodo → Nome do método (seguindo a convenção camelCase).
 * parâmetros → Variáveis que o método recebe (pode ser vazio).
 * corpo do método → Bloco de código que define o comportamento do método.
 * 
 * 
 * TIPOS BÁSICOS DE MÉTODOS:
 * 1. Métodos Simples (ou de Instância): São os métodos "comuns", chamados a partir de um objeto da classe.
 * 2. Métodos Estáticos (static): Pertencem à classe, e não a uma instância (objeto). Podem ser chamados sem criar um objeto.
 * 3. Métodos com Retorno: Devolvem um valor ao chamador, usando a palavra-chave return.
 * 4. Métodos void (sem retorno): Executam uma ação, mas não retornam valores.
 * 5. Métodos com Parâmetros: Recebem valores ao serem chamados, para personalizar sua execução.
 */

package conteudos_praticos;

public class introducaoMetodos {
	// EXEMPLO MÉTODO SIMPLES: Método que exibe uma mensagem simples.
	public void mostrarMensagem() {
		System.out.println("Olá! Este é um método simples em Java.");
	}

	// EXEMPLO MÉTODO ESTÁTICO (STATIC): Método que retorna a soma de dois números.
	public static int somar(int a, int b) {
		return a + b;
	}

	// EXEMPLO MÉTODO COM RETORNO: Método que retorna a multiplicação de dois números
	public int multiplicar(int a, int b) {
		return a * b;
	}

	// EXEMPLO MÉTODO SEM RETORNO (VOID)
	public void exibirAlerta() {
		System.out.println("Atenção! Isso é um alerta.");
	}

	// EXEMPLO MÉTODO COM PARÂMETROS
	public void dizerOla(String nome) {
		System.out.println("Olá, " + nome + "!");
	}
	
	

	public static void main(String[] args) {
		// CHAMANDO OS MÉTODOS
		
		// Chamando o método simples
		introducaoMetodos exemploMetodo = new introducaoMetodos(); // Criando um objeto da classe
		exemploMetodo.mostrarMensagem(); // Chamando o método que retorna a mensagem.

		// Chamando o método estático.
		int resultado = somar(5, 3);
		System.out.println("Soma: " + resultado);
		
		// Chamando o método com retorno
		
	}

}