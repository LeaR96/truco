import Model.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Mazo mazo = new Mazo();

        mazo.mezclarMazo();

        mazo.mostrarMazo();

        Jugador j1 = new Jugador("Leandro");
        Jugador j2 = new Jugador("Orne");

        mazo.repartir(j1,j2);

        System.out.println("\nVer mano J1\n");

        j1.verMano();

        System.out.println("\nVer mano J2\n");

        j2.verMano();


        System.out.println("\nEl J1 tiene: " + j1.tantos() + " tantos");
        System.out.println("\nEl J2 tiene: " + j2.tantos() + " tantos");

<<<<<<< HEAD
=======
        mazo.mostrarMazo();
>>>>>>> 6f69de1 (segundo Commit, se agrega contadores de punto segun lo que se cante)

    }
}