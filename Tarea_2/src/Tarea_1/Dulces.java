package Tarea_1;

/**
 *Clase que define a el producto Bebida
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */

public abstract class Dulces extends Producto{
    /**
     * El metodo constructor ocupa solamente el numero de serie que se heredó de la clase Producto
     * @param numSerie Int heredado desde Producto
     */
    public Dulces(int numSerie) {
        super(numSerie);
    }
}

/**
 * clase que hereda de Dulces, para tener el dulce "Snickers"
 */
class Snickers extends Dulces{
    /**
     * Ocurre lo mismo que en la clase Dulce, solamente se ocupa el numero de serie heredado
     * @param numSerie Int heredado desde Dulce
     */
    public Snickers(int numSerie) {
        super(numSerie);
    }
    /**
     * se define el sabor que retorna Dulce
     * @return retorna el sabor "Snickers"
     */
    public String sabor(){
        return "snickers";
    }
}

/**
 * clase que hereda de Ducles, para tener el Dulce "Super8"
 */
class Super8 extends Dulces{
    /**
     * Ocurre lo mismo que en la clase Dulce, solamente se ocupa el numero de serie heredado
     * @param numSerie Int heredado desde Dulce
     */
    public Super8(int numSerie) {
        super(numSerie);
    }
    /**
     * se define el sabor que retorna Dulce
     * @return retorna el sabor "Super8"
     */
    public String sabor(){
        return "super8";
    }
}
