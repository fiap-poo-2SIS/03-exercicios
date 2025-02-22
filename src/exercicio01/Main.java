package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Nome do aluno: ");
        aluno.nome = sc.next();
        System.out.print("RM do aluno:");
        aluno.rm = sc.nextInt();
        System.out.print("Informe a nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Informe a nota 2: ");
        aluno.nota2 = sc.nextDouble();

        System.out.println("\nDados do aluno:");
        System.out.println(aluno.getDados());
        System.out.println("Média do aluno: " + aluno.calcularMedia());
        System.out.println("Status do aluno: " + aluno.verificarStatus());

        sc.close();
    }
}
