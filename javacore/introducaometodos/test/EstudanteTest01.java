package introducaometodos.test;

import introducaometodos.dominio.Estudante;
import introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();// referencia
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Pancada";//objeto
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Potter";
        estudante02.idade = 24;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);// a refencia estudante faz referencia ao mesmo objeto estudante01
        impressora.imprime(estudante02);


        //ao passar objetos como argumento na verdade vc esta passadando a referencia
    }
}
