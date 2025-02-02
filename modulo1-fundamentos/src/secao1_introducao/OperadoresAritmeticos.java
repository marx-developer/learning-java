/* OPERADORES ARITMÉTICOS EM JAVA: 
 * Os operadores aritméticos são usados para realizar operações matemáticas básicas, 
 * como soma, subtração, multiplicação, divisão e cálculo de resto. Esses operadores 
 * são aplicados a variáveis numéricas, como int, float, double, etc. 
 */

/* OPERADORES ARITMÉTICOS BÁSICOS:
 * Soma: +
 * Subtração: -
 * Multiplicação: * 
 * Divisão (inteira ou real): / 
 * Módulo (resto da divisão) % 
 */

/* ATRIBUIÇÕES COM OPERADORES ARITMÉTICOS:
 * É possível combinar operadores aritméticos com o operador de atribuição (=):
 * +=
 * -=
 * *=
 * /=
 * %=
 */

/* PRECEDÊNCIA DOS OPERADORES ARITMÉTICOS:
 * Em Java, a ordem de execução dos operadores segue a precedência matemática:
 * 1. Parênteses: Calculados primeiro.
 * 2. Multiplicação, Divisão e Módulo (, /, %): Realizados antes de soma e subtração.
 * 3. Soma e Subtração (+, -): Realizados por último.
 */

/* OPERADORS DE INCREMENTO E DECREMENTO:
 * ++: Adiciona 1 ao valor de uma variável.
 * --: Subtrai 1 do valor de uma variável.
 */

/* OPERAÇÕES MATEMÁTICAS: 
 * Java fornece a classe Math para operações matemáticas avançadas.
 * Math.pow(x, y): Retorna a potência de um valor. 
 * Math.sqrt(x): Retorna a raiz quadrada de um valor.
 * Math.abs(x): Retorna o valor absoluto de um valor. 
 * Math.round(x): Retorna o arredondamento de um valor. 
 * Math.random(): Retorna um número aleatório (0.0 a 1.0).
 * Math.PI: Retorna o valor de PI.
 */

package secao1_introducao;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// EXEMPLO PRÁTICO OPERADORES ARITMÉTICOS:		
		int a = 10, b = 3;

        System.out.println("Soma: " + (a + b)); // Soma
        System.out.println("Subtração: " + (a - b)); // Subtração
        System.out.println("Multiplicação: " + (a * b)); // Multiplicação
        System.out.println("Divisão Inteira: " + (a / b)); // Divisão inteira
        System.out.println("Módulo (resto): " + (a % b)); // Resto da divisão
        
        System.out.println();
        
        // EXEMPLO PRÁTICO DE ATRIBUIÇÕES COM OPERADORES ARITMÉTICOS:
        int x = 10;

        x += 5; // x = x + 5
        System.out.println("Após soma: " + x); // 15
        x -= 3; // x = x - 3
        System.out.println("Após subtração: " + x); // 12
        x *= 2; // x = x * 2
        System.out.println("Após multiplicação: " + x); // 24
        x /= 4; // x = x / 4
        System.out.println("Após divisão: " + x); // 6
        x %= 3; // x = x % 3
        System.out.println("Após módulo: " + x); // 0
        
        System.out.println();
        
        // EXEMPLO PRÁTICO COM PRECEDÊNCIA DE OPERADORES
        int resultado = 10 + 5 * 2; // Multiplicação tem precedência
        System.out.println("Sem parênteses: " + resultado); // 20

        resultado = (10 + 5) * 2; // Parênteses alteram a precedência
        System.out.println("Com parênteses: " + resultado); // 30
        
        System.out.println();
        
        // EXEMPLO PRÁTICO COM OPERADORES DE INCREMENTO E DECREMENTO 
        // Incremento:
        int exemploIncremento = 5;
        System.out.println("Exemplo Incremento");
        System.out.println("Valor inicial da variável: " + exemploIncremento);
        System.out.println("Valor após o Pré-incremento: " + ++exemploIncremento); // Pré-incremento: imprime 6
        System.out.println("Valor após o Pós-incremento: " + exemploIncremento++); // Pós-incremento: imprime 6, depois a vira 7
        System.out.println("Valor final: " + exemploIncremento);
        System.out.println();
        
        // Decremento:
        int exemploDecremento = 5;
        System.out.println("Exemplo Decremento");
        System.out.println("Valor inicial da variável: " + exemploDecremento);
        System.out.println("Valor após o Pré-decremento: " + --exemploDecremento); // Pré-decremento: imprime 4
        System.out.println("Valor após o Pós-decremento: " + exemploDecremento--); // Pós-decremento: imprime 4, depois b vira 3
        System.out.println("Valor final: " + exemploDecremento);
        
        System.out.println();
        
        // EXEMPLO PRÁTICO COM OPERAÇÕES MATEMÁTICAS COM A CLASSE MATH
        double base = 2.0;
        double expoente = 3.0;
        double resultadoFinal = Math.pow(base, expoente); // Potência

        System.out.println("2 elevado a 3 é: " + resultadoFinal);
        System.out.println("Raiz quadrada de 16: " + Math.sqrt(16));
        System.out.println("Valor absoluto de -10: " + Math.abs(-10));
        
	}

}
