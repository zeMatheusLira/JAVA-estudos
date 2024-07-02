package introducaometodos.test;

import introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumero(num1, num2);
        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);

    }
}
// a variavel original do tipo primitivo nunca sera alterada, pois é passado uma copia daquele valor
// para a nova variavel de referencia que esta sendo criando dentro do metodo