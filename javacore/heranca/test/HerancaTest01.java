package heranca.test;

import heranca.dominio.Endereco;
import heranca.dominio.Funcionario;
import heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua jose");
        endereco.setCep("57300-000");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Teteu");
        pessoa.setCpf("1234567");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Satoro Gojo");
        funcionario.setCpf("12345");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-----------");
        funcionario.imprime();
    }
}
