import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos da turma: ");
        int quantidadeAlunos = scanner.nextInt();

        double[] notas = new double[quantidadeAlunos];
        double somaNotas = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
            somaNotas += notas[i];
        }

        double media = somaNotas / quantidadeAlunos;
        System.out.println("Média das notas: " + media);
    }
}