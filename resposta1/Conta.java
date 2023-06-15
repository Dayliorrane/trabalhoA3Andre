package BancoAndre;
import java.util.Scanner;
public class Conta {
Scanner teclado = new Scanner(System.in);
	String titular, email,agencia;
	double saldo, valor;
	int  nConta, senha, nBanco, cpf, chaveSeguranca;

   	void saque(){
   		valor = teclado.nextDouble();
   		if(valor <= saldo){
   			saldo = saldo - valor;
   			System.out.println("Operacao realizada com sucesso! seu saldo atual e Rs " + saldo);
			    
			  }
			else {System.out.println("Saldo insuficiente para realizar a operacao.");
			}
   	
   	}
   
    void deposito() {
    	valor = teclado.nextDouble();
    	saldo = saldo + valor;
    	
    }
  
    void rendimento() {
        saldo = saldo + (saldo * 0.05);
    }

    void infoDados() {
    	System.out.println("Titular " + this.titular);
    	System.out.println("CPF " + this.cpf);
    	System.out.println("Numero do banco " + this.nBanco);
    	System.out.println("Numero da conta " + this.nConta);
    	System.out.println("Numero da Agencia " + this.agencia);
    
    	
    	
    	
    	
    }

}

    