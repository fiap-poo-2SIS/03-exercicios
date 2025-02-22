package exercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        Professor p1 = new Professor();
        Professor p2 = new Professor();
        Professor p3 = new Professor();

        // entrada de dados
        System.out.println("********** Dados do professor 1 **********");
        System.out.print("Nome: ");
        p1.nome = sc.next();
        System.out.print("Total de aulas semanais: ");
        p1.totalDeAulas = sc.nextInt();
        System.out.print("Valor da hora aula : R$ ");
        p1.valorHoraAula = sc.nextDouble();

        System.out.println();
        System.out.println("********** Dados do professor 2 **********");
        System.out.print("Nome: ");
        p2.nome = sc.next();
        System.out.print("Total de aulas semanais: ");
        p2.totalDeAulas = sc.nextInt();
        System.out.print("Valor da hora aula : R$ ");
        p2.valorHoraAula = sc.nextDouble();

        System.out.println();
        System.out.println("********** Dados do professor 3 **********");
        System.out.print("Nome: ");
        p3.nome = sc.next();
        System.out.print("Total de aulas semanais: ");
        p3.totalDeAulas = sc.nextInt();
        System.out.print("Valor da hora aula : R$ ");
        p3.valorHoraAula = sc.nextDouble();

        // saída de dados
        System.out.println();
        System.out.println("Nome do professor: " + p1.nome);
        System.out.println("Salário Bruto: R$ " + df.format(p1.calcularSalario()));

        System.out.println();
        System.out.println("Nome do professor: " + p2.nome);
        System.out.println("Salário Bruto: R$ " + df.format(p2.calcularSalario()));

        System.out.println();
        System.out.println("Nome do professor: " + p3.nome);
        System.out.println("Salário Bruto: R$ " + df.format(p3.calcularSalario()));



    }
}
