package heranca.test;

import heranca.dominio.Endereco;
import heranca.dominio.Funcionario;
import heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua jose");
        endereco.setCep("57300-000");
        Pessoa pessoa = new Pessoa("Teteu","1234567");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Satoro Gojo");
        funcionario.setCpf("12345");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-----------");
        funcionario.imprime();
    }
}
//0 - Bloco de inicialização estáico da super classe é executado quando a jvm carregar a classe pai
//1 - Bloco de inicialização estáico da subclasse é executado quando a jvm carregar a classe filha
// 2 - Alocado em espaco em memoria pro objeto da classe pai
// 3- Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado da classe pai
// 4- Bloco de inicializacao da superclasse é executado
// 5- Construtor é executado
// 6 - Alocado em espaco em memoria pro objeto da sub classe
// 7- Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado da subclasse
// 8- Bloco de inicializacao da subclasse é executado na ordem que aparece
// 9- Construtor da subclasse é executado
