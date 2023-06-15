import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner enterScanner = new Scanner(System.in);
    
    float hp, lp, ha, la, qtd;

     System.out.println("Digite a altura da parede");
    hp = enterScanner.nextFloat();
 System.out.println("Digite a largura da parede");
    lp = enterScanner.nextFloat();
 System.out.println("Digite a altura do azulejo");
    ha = enterScanner.nextFloat();
 System.out.println("Digite a largura do azulejo");
    la = enterScanner.nextFloat();

 
    qtd = (hp * lp) / (ha * la);

   
    System.out.println("a quantidade de azulejos necessários é :" + qtd);
   

      }
    }