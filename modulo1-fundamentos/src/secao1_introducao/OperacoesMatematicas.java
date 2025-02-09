/* OPERAÇÕES MATEMÁTICAS EM JAVA:
 * A classe Math do Java fornece métodos para realizar operações matemáticas básicas e avançadas, 
 * como cálculos de potência, arredondamento, geração de números aleatórios, trigonometria e mais.
 */

package secao1_introducao;

public class OperacoesMatematicas {

	public static void main(String[] args) {
		// Exemplos Práticos

		System.out.println("1. Obtendo o maior e o menor valor entre dois números com os métodso Math.max() e Math.min():");
		int a = 10, b = 20;
		System.out.println("Maior número: " + Math.max(a, b));
		System.out.println("Menor número: " + Math.min(a, b));
		System.out.println();

		System.out.println("2. Obtendo a potenciação com o método Math.pow():");
		double base = 3, expoente = 4;
		double resultado = Math.pow(base, expoente);
		System.out.println("O resultado de 3 elevado a 4 potência é: " + resultado);
		System.out.println();

		System.out.println("3. Obtendo a raiz quadrada com o método Math.sqrt():");
		double numero = 49;
		System.out.println("A raiz quadrada de 49 é: " + Math.sqrt(numero));
		System.out.println();

		System.out.println("4. Obtendo um valor absoluto com o método Math.abs():");
		int numeroAbs = -10;
		System.out.println("O valor absoluto de -10 é: " + Math.abs(numeroAbs));
		System.out.println();

		System.out.println("6. Arrendondando um valor com os métodos  Math.round(), Math.ceil(), Math.floor():");
		double numeroArd = 7.6;
		System.out.println("Arrendodando o valor 7.6: " + Math.round(numeroArd));
		System.out.println("Arrendodando o valor 7.6 para cima: " + Math.ceil(numeroArd));
		System.out.println("Arrendodando o valor 7.6 para baixo: " + Math.floor(numeroArd));
		System.out.println();

		System.out.println("6. Gerando números aleatórios com o método Math.random():");
		double aleatorio = Math.random(); // Retorna um número entre 0.0 e 1.0
		int aleatorioEntre1e10 = (int) (Math.random() * 10) + 1; // Convertendo um número aleatório para int
		System.out.println("Número aleatório: " + aleatorio);
		System.out.println("Número aleatório entre 1 e 10: " + aleatorioEntre1e10);
		System.out.println();

		System.out.println("7. Gerando o número PI e Euler com os métodos Math.PI e Math.E");
		System.out.println("Valor de PI: " + Math.PI);
		System.out.println("Valor de Euler: " + Math.E);
		System.out.println();

		System.out.println("8. Gerando o número Logaritmo Natural e Logaritmo Base 10 com os métodos Math.log() e Math.log10():");
		double numeroLog = 100;
		System.out.println("Logaritmo natural de 100: " + Math.log(numeroLog));
		System.out.println("Logaritmo base 10 de 100: " + Math.log10(numeroLog));
		System.out.println();

		System.out.println("9. Gerando Funções Trigonométricas com os métodos Math.sin(), Math.cos(), Math.tan())");
		double angulo = Math.toRadians(45); // Converte 45° para radianos
		System.out.println("Seno de 45°: " + Math.sin(angulo));
		System.out.println("Cosseno de 45°: " + Math.cos(angulo));
		System.out.println("Tangente de 45°: " + Math.tan(angulo));
		System.out.println();

		System.out.println("10. Convertendo Graus para Radianos e vice-versa com os métodos Math.toRadians(),  Math.toDegrees():");
		double graus = 180;
		double radianos = Math.toRadians(graus);
		System.out.println("180 graus em radianos: " + radianos);
		System.out.println("π radianos em graus: " + Math.toDegrees(Math.PI));
		System.out.println();

	}

}
