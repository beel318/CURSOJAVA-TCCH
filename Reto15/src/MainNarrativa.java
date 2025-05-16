public class MainNarrativa {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void iniciarEscena() {
        dialogo.mostrarDialogo("Narrador", "Llegas a una encrucijada en el bosque...");
        String eleccion = decision.tomarDecision();
        dialogo.mostrarDialogo("Narrador", "Has elegido la opción: " + eleccion);
        transicion.transicionar(eleccion);
    }

    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa juego = new MainNarrativa(transicion, dialogo, decision);
        juego.iniciarEscena();
    }
}
