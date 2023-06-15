import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random aleatorio = new Random();
		    int v[] = new int[100]; //Declarando vetor 
		    int numero, maior = 0, menor = 0, somaTodos = 0, impares = 0, pares = 0 ;
		    numero = 0;
		//por motivos didáticos troquei a letra "i" por "repetição", para ajudar a compreender e decorar.
         for(int repeticao = 0; repeticao < 100; repeticao++) { 
		     numero = aleatorio.nextInt();
		     v[repeticao] = numero;
         System.out.println(v[repeticao]);  
		     maior = Math.max(maior,v[repeticao]);
         menor = Math.min(menor,v[repeticao]);
         somaTodos += v[repeticao];  
         if(v[repeticao] % 2 == 0){
         pares = pares + 1;  
         }else{
           impares = impares + 1;
         }
     }
  System.out.println("\n maior numero :" + maior);
  System.out.println("menor numero :" + menor);  
  System.out.println("A soma de todos os numeros é " + somaTodos); 
  System.out.println("A quantidade de numeros pares é " + pares);  
  System.out.println("A quantidade de numeros ímpares é " + impares);  
  }
  }