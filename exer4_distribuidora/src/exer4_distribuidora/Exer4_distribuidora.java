/* Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53
Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora. */
package exer4_distribuidora;

import java.text.DecimalFormat;

public class Exer4_distribuidora {

    public static void main(String[] args) {
        //declarando variáveis
        float SP = (float) 67.83643;
        float RJ = (float) 36.67866;
        float MG = (float) 29.22988;
        float ES = (float) 27.16548;
        float OUTROS = (float) 19.84953;
        float total;
        //formatação de números reais
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        //soma o faturamento mensal da distribuidora
        total = SP + RJ + MG + ES + OUTROS;
        System.out.println("Valor total mensal da distribuidora: R$ " + total);
        //impressão e cálculo do percentual de cada estado no valor total mensal da distribuidora
        System.out.println("Percentual de SP: " + decimalFormat.format((SP / total) * 100) + "%");
        System.out.println("Percentual de RJ: " + decimalFormat.format((RJ / total) * 100) + "%");
        System.out.println("Percentual de MG: " + decimalFormat.format((MG / total) * 100) + "%");
        System.out.println("Percentual de ES: " + decimalFormat.format((ES / total) * 100) + "%");
        System.out.println("Percentual de OUTROS: " + decimalFormat.format((OUTROS / total) * 100) + "%");
    }
}
