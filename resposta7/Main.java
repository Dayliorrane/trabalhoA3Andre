import java.util.Random;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int chute;

        System.out.println("Adivinhe o Número entre 1 e 100");

        do {
            System.out.print("Digite seu chute. ");
            chute = scanner.nextInt();

            if (chute > numeroAleatorio) {
                System.out.println("Chutou muito alto. Tente novamente.");
            } else if (chute < numeroAleatorio) {
                System.out.println("Chutou muito baixo. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número.");
            }
        } while (chute != numeroAleatorio);
    }
}