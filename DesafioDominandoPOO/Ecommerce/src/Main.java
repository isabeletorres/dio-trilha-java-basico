import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        scanner.nextLine();

        String cliente = scanner.nextLine();

        double valorTotal = scanner.nextDouble();

        Pedido pedido = new Pedido(id, cliente, valorTotal);

        pedido.exibirPedido();

        scanner.close();
    }
}