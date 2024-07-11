package polimorfismo.servico;

import polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando um arquivo");
    }
}
