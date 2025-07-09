import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String url = scanner.nextLine();

        String urlMinuscula = url.toLowerCase();

        String urlSemEspaco = urlMinuscula.trim();

        System.out.println(urlSemEspaco);
        scanner.close();
    }
}