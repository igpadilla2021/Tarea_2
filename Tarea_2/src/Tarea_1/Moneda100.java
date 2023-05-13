package Tarea_1;

/**
 * clase de una moneda de 100 la cual hereda de Tarea_1.Moneda
 */
public class Moneda100 extends Moneda {
    /**
     * Hereda el metodo constructor de Tarea_1.Moneda
     */
    public Moneda100() {
        super();
    }

    /**
     * metodo getvalor el cual da el valor de la moneda
     *
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
