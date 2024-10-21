
public class Array {
    public static int soma1(int[] array) {
        int soma = 0;
        for (int elemento: array){
            soma+=elemento;
        }
        return soma;
    }


public static void main(String[] args) {
    int[] numeros = {1,2,3,4,5};
    int resultado = soma1(numeros);
    System.out.println(resultado);
}

}