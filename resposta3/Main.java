import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double n1, n2, n3, n4, n5, totalNota; 
    
   System.out.println("Vamos calcular as 5 notas de um aluno : ");
   System.out.println("Digite o nome do aluno. ");
    String aluno = teclado.nextLine();
    System.out.println("Digite a primeira nota do " + aluno);

    n1 = teclado.nextDouble();

    System.out.println("Digite a segunda nota do " + aluno); 

    n2 = teclado.nextDouble();

    System.out.println("Digite a terceira nota do " + aluno);

    n3 = teclado.nextDouble();

    System.out.println("Digite a quarta nota do "  + aluno);

    n4 = teclado.nextDouble();

    System.out.println("Digite a quinta nota do " + aluno);

    n5 = teclado.nextDouble();

    totalNota = (n1 + n2 + n3 + n4 + n5);

    System.out.println("A soma das 5 notas do aluno " + aluno + " é " + totalNota);

    if (totalNota >= 60 ){
      System.out.println("Aluno " + aluno + " foi aprovado.");
    }else if (totalNota <= 59 & totalNota >= 40){
      System.out.println("Aluno " + aluno + " ficou em recuperação.");
    }else{
      System.out.println("Aluno " + aluno + " foi reprovado.");
    }
  }
}