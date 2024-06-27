public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01+numero02;
        System.out.println(resultado);
        // %
        int resto = 20 % 2;
        System.out.println(resto);
        // < >  <= >= == != 
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 100;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("IsDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("IsDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("IsDezIgualVinte " +isDezIgualVinte);
        System.out.println("IsDezIgualDez " +isDezIgualDez);
        System.out.println("IsDezDiferenteVinte " +isDezDiferenteVinte);

        // && (AND) || (OR) !(NOT)

        int idade = 35;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel "+ isPlaystationCincoCompravel
        );

        // atribução-> = += -= *= /= %=
    }
}
