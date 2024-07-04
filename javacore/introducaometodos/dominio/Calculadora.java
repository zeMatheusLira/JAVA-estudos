package introducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-1);
    }

    public void multiplicaDoisNumeros(int num1, float num2){
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2==0){
            return 0;
            //pode usar o else no lugar de return num1/num2
        }
        return num1/num2;
    }
//return; em um metodo void  funciona que nem um if e else e tbm que nem um break

    public void alteraDoisNumero(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }

    public void somaArrays(int[] numeros){
        int soma=0;
        for(int num: numeros) {
            soma+=num;

        }
        System.out.println(soma);
    }
    public void somaVarArgs(int...numeros){
        int soma=0;
        for(int num: numeros) {
            soma+=num;

        }
        System.out.println(soma);
    }
}


