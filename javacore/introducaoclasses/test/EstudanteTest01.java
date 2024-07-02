package introducaoclasses.test;

import introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
    // variavel de referencia estudante fazendo referencia ao objeto estudante
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        
        
    }
}
