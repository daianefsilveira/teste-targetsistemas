/* 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou 
não a sequência.
IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; */
package exer2_fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer2_fibonacci {

    public static void main(String[] args) {
        //declarando variáveis
        int num;
        int primNumero = 0;
        int segNumero = 1;
        int aux;

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um número: ");
        num = ler.nextInt();
        
        ArrayList<Integer> seq = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            seq.add(primNumero); //adiciona número no array
            aux = primNumero;
            primNumero += segNumero;
            segNumero = aux;
        }
        System.out.println(seq);
        
        //verifica se o array contém o número informado 
        if (seq.contains(num)) { 
            System.out.println("O número informado pertence a sequência");
        } else {
            System.out.println("O número informado não pertence a sequência");
        }
    }
}
