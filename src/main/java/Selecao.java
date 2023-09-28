public class Selecao extends Indisponibilidade{


    private static Selecao selecao = new Selecao();

    private Selecao() {};

    public static Selecao getInstance(){
        return selecao;
    }
}
