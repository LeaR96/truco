package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {

        private ArrayList<Carta> cartas;
        private String [] palos = {"Espada", "Basto", "Oro", "Copa"};
        private Integer [] numeros = {1,2,3,4,5,6,7,10,11,12};

        public Mazo(){
                cartas = new ArrayList<>();

                for (String p : palos) {
                        for (Integer n : numeros) {
                                cartas.add(new Carta(n,p));
                        }
                }

                for (Carta c : cartas) {
                        if((c.getNumero()>=4 && c.getNumero()<=6) || (c.getNumero()>=10)){
                                c.setValor(c.getNumero());
                        }else if((c.getNumero() == 7) && (c.getPalo() == "Copa" ||c.getPalo() == "Basto" )){
                                c.setValor(7);
                        }else if((c.getNumero() == 1) && (c.getPalo() == "Copa" ||c.getPalo() == "Oro" )){
                                c.setValor(15);
                        }else if (c.getNumero() == 2 || c.getNumero()==3 ){
                                c.setValor(c.getNumero()*10);
                        }else if((c.getNumero() == 7) && (c.getPalo() == "Oro")){
                                c.setValor(35);
                        }else if((c.getNumero() == 7) && (c.getPalo() == "Espada")){
                                c.setValor(40);
                        }else if((c.getNumero() == 1) && (c.getPalo() == "Basto")){
                                c.setValor(45);
                        }else if((c.getNumero() == 1) && (c.getPalo() == "Espada")){
                                c.setValor(50);
                        }
                }

                for (Carta c: cartas) {
                        if (c.getNumero()>7){
                                c.setValorEnvido(0);
                        }else{
                                c.setValorEnvido(c.getNumero());
                        }

                }
        }

        public void mostrarMazo(){
                for (Carta c: cartas) {
                        System.out.println(c.toString());
                }
        }

        public void mezclarMazo(){
                Collections.shuffle(this.cartas);
        }

        public void repartir(Jugador j1, Jugador j2){

                for(int i = 0; i < 6; i++){
                        j1.recibir(cartas.get(i));
                        i++;
                        j2.recibir(cartas.get(i));
                }
                /*
                j1.recibir(cartas.get(0));
                j2.recibir(cartas.get(1));
                j1.recibir(cartas.get(2));
                j2.recibir(cartas.get(3));
                j1.recibir(cartas.get(4));
                j2.recibir(cartas.get(5));
*/
        }
}

