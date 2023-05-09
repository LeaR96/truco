package Model;

public class Mesa {
    private Jugador j1;
    private Jugador j2;
    private Mazo mazo;

    //private Jugador envidoCantado;  ----> quien cante el ultimo envido tendra esta variable
    private boolean envido1 = false;        // se iran poniendo los valores en true a medida que se vayan cantando
    private boolean envido2 = false;
    private boolean realEnvido = false;
    private boolean faltaEnvido = false;
    private boolean envidoQuerido = false;  // por ultimo si se quiere o no determinara la cantidad de puntos segun
                                            // los booleanos que se encuentren en estado de true.
                                            // si es false se sumara un punto por cada booleano que este en true
                                            // si es true se sumara cada valor 2(envido1 y envido2) 3(real)
                                            // en el caso de falta son 30 menos los pts del jugador que perdio

    public Mesa(){
        mazo = new Mazo();
    }


}
