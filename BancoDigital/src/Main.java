public class Main {
    public static void main(String[] args) {
        Conta corrente = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        corrente.exibirExtrato();
        corrente.transferir(poupanca, 100.0);
        poupanca.exibirExtrato();
    }
}