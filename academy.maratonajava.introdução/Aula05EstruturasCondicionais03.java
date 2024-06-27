public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições";
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 500 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
