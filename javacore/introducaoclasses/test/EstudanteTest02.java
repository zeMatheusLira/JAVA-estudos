package introducaoclasses.test;

import introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Sanji";
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);

        System.out.println("------------");

        System.out.println(estudante2.idade);
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);

//Exemplo para demonstrar o cuidado que se deve ter ao colocar variaveis de referencia e os objetos

    }
}
