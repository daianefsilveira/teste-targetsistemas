/* Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média; */
package exer3_faturamento;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import java.io.FileReader;

public class Exer3_faturamento {

    public static void main(String[] args) {
        //declarando variáveis
        JsonArray jsonArray;
        Gson gson = new Gson();
        JsonParser jsonParser = new JsonParser();

        try {
            jsonArray = (JsonArray) jsonParser.parse(new FileReader("dados.json")); //pegando dados do json
            FaturamentoControle[] faturamentoControleArray = gson.fromJson(jsonArray, FaturamentoControle[].class); //conversão do json p/ gson
            //instanciando objeto da classe para inicializar os atributos e invocar os métodos.
            FaturamentoControle faturamentoControle = new FaturamentoControle();
            //invocando os métodos 
            faturamentoControle.menorValor(faturamentoControleArray); 
            faturamentoControle.maiorValor(faturamentoControleArray);
            faturamentoControle.valorSuperior(faturamentoControleArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
