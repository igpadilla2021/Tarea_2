package Tarea_1;

/**
 *Clase que define a el producto Bebida
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */

public abstract class Bebida extends Producto{
    /**
     * El metodo constructor ocupa solamente el numero de serie que se heredó de la clase Producto
     * @param numSerie Int heredado desde Producto
     */
    public Bebida(int numSerie) {
        super(numSerie);
    }
}

/**
 * clase que hereda de Bebida, para tener la bebida "Sprite"
 */
class Sprite extends Bebida{
    /**
     * Ocurre lo mismo que en la clase Bebida, solamente se ocupa el numero de serie heredado
     * @param numSerie Int heredado desde Bebida
     */
    public Sprite(int numSerie) {
        super(numSerie);
    }

    /**
     * se define el sabor que retorna Sprite
     * @return retorna el sabor "sprite"
     */
    public String sabor(){
        return "sprite";
    }
}

/**
 * clase que hereda de Bebida, para tener la bebida "Coca cola"
 */
class CocaCola extends Bebida{
    /**
     * Ocurre lo mismo que en la clase Bebida, solamente se ocupa el numero de serie heredado
     * @param numSerie Int heredado desde Bebida
     */
    public CocaCola(int numSerie) {
        super(numSerie);
    }

    /**
     * se define el sabor que retorna CocaCola
     * @return retorna el sabor "cocacola"
     */
    public String sabor(){
        return "cocacola";
    }
}
