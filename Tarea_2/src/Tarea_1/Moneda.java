package Tarea_1;

/**
 * Clase que define a las Monedas
 *
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */


public abstract class Moneda implements Comparable<Moneda> {
    private int serie;

    /**
     * Metodo constructor de la clase Tarea_1.Moneda, se deja vacio ya que es una clase abstracta y queremos heredar estos
     * metodos a otras monedas con valores distintos
     */
    public Moneda() {
    }

    /**
     * Metodo getserie el cual al ser abstracto, retorna el valor que se le tenga de serie a la moneda que se le herede
     *
     * @return numero de serie de la moneda
     */
    public int getSerie() {
        return this.hashCode();
    }

    /**
     * metodo getvalor el cual es abstracto, sirve para conseguir el valor de la moneda en pesos
     *
     * @return valor de la moneda
     */
    public abstract int getValor();

}
