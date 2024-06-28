public class Aula06EstruturaDeRepetição04 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas ele pode ser parcelado
        //Condição valorParcela>=1000
        double valorCarro = 30000;
        for(int i=1;i<=valorCarro;i++){
            double valorParcela = valorCarro/i;
            if (valorParcela<1000) {
                break;
            }
        System.out.println("O carro pode ser dividido em "+i+" vezes");        
        }
    }
}
