package polimorfismo.test;

import polimorfismo.repositorio.Repositorio;
import polimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio= new RepositorioBancoDeDados();// RepositorioMemoria // RepositorioArquivo
        repositorio.salvar();
        List<String> List = new ArrayList<>();
        List.add("Goku");
        List.add("Vegeta");
        List.add("Kuririn");
        System.out.println(List);


    }
}
