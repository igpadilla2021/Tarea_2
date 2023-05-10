package Tarea_1;

public class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException(String error){
        super(error);
    }
}