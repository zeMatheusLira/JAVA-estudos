package introducaoclasses.test;

import introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "França";
        professor.idade = 24;
        professor.sexo = 'M';

        System.out.println(professor.nome +" "+ professor.idade +" "+ professor.sexo);

    }
}
