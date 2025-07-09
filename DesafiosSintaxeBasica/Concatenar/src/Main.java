import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        int id = scanner.nextInt();

        String letraMinuscula = nome.toLowerCase();
        String idntificador = letraMinuscula+"-"+id;
        System.out.println(idntificador);

        scanner.close();
    }
}