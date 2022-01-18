package exer3_faturamento;

public class FaturamentoControle {
    //declarando variáveis
    private int dia;
    private double valor;
    //criando os métodos
    void menorValor(FaturamentoControle[] faturamentoControleArray) {
        double minimoValor = faturamentoControleArray[0].getValor();
        for (FaturamentoControle faturamento : faturamentoControleArray) {
            double valorAtual = faturamento.getValor();
            if (valorAtual < minimoValor && valorAtual != 0) {
                minimoValor = valorAtual;
            }
        }
        System.out.println("O menor valor de faturamento é: R$ " + minimoValor);
    }

    void maiorValor(FaturamentoControle[] faturamentoControleArray) {
        double maximoValor = faturamentoControleArray[0].getValor();
        for (FaturamentoControle faturamento : faturamentoControleArray) {
            double valorAtual = faturamento.getValor();
            if (valorAtual > maximoValor) {
                maximoValor = valorAtual;
            }
        }
        System.out.println("O maior valor de faturamento é: R$ " + maximoValor);
    }

    void valorSuperior(FaturamentoControle[] faturamentoControleArray) {
        int somaValores = 0;
        int contadorDeNumeros = 0;
        for (FaturamentoControle faturamentoMes : faturamentoControleArray) {
            if (faturamentoMes.getValor() != 0) {
                somaValores += faturamentoMes.getValor();
                ++contadorDeNumeros;
            }
        }
        int media = somaValores / contadorDeNumeros;
        System.out.println("Média de faturamento mensal R$ " + somaValores / contadorDeNumeros);

        for (FaturamentoControle faturamentoMes : faturamentoControleArray) {
            if (faturamentoMes.getValor() > media) {
                System.out.println("Dia " + faturamentoMes.getDia() + " foi superior a média");
            }
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "faturamentoControle{" + "dia=" + dia + ", valor=" + valor + '}';
    }

}
