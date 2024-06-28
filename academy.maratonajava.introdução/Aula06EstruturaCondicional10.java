public class Aula06EstruturaCondicional10 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas ele pode ser parcelado
        //Condição valorParcela>=1000
        double valorCarro = 30000;
        for(int i=(int)valorCarro;i>=1;i--){
            double valorParcela = valorCarro/i;
            if (valorParcela<1000) {
                continue;
            }
            System.out.println("Parcela "+i+" R$ "+valorParcela);
        }
    }
}

