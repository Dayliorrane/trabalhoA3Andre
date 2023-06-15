import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho das matrizes (n x n): ");
        int tamanho = scanner.nextInt();

        int[][] matriz1 = new int[tamanho][tamanho];
        int[][] matriz2 = new int[tamanho][tamanho];
        int[][] matrizSoma = new int[tamanho][tamanho];

        System.out.println("Preencha a primeira matriz:");
        preencherMatriz(matriz1, scanner);

        System.out.println("Preencha a segunda matriz:");
        preencherMatriz(matriz2, scanner);

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz resultante da soma:");
        imprimirMatriz(matrizSoma);
    }

    public static void preencherMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}