/* TIPO DE DADOS NÃO PRIMITIVOS EM JAVA: 
 * Java também possui tipos de dados não primitivos, que são referências para objetos. 
 * Estes tipos não armazenam diretamente os valores, mas sim uma referência ao local 
 * onde os dados estão armazenados na memória. 
 
 * Esses tipos incluem: 
 
 * STRING: 
 * Embora a String seja amplamente utilizada, ela é um objeto. 
 * Uma string representam uma sequência de caracteres.
 
 * ARRAYS:
 * Os arrays permitem armazenar múltiplos valores do mesmo tipo em uma estrutura indexada.
 * Ele possui um tamanho fixo após a inicialização.
 * Cada valor é armazenado em um índice que inicia em 0.
 
 * CLASSES: 
 * Classes são estruturas definidas pelo usuário para encapsular dados e comportamentos relacionados.
 * Uma classe contém:
 * - Atributos: Variáveis que representam os dados.
 * - Métodos: Funções que definem o comportamento.
 
 * INTERFACES: 
 * Interfaces são contratos que definem métodos que uma classe deve implementar.*/

package conteudos_praticos;

// EXEMPLO DE USO DA CLASSE
class Pessoa {
	// Atributos 
	String nome;
	int idade;
	
	// Métodos
	void apresentar() {
		 System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");
	}
}

public class TipoDeDadosNaoPrimitivos {

	public static void main(String[] args) {
		// EXEMPLOS DE USO:
		
		// String:
		String texto = "Utilizando uma string para armazenar um texo";
		System.out.println(texto);
		
		// Array: 
		int[] numeros = {10, 20, 30}; // inicializando e armazenando dados em um array do tipo inteiro,
		String[] nomes = new String[4]; // inicializando um array e definindo o tamanho.
		// Armazendo valores pela posição no array nomes:
		nomes[0] = "Marx"; 
		nomes[1] = "Beatriz";
		nomes[2] = "Laura";
		nomes[3] = "Leonardo";
		System.out.println(numeros[2]);
		
		// Utilizando a classe pessoa para gerar um novo objeto "Pessoa".
				Pessoa pessoa = new Pessoa();
				pessoa.nome = "Marx";
				pessoa.idade = 29;
				pessoa.apresentar();
	}
}