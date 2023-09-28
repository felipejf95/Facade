public class JogadorFacade {

    public static boolean verificarDisponibilidade (Jogador jogador){

        if(Machucado.getInstance().verificaJogadorIndisponivel(jogador)) {
            return false;
        }
        if(Selecao.getInstance().verificaJogadorIndisponivel(jogador)) {
            return false;
        }
        if(Suspenso.getInstance().verificaJogadorIndisponivel(jogador)) {
            return false;
        }
        return true;
    }
}
