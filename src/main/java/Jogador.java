public class Jogador {

    public boolean jogar(){
        return JogadorFacade.verificarDisponibilidade(this);
    }
}
