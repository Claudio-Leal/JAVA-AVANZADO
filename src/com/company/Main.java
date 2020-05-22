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
O integer.parse serve para converter uma string (no exemplo, a letra L) ou o valor que corresponde a ela,...
para um número inteiro.
Ao executar o código, a seguinte mensagem é mostrada quando a execução chega nesta linha:
Exception in thread "main" java.lang.NumberFormatException: For input string: "L"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at com.company.Main.main(Main.java:23)
Este é um exemplo de exceção que precisa ser tratada.
*/

package com.company;

public class Main {

    public static void main(String[] args) {
        int numero1 = 8;
        int numero2 = Integer.parseInt("L");
        System.out.println(numero1);
        System.out.println(numero2);
    }
}
