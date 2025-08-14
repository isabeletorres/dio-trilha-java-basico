import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        scanner.nextLine();

        String titular = scanner.nextLine();

        double saldo = scanner.nextDouble();
        if(saldo<=0){
            System.out.println("Erro: O saldo nao pode ser negativo.");
        } else {
            double deposito = scanner.nextDouble();
            if (deposito <= 0) {
                System.out.println("Erro: O valor do deposito deve ser positivo.");
            } else {
                ContaBancaria conta = new ContaBancaria(numero, titular, saldo);

                conta.depositar(deposito);

                conta.exibirSaldo();
            }
        }
        scanner.close();
    }
}
