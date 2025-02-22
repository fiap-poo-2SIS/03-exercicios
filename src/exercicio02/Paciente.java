package exercicio02;

public class Paciente {
    // atributos ou variáveis de instância
    String nome;
    int idade;

    // método para calcular e retorar a frequência cardíaca máxima
    public int calcularFrequenciaMaxima() {
        return 220 - idade;
    }

    /*
        para o cálculo da frequência cardíaca alvo tem-se duas possibilidades:
        1. criar dois métodos: um para calcular e retornar o alvo mínimo e outro para
                               calcular e retornar o alvo máximo
        2. criar um método que retorne um array de duas posições contendo os dois valores do alvo
     */
    public double[] calcularFrequenciaAlvo() {
        double[] alvo = new double[2];
        int frequenciaMaxima = calcularFrequenciaMaxima();

        alvo[0] = frequenciaMaxima * 0.5;
        alvo[1] = frequenciaMaxima * 0.85;

        return alvo;
    }
}
