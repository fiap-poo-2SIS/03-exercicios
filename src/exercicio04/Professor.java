package exercicio04;

public class Professor {
    // atributos ou variáveis de instância
    String nome;
    int totalDeAulas;
    double valorHoraAula;

    // método para calcular o valor do salário do professor
    public double calcularSalario() {
        double salario, salarioBase, horaAtividade, descanso;

        salarioBase = totalDeAulas * 4.5 * valorHoraAula;
        horaAtividade = salarioBase * 5 / 100;
        descanso = (salarioBase + horaAtividade) / 6;
        salario = salarioBase + horaAtividade + descanso;

        return salario;
    }
}
