import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double gf, gc ;
    int n;
    System.out.println("Bem vindo ao conversor de temperatra.\n selecione (1) para converter graus Fahrenhei para Celsius.\n selecione (2) para converter graus Celsius para Fahrenhei");
  n = teclado.nextInt();
  if(n == 1) {
      System.out.println("vamos converter graus Fahrenhei para graus Celsius !");

    System.out.println("qual a temperatura em graus Fahrenhei?");
    gf = teclado.nextDouble();
    gc = 5 * ((gf - 32) /9);

    System.out.println("a temperatura em graus celsius é " + gc + "°C");
 
  }else if(n == 2){
      System.out.println("vamos converter graus Celsius para graus Fahrenhei !");

    System.out.println("qual a temperatura em graus Celsius?");
    gc = teclado.nextDouble();
    gf = (gc * 1.8) + 32;

    System.out.println("a temperatura em Fahrenhei é " + gf + "°C");
 
  }else {
    System.out.println("Número selecionado é invalido , inicie o aplicativo e tente novamente ");
  }
  }
}