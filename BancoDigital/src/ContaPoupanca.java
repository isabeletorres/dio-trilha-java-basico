public class ContaPoupanca extends Conta {

    @Override
    public void exibirExtrato() {
        System.out.println("===Extrato conta poupança: ====");
        super.exibirContas();
    }
}
