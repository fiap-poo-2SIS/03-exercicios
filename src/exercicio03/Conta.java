package exercicio03;

public class Conta {
    // atributos ou variáveis de instância
    int agencia;
    String titular;
    double saldo;

    // método para sacar um valor da conta
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    // método para depositar um valor na conta
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    // método para retornar o valor do saldo
    public double consultarSaldo() {
        return saldo;
    }
}
