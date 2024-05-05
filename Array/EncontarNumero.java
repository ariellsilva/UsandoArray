import java.util.Scanner;

public class EncontarNumero {

public static void main(String[] args) {

    int numbers;
    
    int [] numeros= new int [4];

     numeros [0]= 1;
     numeros [1] = 5;
     numeros [2] = 7;
     numeros [3] = 10;
   
      for(int i =0; i < numeros.length; i++){
        System.out.println(numeros[i]);

      }

      Scanner digite = new Scanner(System.in);

      System.out.println("Escolha um número: ");
      numbers = digite.nextInt();

      boolean achou = false;

      for(int i = 0; i <= numeros.length; i++){
        if(numeros[i] == numbers){
            System.out.println("O numero é: " + numeros[i]);
            achou = true;
            break;
        }
          if(!achou){
           System.out.println("Não achou");
           break;

         }
  
      }
  } 

}
