package Tarea_1;

public class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException(String error){
        super(error);
    }
}