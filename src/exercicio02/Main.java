package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();
        double[] alvo;

        System.out.print("Digite o nome do paciente: ");
        paciente.nome = sc.nextLine();
        System.out.print("Digite a idade do paciente: ");
        paciente.idade = sc.nextInt();

        System.out.println("Frequência máxima: " + paciente.calcularFrequenciaMaxima());
        alvo = paciente.calcularFrequenciaAlvo();
        System.out.println("Frequência alvo mínima: " + alvo[0]);
        System.out.println("Frequência alvo máxima: " + alvo[1]);


    }
}
