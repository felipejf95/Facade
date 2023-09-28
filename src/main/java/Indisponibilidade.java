import java.util.ArrayList;
import java.util.List;

public abstract class Indisponibilidade {

    private List<Jogador> jogadorIndisponivel = new ArrayList<Jogador>();

    public void addJogadorIndisponivel(Jogador jogador){
        this.jogadorIndisponivel.add(jogador);
    }

    public boolean verificaJogadorIndisponivel (Jogador jogador){
        return this.jogadorIndisponivel.contains(jogador);
    }
}
