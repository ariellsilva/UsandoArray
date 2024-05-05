import java.util.Scanner;

public class EncontrarNomes {

    public static void main(String[] args) {

        String nome;

        String [] nomes = new String [5];
        nomes [0] = "Paula";
        nomes [1] = "Rosa";
        nomes [2] = "Marcela";
        nomes [3] = "Martha";
        nomes [4] = "Carla";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        Scanner digite = new Scanner(System.in);
        System.out.println("Digite o nome que deseja buscar: ");
        nome = digite.nextLine();

        boolean encontre = false;

        for(int i =0; i < nomes.length; i ++){
            if(nomes[i].equals(nome)){
                System.out.println("Nome: " + nomes[i]);
                encontre = true;
                break;
            }
            if(!encontre){
                System.out.println("Não encontrado");
                break;
            }
        }
    }

}
