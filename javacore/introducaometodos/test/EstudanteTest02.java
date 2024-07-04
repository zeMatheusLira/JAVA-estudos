package introducaometodos.test;

import introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();// referencia
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Pancada";//objeto
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Potter";
        estudante02.idade = 24;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }
}
