package BancoAndre;
import java.util.Scanner;
public class TesteConta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao, escolha;
	    double valor;
		
		Conta c1 = new Conta();
		c1.titular = "Dayliorrane ferreira ";
		c1.email = "Day@outlook.com";
		c1.saldo = 800;
		c1.agencia = "45678-9" ;
		c1.nConta =  1234567890;
		c1.senha = 1234;
		c1.nBanco = 341;
		c1.cpf = 1284099646;
		c1.chaveSeguranca = 1111 ;
		 
		
		Conta c2 = new Conta();
		c2.titular = "Emily julio Souza";
		c2.email = "Emily.88@gmail.com";
		c2.saldo = 100;
		c2.agencia = "45878-9" ;
		c2.nConta =  1478567890;
		c2.senha = 1223;
		c2.nBanco = 341;
		c2.cpf = 1284099646;
		c2.chaveSeguranca = 1111 ;
		 
		
		if (c1 == c2) {
	        System.out.println("Bem Vindo ao banco Andre, voce tem duas contas Iguais, seleciona-a e insira sua senha para continuar ");
		    }else {
	        System.out.println("Bem vindo ao banco Andre, voce tem duas contas Diferentes, selecione a desejada e insira sua senha para continuar .");
	        }
	    
		System.out.println("digite 1 para a primeira opcao e 2 para a segunda opcao");	
		
		System.out.println("opcao 1");
		c1.infoDados();
		System.out.println("opcao 2");
		c2.infoDados();
		
		escolha = 0;
		while(escolha != -1) {
			escolha = teclado.nextInt();	
			if (escolha == 1) {
				System.out.println("Bem Vindo " + c1.titular);
				System.out.println("selecione: (1) consultar saldo,(2) para fazer um saque, (3)para fazer um deposito, (4) para consultar seu rendimento ao longo do mes  ou (5) para sair .  ");
				menuBanco(c1);		
			}else if (escolha == 2 ) {
				System.out.println("Bem Vindo " + c2.titular);
				System.out.println("selecione: (1) consultar saldo,(2) para fazer um saque, (3)para fazer um deposito, (4) para consultar seu rendimento ao longo do mes  ou (5) para sair .  ");
				menuBanco(c2);
			}else {
				System.out.println("opcao incorreta.\n digite 1 ou 2");			
				System.out.println("opcao 1");
				c1.infoDados();
				System.out.println("opcao 2");
				c2.infoDados();
			}
		}
		
  }
	public static void menuBanco(Conta conta) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		while(opcao != 5) {
			opcao = teclado.nextInt();
			if(opcao == 1) {
				System.out.println("Voce escolheu consultar saldo");
			System.out.println("seu saldo é " + conta.saldo);
			}
			else if (opcao == 2) {
				System.out.println("Voce escolheu fazer um saque " );
				System.out.println("digite o valor que voce deseja sacar");
				conta.saque();				
				
			}
			else if (opcao == 3) {
				System.out.println("Voce escolheu a opcao de fazer um deposito escolha o valor que deseja depositar.");
				conta.deposito();
			    System.out.println("operacao realizada com sucesso.");
			    System.out.println("seu saldo atual é de " + conta.saldo);
			}
			else if (opcao == 4) {
				System.out.println("voce escolheu fazer uma consulta de o quanto o seu dinheiro vai render ao longo de um mes com seu saldo atual");
				System.out.println("seu saldo atual é de " + conta.saldo);
				conta.rendimento();
				System.out.println("Ao longo do mes voce teria R$" + conta.saldo);
			}
			else if (opcao == 5) {
				System.out.println("Obrigado , volte sempre ");
			}
			else {
				System.out.println("Opcao incorreta, tente novamente ");
			}
		}
	}
}
