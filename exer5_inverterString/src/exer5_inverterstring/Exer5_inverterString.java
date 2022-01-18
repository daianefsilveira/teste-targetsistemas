/* 5) Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse; */
package exer5_inverterstring;

public class Exer5_inverterString {

    public static void main(String[] args) {
        //declarando variáveis
        String palavra = "TARGET SISTEMAS";
        String resultado = "";
        //loop p/ captura, inversão e saída de dados
        for (int x = palavra.length() - 1; x >= 0; x--) {
            resultado = resultado + palavra.charAt(x);
        }
        System.out.println(resultado);
    }
}
