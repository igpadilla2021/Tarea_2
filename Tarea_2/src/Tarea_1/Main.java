package Tarea_1;
public class Main {
    public static void main(String[] args){
        Expendedor exp=new Expendedor (3,600,900);
        Comprador c=null;
        Moneda m=null;
/** Prueba hasta agotar stock COCA COLA */
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(m.getSerie());
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda null COCA COLA */
        m = null;
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = null;
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda menor valor COCA COLA */
        m = new Moneda500();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda100();
        c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

/**--------------------------------------------------------------------------------------------------------*/

/** Prueba hasta agotar stock SPRITE */
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda null SPRITE */
        m = null;
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = null;
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda menor valor SPRITE */
        m = new Moneda500();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda100();
        c = new Comprador(m, Expendedor.SPRITE, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

/**--------------------------------------------------------------------------------------------------------*/

/** Prueba hasta agotar stock SNICKERS */
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SNIKERS, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SNIKERS, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SNIKERS, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SNIKERS, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda null SNIKERS */
        m = null;
        c = new Comprador(m, Expendedor.SNIKERS, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = null;
        c = new Comprador(m, Expendedor.SNIKERS, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda menor valor SNIKERS */
        m = new Moneda500();
        c = new Comprador(m, Expendedor.SNIKERS, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda100();
        c = new Comprador(m, Expendedor.SNIKERS, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

/**--------------------------------------------------------------------------------------------------------*/

/** Prueba hasta agotar stock SUPER 8 */
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda null SUPER 8 */
        m = null;
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = null;
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda menor valor SUPER 8 */
        m = new Moneda500();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda100();
        c = new Comprador(m, Expendedor.SUPER8, exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
    }
}