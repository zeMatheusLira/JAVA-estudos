package associacao.test;

import associacao.dominio.AlunoSeminario;
import associacao.dominio.Local;
import associacao.dominio.ProfessorSeminario;
import associacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua José");
        AlunoSeminario aluno = new AlunoSeminario("Teteu", 20);
        ProfessorSeminario professores = new ProfessorSeminario("DevDojo", "JAVA");

        AlunoSeminario[] alunos = {aluno};

        Seminario seminario = new Seminario("Programação POO", local, alunos);

        Seminario[] seminariosDisponiveis = {seminario};

        professores.setSeminarios(seminariosDisponiveis);

        professores.imprime();

    }
}
