import org.junit.jupiter.api.Test;

import javax.crypto.Mac;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    public void deveRetornarJogadorMachucado(){
        Jogador jogador = new Jogador();
        Machucado.getInstance().addJogadorIndisponivel(jogador);

        assertEquals(false, jogador.jogar());
    }

    @Test
    public void deveRetornarJogadorNaSelecao(){
        Jogador jogador = new Jogador();
        Selecao.getInstance().addJogadorIndisponivel(jogador);

        assertEquals(false, jogador.jogar());
    }

    @Test
    public void deveRetornarJogadorSuspenso(){
        Jogador jogador = new Jogador();
        Suspenso.getInstance().addJogadorIndisponivel(jogador);

        assertEquals(false, jogador.jogar());
    }

    @Test
    public void deveRetornarJogadorDisponivel(){
        Jogador jogador = new Jogador();

        assertEquals(true, jogador.jogar());
    }

}