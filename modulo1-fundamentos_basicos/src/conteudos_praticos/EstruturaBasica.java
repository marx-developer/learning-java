// ESTRUTURA BÁSICA DE UM PROGRAMA JAVA

package conteudos_praticos; 

/* IMPORTAÇÃO DE PACOTES: 
 * Se o programa precisar usar classes de outros pacotes, é necessário importá-las. Por exemplo: */
import java.util.Scanner; // O Scanner é usado para ler dados do usuário.

/* DECLARAÇÃO DE UMA CLASSE: 
 * - Toda aplicação/código Java deve ser definida dentro de uma classe.
 * - A palavra-chave class é usada para definir uma classe.
 * - O nome da classe deve ser o mesmo nome do arquivo .java. */
public class EstruturaBasica {
	
	/* MÉTODO MAIN: 
	 * - É O ponto de entrada para a execução do programa. 
	 * - Este método é executado automaticamente quando o programa inicia.
	 * - Ele deve ser definido exatamente assim: */
	public static void main(String[] args) {
		
		// public: Torna o método acessível de qualquer lugar.
		// static: Permite executar o método sem precisar criar um objeto da classe.
		// void: Indica que o método não retorna nenhum valor.
		// String[] args: Argumentos de linha de comando (opcional).
		
		// Utilizando o método para receber dados que foi importado através no pacote.
		Scanner sc = new Scanner(System.in);
		sc.close();
				
		// Corpo do programa
		System.out.println("Olá, mundo!");
	}
}