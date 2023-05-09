package Model;

<<<<<<< HEAD
=======
import java.util.ArrayList;

>>>>>>> 6f69de1 (segundo Commit, se agrega contadores de punto segun lo que se cante)
public class Mesa {
    private Jugador j1;
    private Jugador j2;
    private Mazo mazo;
<<<<<<< HEAD

    //private Jugador envidoCantado;  ----> quien cante el ultimo envido tendra esta variable
=======
    private ArrayList <Carta> cartasMesaJ1;
    private ArrayList <Carta> cartasMesaJ2;

    private Jugador envidoCantado;  //----> quien cante el ultimo envido tendra esta variable
>>>>>>> 6f69de1 (segundo Commit, se agrega contadores de punto segun lo que se cante)
    private boolean envido1 = false;        // se iran poniendo los valores en true a medida que se vayan cantando
    private boolean envido2 = false;
    private boolean realEnvido = false;
    private boolean faltaEnvido = false;
    private boolean envidoQuerido = false;  // por ultimo si se quiere o no determinara la cantidad de puntos segun
                                            // los booleanos que se encuentren en estado de true.
                                            // si es false se sumara un punto por cada booleano que este en true
                                            // si es true se sumara cada valor 2(envido1 y envido2) 3(real)
                                            // en el caso de falta son 30 menos los pts del jugador que perdio

<<<<<<< HEAD
=======
    private Jugador trucoCantado;
    private boolean truco = false;
    private boolean retruco = false;
    private boolean valeCuatro = false;
    private boolean trucoQuerido = false;


>>>>>>> 6f69de1 (segundo Commit, se agrega contadores de punto segun lo que se cante)
    public Mesa(){
        mazo = new Mazo();
    }


<<<<<<< HEAD
=======

    public void Juego(){
        while(j1.getPuntos() <= 30 || j2.getPuntos() <= 30 ){
            if(j1.esMano()){
                j1.jugarPrimeraMano();
            }else{
                j2.jugarPrimeraMano();
            }
        }
    }
    
    public Integer ptsTruco(){      ///calculador de puntos que se lleva el jugador por truco
        Integer pts = 0;
        if(trucoQuerido){
            if(truco){
                pts=2;
            }
            if(retruco){
                pts=3;
            }
            if(valeCuatro){
                pts=4;
            }
        }else if (!truco && !trucoQuerido){
            pts = 1;
        }else{
            if(truco){
                pts=2;
            }
            if(retruco){
                pts=3;
            }
        }
        return pts;
    }
    
    public Integer ptsEnvido(){        ///calculador de puntos que se lleva el jugador por envido
        Integer pts=0;
        if(!envidoQuerido){
            if(envido1){
                pts++;
            }
            if (envido2) {
                pts++;
            }
            if(realEnvido){
                pts++;
            }
            if(faltaEnvido){
                pts++;
            }
        } else if (envidoQuerido) {
            if(envido1){
                pts += 2;
            }
            if(envido2){
                pts += 2;
            }
        }
        return pts;
    }
>>>>>>> 6f69de1 (segundo Commit, se agrega contadores de punto segun lo que se cante)
}
