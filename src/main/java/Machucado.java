public class Machucado extends Indisponibilidade{


    private static Machucado machucado = new Machucado();

    private Machucado() {};

    public static Machucado getInstance(){
        return machucado;
    }
}
