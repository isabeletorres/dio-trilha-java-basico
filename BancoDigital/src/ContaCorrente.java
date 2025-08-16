public class ContaCorrente extends Conta{

    @Override
    public void exibirExtrato() {
        System.out.println("===Extrato conta corrente: ====");
        super.exibirContas();
    }
}
