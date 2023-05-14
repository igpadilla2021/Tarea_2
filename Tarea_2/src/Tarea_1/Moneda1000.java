package Tarea_1;

/**
 * clase de una moneda de 1000 la cual hereda de Tarea_1.Moneda
 */
public class Moneda1000 extends Moneda {
    /**
     * Hereda el metodo constructor de Tarea_1.Moneda
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
