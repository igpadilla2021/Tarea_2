package Tarea_1;

/**
 *Clase que define a las Monedas
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */


public abstract class Moneda implements Comparable<Moneda> {
    private int serie;
    /**
     * Metodo constructor de la clase Moneda, se deja vacio ya que es una clase abstracta y queremos heredar estos
     * metodos a otras monedas con valores distintos
     */
    public Moneda(){
    }

    /**
     * Metodo getserie el cual al ser abstracto, retorna el valor que se le tenga de serie a la moneda que se le herede
     * @return numero de serie de la moneda
     */
    public int getSerie() {
        return this.hashCode();
    }

    /**
     * metodo getvalor el cual es abstracto, sirve para conseguir el valor de la moneda en pesos
     * @return valor de la moneda
     */
    public abstract int getValor();

}
/**
 * clase de una moneda de 1000 la cual hereda de Moneda
 */
class Moneda1000 extends Moneda{
    /**
     * Hereda el metodo constructor de Moneda
     */
    public Moneda1000(){super();}

    /**
     * metodo getvalor el cual da el valor de la moneda
     * @return Int que da el valor 1000
     */
    public int getValor() {
        return 1000;
    }

    @Override
    public int getSerie() {
        return super.getSerie();
    }

    @Override
    public int compareTo(Moneda o) {
        return 0;
    }
}
/**
 * clase de una moneda de 500 la cual hereda de Moneda
 */
class Moneda500 extends Moneda {
    /**
     * Hereda el metodo constructor de Moneda
     */
    public Moneda500() {
        super();
    }
    /**
     * metodo getvalor el cual da el valor de la moneda
     * @return Int que da el valor 500
     */
    public int getValor() {
        return 500;
    }

    @Override
    public int getSerie() {
        return super.getSerie();
    }

    @Override
    public int compareTo(Moneda o) {
        return 0;
    }
}
/**
 * clase de una moneda de 100 la cual hereda de Moneda
 */
class Moneda100 extends Moneda{
    /**
     * Hereda el metodo constructor de Moneda
     */
    public Moneda100() {
        super();
    }
    /**
     * metodo getvalor el cual da el valor de la moneda
     * @return Int que da el valor 100
     */
    public int getValor() {
        return 100;
    }

    @Override
    public int getSerie() {
        return super.getSerie();
    }

    @Override
    public int compareTo(Moneda o) {
        return 0;
    }
}
