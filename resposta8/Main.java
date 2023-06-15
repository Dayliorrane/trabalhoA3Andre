import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner enterScanner = new Scanner(System.in);
 int n, contPar = 0, contImpar = 0;

  for(int i = 1; i <= 10; i++){
    System.out.println("Digite o "  + i +  "° número");
    n = enterScanner.nextInt();
   
    if(n % 2 == 0){
      contPar++;
      
    } else if(n % 2 == 1){
      contImpar++;
    }
  }
   System.out.println("Foram digitados "  + contPar +  " números pares");

    System.out.println("Foram digitados "  + contImpar +  " números ímpares"); 
    

      }
    }