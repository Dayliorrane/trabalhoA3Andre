
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int junior, jheny, emily, pedro, joao, nulo, n, totalVoto, maior, maior2;
        totalVoto = 0; 
        n = 0;
        junior = 0;
        jheny = 0;
        pedro = 0;
        emily = 0;
        joao = 0;
        nulo = 0;
        maior = 0;
        maior2 = 0;
        String candidatoVencedor  = "";
        String candidatoSegundoLugar = "";
        System.out.println("Aviso! para encerrar a votação tecle -1.");
        while (n != -1) {
            System.out.println("Bem Vindo!");
            System.out.println("Escolha seu canditado.");
            System.out.println("1-junior, 2-jheny, 3-pedro, 4-emily, 5-joao ou 6-Nulo");
            n = teclado.nextInt();
            if (n == 1) {
                junior = junior + 1;
                System.out.println("Você votou na junior");
            } else if (n == 2) {
                jheny = jheny + 1;
                System.out.println("Você votou no jheny");
            } else if (n == 3) {
                pedro = pedro + 1;
                System.out.println("você votou na pedro");
            } else if (n == 4) {
                emily = emily + 1;
                System.out.println("você votou no emily");
            } else if (n == 5) {
                joao = joao + 1;
                System.out.println("você votou na joao");
            }else if (n == 6) {
                nulo = nulo + 1;
                System.out.println("voce votou Nulo");
            } else {
                System.out.println("voto invalido, tente novamente \n");
             }
            }
            System.out.println("encerrada a votação \n");
            //achando o primeiro lugar.
            if (junior > maior) {
              maior = junior;
              candidatoVencedor = "junior";
            }
            if (jheny > maior) {
             maior = jheny;  
              candidatoVencedor = "jheny";
            }
            if (pedro > maior) {
             maior = pedro; 
              candidatoVencedor = "pedro";
            }
            if (emily > maior) {
            maior = emily;  
              candidatoVencedor = "emily";
            }
            if (joao > maior) {
            maior = joao;
              candidatoVencedor = "joao";
            }
            //achando o segundo lugar. 
            if (junior > maior2 & junior < maior) {
              maior2 = junior;
              candidatoSegundoLugar = "junior";
            }
            if (jheny > maior2 & jheny < maior) {
             maior2 = jheny;  
              candidatoSegundoLugar = "jheny";
            }
            if (pedro > maior2 & pedro < maior) {
             maior2 = pedro; 
              candidatoSegundoLugar = "pedro";
            }
            if (emily > maior2 & emily < maior) {
            maior2 = emily;  
              candidatoSegundoLugar = "emily";
            }
            if (joao > maior2 & joao < maior) {
            maior2 = joao;
              candidatoSegundoLugar = "joao";
            }
           
            totalVoto = junior + jheny + pedro + emily + joao;
            int metadeVoto = totalVoto / 2;
            if(maior > metadeVoto){
            System.out.println("O ganhador foi " + candidatoVencedor + " com mais de 50% dos votos, assim não precisando de um segundo turno.");
            System.out.println("Segue agora os dados da votação \n");
            System.out.println("Canditado junior =" + junior);
            System.out.println("Canditado jheny =" + jheny);
            System.out.println("Canditado pedro  =" + pedro );
            System.out.println("Canditado emily =" + emily);
            System.out.println("Canditado joao =" + joao);
            System.out.println("Canditado Nulo =" + nulo);
            System.out.println("Totais de votos feitos = " + totalVoto + "\n");  
            }else {           
            System.out.println("o candidato mais votado foi " + candidatoVencedor + " mas devido ser abaixo de 50% averá um segundo turno com o candidato " + candidatoSegundoLugar);
          
          
            //entrada do segundo turno
            maior = 0;
            maior2 = 0;  
            nulo = 0;
            System.out.println("Segundo turno");
            System.out.println("Aviso! para encerrar a votação tecle -2.");
            while (n != -2) {
            System.out.println("Bem Vindo!");
            System.out.println("Escolha seu canditado.");
            System.out.println("1-" + candidatoVencedor + " 2-" + candidatoSegundoLugar );
            n = teclado.nextInt();
            if (n == 1) {
                maior = maior + 1;
                System.out.println("Você votou em " + candidatoVencedor);
            } else if (n == 2) {
                maior2 = maior2 + 1;
                System.out.println("Você votou em " + candidatoSegundoLugar);
            }else if (n == 3) {
                nulo = nulo + 1;
                System.out.println("voce votou Nulo");
            } else {
                System.out.println("voto invalido, tente novamente \n");
            }
            }
            //descobrindo o vencedor.
            if (maior > maior2) {
              System.out.println("O vencedor é " + candidatoVencedor + " com " + maior + " votos");
            }else{
              System.out.println("O vencedor é " + candidatoSegundoLugar + " com " + maior2 + " votos");
            }
          } 
        }
      }
