package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Jugador {
    private String nombre;
    private ArrayList<Carta> mano;
    private Integer puntos;
    private boolean esMano;
    private Integer tantos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new ArrayList<>();
        puntos = 0;
    }

    public void recibir(Carta c){
        mano.add(c);
    }

    public void verMano(){
        for (Carta c : mano) {
            System.out.println(c.toString());
        }
    }
<<<<<<< HEAD
/*
    public void jugarPrimeraMano(){
=======

    public void jugarPrimeraMano(){}/*
>>>>>>> 6f69de1 (segundo Commit, se agrega contadores de punto segun lo que se cante)
        tantos = tantos();
        Scanner in = new Scanner(System.in);
        int opc = 0;

        switch (opc){
            case 1:
                cantarAlgunEnvido();
            case 2:
                cantarTruco();
            case 3:
                jugarUnaCarta();
            case 4:
                irseAlMazo();
        }

    }*/

    public int tantos(){
        int tanto = 0;
        if (mano.get(0).getPalo() == mano.get(1).getPalo() && mano.get(1).getPalo() == mano.get(2).getPalo()){
            ArrayList<Integer> unArray = new ArrayList<>();
            for (Carta c:mano) {
                unArray.add(c.getValorEnvido());
                tanto += c.getValorEnvido();
            }
            tanto -= Collections.min(unArray);
            tanto +=20;
        } else if (mano.get(0).getPalo() == mano.get(1).getPalo()) {
            tanto = mano.get(1).getValorEnvido() +  mano.get(0).getValorEnvido() + 20;
        }else if (mano.get(2).getPalo() == mano.get(1).getPalo()) {
            tanto = mano.get(1).getValorEnvido() +  mano.get(2).getValorEnvido() + 20;
        }else if (mano.get(0).getPalo() == mano.get(2).getPalo()) {
            tanto = mano.get(0).getValorEnvido() +  mano.get(2).getValorEnvido() + 20;
        }else{
            ArrayList <Integer> unArray = new ArrayList();
            for (Carta c : mano) {
                unArray.add(c.getValorEnvido());
            }
           tanto = Collections.max(unArray);
        }
        return tanto;
    }

    public int cantarAlgunEnvido(){
        Scanner in = new Scanner(System.in);
        int opc = 0;

        System.out.println("1. Envido\n" +
                           "2. Real Envido\n" +
                           "3. Falta Envido\n" +
                            "0. Atras");

        opc = in.nextInt();
        return opc;
    }

    public int responderEnvido(){
        Scanner in = new Scanner(System.in);
        int opc = 0;

        System.out.println("1. Quiero\n" +
                "2. No Quiero\n" +
                "3. Envido\n" +
                "4. Real Envido\n" +
                "5. Falta Envido\n" +
                "0. Atras");

        opc = in.nextInt();
        return opc;
    }

<<<<<<< HEAD


=======
    public boolean esMano(){
        return esMano;
    }

    public void setEsMano(boolean b){
        this.esMano = b;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void sumaPuntos(Integer pts){
        puntos += pts;
    }
>>>>>>> 6f69de1 (segundo Commit, se agrega contadores de punto segun lo que se cante)
}
