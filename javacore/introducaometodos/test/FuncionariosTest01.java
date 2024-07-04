package introducaometodos.test;

import introducaometodos.dominio.Funcionarios;
import introducaometodos.dominio.ImpressoraFuncionarios;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionarios01 = new Funcionarios();
        Funcionarios salario01 = new Funcionarios();
        Funcionarios salario02 = new Funcionarios();
        Funcionarios salario03 = new Funcionarios();
        ImpressoraFuncionarios salario = new ImpressoraFuncionarios();

        funcionarios01.nome = "Teteu";
        funcionarios01.idade = 20;
        // outra forma seria: funcionarios01.salario = new double[]{2000,3000,4000};
        salario01.salario =2000;
        salario02.salario = 3000;
        salario03.salario = 4000;

        double[] media = {salario01.salario,salario02.salario,salario03.salario};

        salario.imprime(funcionarios01);
        salario.imprimeSalario(salario01);
        salario.imprimeSalario(salario02);
        salario.imprimeSalario(salario03);
        salario.mediaSalarios(media);


    }
}
