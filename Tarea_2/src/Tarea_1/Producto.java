package Tarea_1;

/**
 *Clase que define a el producto
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */

public abstract class Producto {
    /**
     * Int que registra el numero de serie para el producto que se pide
     */
    private int serie;

    /**
     * Definimos la serie como el numero de serie que se da en el parametro
     * @param numSerie Int Numero de serie
     */
    public Producto(int numSerie){
        this.serie=numSerie;
    }

    /**
     * Metodo para obtener la serie de el producto
     * @return retorna el numero de serie dado
     */
    public int getSerie(){
        return serie;
    }

    /**
     * Metodo abstracto para ocupar en los productos donde se hereda la clase
     * @return el sabor de el producto
     */
    public abstract String sabor();
}
