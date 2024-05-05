public class BuscarNumeros {

    public static void main(String[] args) {
        int [] numeros = {1,5,7,8,10,16,4};

        int num = 1;
        boolean achou = false;

        for(int i =0; i <numeros.length; i++){
            if(numeros[i] == num){
                System.out.println("Número: " + numeros[i]);
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
