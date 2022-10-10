package Exceptions;

public class InvalidOptionException extends Exception {
    private String message;

    public InvalidOptionException(){
        this.message = "Opção não encontrada! Contate um administrador.";
    }

    public String getMessage(){
        return this.message;
    }
}
