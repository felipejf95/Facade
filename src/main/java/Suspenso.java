public class Suspenso extends Indisponibilidade{

    private static Suspenso suspenso = new Suspenso();

    private Suspenso() {};

    public static Suspenso getInstance(){
        return suspenso;
    }
}
