package associacao.test;

import associacao.dominio.Jogador;
import associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador01.setTime(time);

        jogador01.imprime();
    }
}
// associacao unidirecional um pra muitos