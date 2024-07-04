package introducaometodos.dominio;

public class ImpressoraFuncionarios {
    public void imprime(Funcionarios funcionarios) {
        System.out.println(funcionarios.nome);
        System.out.println(funcionarios.idade + " anos");
    }

    public void imprimeSalario(Funcionarios funcionarios) {
        System.out.println(funcionarios.salario + " reais");
    }

    public void mediaSalarios(double[] salario) {
//        if (salario == null) {
//            return;
//        }-> podemos usar o if pra resolver problemas de valores nulos ou seja nao imprimir null
//         teriamos que revisar o codigo para fazer a implementacao dos ifs
        double soma = 0;
        double resultado = 0;
        for (double num : salario) {
            soma += num;
            resultado = soma / salario.length;

        }
        System.out.println("A média do salário é " + resultado);
    }
}
