public class BuscandoNomes {

    public static void main(String[] args) {
        
        String nomes [] = {"Pedro", "Carlos", "Davi", "Fabiano"};

        String achou = " lucas";
        boolean naoAchou = false;

        for(int i =0; i < nomes.length; i++){
            if(nomes[i].equals(achou)){
                System.out.println("Achou! "+ nomes[i]);
                naoAchou = true;
                break;
            }
            if(!naoAchou){
                System.out.println("Não achou");
                break;
            }
        }
    }
}