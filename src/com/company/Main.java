/*
 Tratamento de exceções:
 Exemplo: int numero 2 = L.
 Temos que impedir que o usuário entre com valores não esperados.
 Não podemos deixar que "L" seja inserido pelo usuário em uma variável do tipo int.

---------------PARSE:
Parses the string argument as a signed decimal integer.
String s = "12.34";
double d = Double.parseDouble (s);
Isto CONVERTE a String para double.
O integer.parse serve para converter uma string para um número inteiro.
Mas letras não podem ser atribuídas a variáveis int, então a exceção precisa ser tratada,
para que o sistema não permita a inserção deste valor e apresente erros.
Ao executar o código, a seguinte mensagem é mostrada quando a execução chega nesta linha:
Exception in thread "main" java.lang.NumberFormatException: For input string: "L"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at com.company.Main.main(Main.java:23)

	Try / Catch, como vimos no curso anterior, é o método adequado para tratar as exceções.
	Selecionar o bloco de código e executar: CODE > SURROUND WITH > TRY CATCH.

    A IDEIA É:
    TRY = TENTE EXECUTAR
    CATCH (PEGAR) = TENTE RESOLVER A EXCEÇÃO QUE SURGIU (1º TENTATIVA PARA RESOLVER)
    FINALLY = SE NÃO CONSEGUIU RESOLVER NO CATH, EXECUTE ESTE BLOCO (2º TENTATIVA PARA RESOLVER)

    OBS.: NESTE CÓDIGO, NÃO HÁ A SOLUÇÃO PARA A EXCEÇÃO, MAS APENAS ESTÁ SENDO MOSTRADO
    COMO TRATAR A EXCEÇÃO COM TRY / CATCH / FINALLY
*/

package com.company;

public class Main {

    public static void main(String[] args) {
        int numero1 = 8;
        System.out.println(numero1);
        int numero2 = Integer.parseInt("9");
        System.out.println(numero2);

        // Este é um teste que permite vermos que o sout ("Depois do try"!) não..
        // está sendo executado. Pula direto para catch.
        try {
            System.out.println("Antes do try!");
            int numero3 = Integer.parseInt("X");
            System.out.println(numero3);
            System.out.println("Depois do try!");
        } catch (NumberFormatException e) {
            System.out.println("Formato inválido!");
            //e.printStackTrace();
            //Comentei a linha acima porque ela é responsável por mostrar o erro de exceção.
            // esta linha é inserida automaticamente pelo IntellijIdea, ao contrário do Eclipse.
            // Prints this throwable and its backtrace to the standard error stream.
            // This method prints a stack trace for this Throwable object on the error output stream that is the value of the field System.err.
            // The first line of output contains the result of the toString() method for this object.
            // Remaining lines represent data previously recorded by the method fillInStackTrace().
            // The format of this information depends on the implementation.
            // O erro existe, só não está sendo mostrado para o usuário.
        } finally {
            System.out.println("Inserção de finally!");
        }
    }
}
