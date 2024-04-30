package main;

import Publicacion.Tesis;
import Publicacion.Publicacion;

public class ppa {
    public static void main(String[] args) {
        Tesis t1 = new Tesis("la celula","12/12/2015","Ciencias de la salud");
        System.out.println(t1.resumen());

        System.out.println("Este es un system out print");
    }
}
