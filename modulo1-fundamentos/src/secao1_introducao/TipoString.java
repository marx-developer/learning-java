/* STRING EM JAVA:
 * A classe String em Java é uma das mais importantes e usadas, pois representa sequências de 
 * caracteres. Como Java não possui um tipo primitivo específico para strings, a linguagem 
 * oferece a classe String, que faz parte do pacote java.lang e é imutável, ou seja, seu valor 
 * não pode ser alterado após a criação.
 * 
 * 
 */

package secao1_introducao;

public class TipoString {

	public static void main(String[] args) {
		// MÉTODOS IMPORTANTES DA CLASSE STRING:
		
		String firstName = "Marx";
		String secondName = "Santos";
		int idade = 29;
		String frase = "Aprendendo Programar em Java";

		System.out.println("1. length() - Obtendo o tamanho da String");
		System.out.println("O nome " + firstName + " possui " + firstName.length() + " caracteres");
		System.out.println();

		System.out.println("2. charAt() - Obtendo um caractere específico:");
		System.out.println("A primeira letra do nome " + firstName + " e " + firstName.charAt(0));
		System.out.println("A última letra do nome " + firstName + " e " + firstName.charAt(3));
		System.out.println();

		System.out.println("3. substring() - Extraindo parte da String:");
		System.out.println(frase.substring(0, 10));
		System.out.println(frase.substring(11, 20));
		System.out.println(frase.substring(24));
		System.out.println();

		System.out.println("4. contains() - Verificando se a String contém uma palavra:");
		System.out.println(frase.contains("Java"));
		System.out.println(frase.contains("Python"));
		System.out.println();

		System.out.println("5. startsWith() e endsWith() - Verificando se a String inicia e finaliza com determinada palavra");
		System.out.println(frase.startsWith("Aprendendo"));
		System.out.println(frase.endsWith("JavaScript"));
		System.out.println();

		System.out.println("6. toUpperCase() e toLowerCase() - Convertendo a frase para maiúsculas e minúsculas");
		System.out.println(frase.toUpperCase());
		System.out.println(frase.toLowerCase());
		System.out.println();

		System.out.println("7. replace() - Substituindo caracteres ou palavras");
		System.out.println(frase.replace("Java", "JavaScript"));
		System.out.println(frase.replace("o", "0"));
		System.out.println();

		System.out.println("8. trim() - Removendo espaços extras");
		String textoEspacado = "   Olá, Java!   ";
		System.out.println("Antes do trim: [" + textoEspacado + "]");
		System.out.println("Depois do trim: [" + textoEspacado.trim() + "]");
		System.out.println();

		System.out.println("9. split() - Dividindo uma String em partes");
		String linguagens = "Java,Python,C++,JavaScript";
		String[] array = linguagens.split(",");

		for (String lang : array) {
			System.out.println(lang);
		}
		System.out.println();
		
		System.out.println("10. equals() e equalsIgnoreCase() - Comparando Strings");
		String palavra1 = "Java";
        String palavra2 = "java";
        System.out.println(palavra1.equals(palavra2)); 
        System.out.println(palavra1.equalsIgnoreCase(palavra2));
        System.out.println();
        
        System.out.println("11. String.format() - Formatando Strings");
        String mensagem = String.format("Meu nome é %s dos %s e tenho %d anos.", firstName, secondName, idade);
        System.out.println(mensagem);
        System.out.println();
        
        System.out.println("12. String.valueOf() - Convertendo outros tipos para String");
        int numero = 123;
        double preco = 99.99;
        boolean ativo = true;
        String strNumero = String.valueOf(numero);
        String strPreco = String.valueOf(preco);
        String strAtivo = String.valueOf(ativo);
        System.out.println(strNumero); 
        System.out.println(strPreco); 
        System.out.println(strAtivo); 
	}

}
