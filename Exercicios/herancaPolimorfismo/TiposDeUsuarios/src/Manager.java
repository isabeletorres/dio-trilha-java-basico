public class Manager extends Employee {

    public Manager(String nome, String email, String senha) {
        super(nome, email, senha, true);

    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado.");
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas...");
    }
}

