package exercicio01;

public class Aluno {
    // variáveis globais
    // atributos ou propriedades ou campos ou variáveis de instância --> instância = objeto
    int rm;
    String nome;
    double nota1;
    double nota2;

    // método para calcular e retornar a média do aluno
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // método para retornar o status (aprovado ou reprovado) do aluno
    public String verificarStatus() {
        if (calcularMedia() >= 6.0) {
            return "ALUNO APROVADO";
        }
        return "ALUNO REPROVADO";
    }

    // método para retornar todos os dados do aluno
    public String getDados() {
        String aux = "";
        aux += "RM: " + rm + "\n";
        aux += "Nome: " + nome + "\n";
        aux += "Nota1: " + nota1 + "\n";
        aux += "Nota2: " + nota2;
        return aux;
    }
}
