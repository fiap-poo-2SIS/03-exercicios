package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        int opcao;
        double valor;

        do {
            System.out.println("********** Sistema Bancário **********");
            System.out.println("1. Informar dados da conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Finalizar");
            opcao = sc.nextInt();
            if(opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida!");
            }
            else {
                switch (opcao) {
                    case 1:
                        System.out.print("Informe a agência bancária: ");
                        conta.agencia = sc.nextInt();
                        System.out.print("Informe o titular da conta: ");
                        conta.titular = sc.next();
                        break;
                    case 2:
                        System.out.print("Informe o valor do depósito: ");
                        valor = sc.nextDouble();
                        conta.depositar(valor);
                        break;
                    case 3:
                        System.out.print("Informe o valor do saque: ");
                        valor = sc.nextDouble();
                        conta.sacar(valor);
                        break;
                    case 4:
                        System.out.println("Saldo atual R$ " + df.format(conta.consultarSaldo()));
                }
            }
            System.out.println();
        } while(opcao != 5);
    }
}
