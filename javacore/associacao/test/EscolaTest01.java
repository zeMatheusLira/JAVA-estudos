package associacao.test;

import associacao.dominio.Escola;
import associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Jiraya Sensei");
        Professor professor02 = new Professor("Sensei Sacy");
        Professor[] professores = {professor01, professor02};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
// relacionamento muitos para um