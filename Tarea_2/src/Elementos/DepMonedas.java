package Elementos;

import Tarea_1.Moneda;

import java.util.ArrayList;

/**
 * Clase que define al deposito de monedas ocupadas "dentro" de la maquina expendedora
 */
public class DepMonedas {
    /**
     * ArrayList que se ocupa en nuestros depositos
     */
    private final ArrayList al;

    /**
     * Metodo constructor de Deposito donde se define un Arraylist como al
     */
    public DepMonedas(){
        al=new ArrayList ();
    }

    /**
     * metodo add donde se añade una moneda al arraylist
     */
    public void add(Moneda moneda){
        al.add(moneda);
    }
}
