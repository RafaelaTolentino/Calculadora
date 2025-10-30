import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int esc;

        do {
            System.out.println("=== CALCULADORA ===");
            System.out.println("--- Escolha a opção desejada ---");
            System.out.println("1 - Soma");
            System.out.println("2 - Divisão");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Subtração");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            esc = scanner.nextInt();

            switch (esc) {
                case 1:
                    somar(scanner);
                    break;
                case 2:
                    dividir(scanner);
                    break;
                case 3:
                    multiplicar(scanner);
                    break;
                case 4:
                    subtrair(scanner);
                    break;
                case 0:
                    System.out.println("Menu finalizado!");
                    break;
                default:
                    System.out.println("Escolha fora do menu. Tente novamente!");
                    break;
            }

        } while (esc != 0);

        scanner.close();
    }

    public static void somar(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o próximo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("Resultado = " + (n1 + n2));
    }

    public static void subtrair(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o próximo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("Resultado = " + (n1 - n2));
    }

    public static void dividir(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o próximo número: ");
        double n2 = scanner.nextDouble();

        if (n2 == 0) {
            System.out.println("Erro: divisão por zero!");
        } else {
            System.out.println("Resultado = " + (n1 / n2));
        }
    }

    public static void multiplicar(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o próximo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("Resultado = " + (n1 * n2));
    }
}
