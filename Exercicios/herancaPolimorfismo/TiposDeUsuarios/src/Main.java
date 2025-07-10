public class Main {
    public static void main(String[] args) {

        Manager gerente = new Manager("João Gerente", "joao@empresa.com", "1234");
        Seller vendedor = new Seller("Maria Vendedora", "maria@empresa.com", "abcd");
        Attendant atendente = new Attendant("Carlos Atendente", "carlos@empresa.com", "senha");

        System.out.println("----- Testando login -----");
        System.out.println("Login gerente: " + gerente.login("joao@empresa.com", "1234")); // true
        System.out.println("Login vendedor (senha errada): " + vendedor.login("maria@empresa.com", "errada")); // false

        System.out.println("\n----- Testando gerente -----");
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();
        gerente.changeData("João Silva", "joaosilva@empresa.com");
        gerente.changePassword("nova123");

        System.out.println("\n----- Testando vendedor -----");
        vendedor.performSales();
        vendedor.performSales();
        vendedor.consultSales();
        vendedor.logoff();

        System.out.println("\n----- Testando atendente -----");
        atendente.receivePayment(150.75);
        atendente.receivePayment(49.25);
        System.out.println("Valor atual em caixa: R$" + atendente.getCashValue());
        atendente.closeBox();
    }
}
