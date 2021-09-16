package demo.example.Exception;

public class EmptyTxtException extends Exception{
    public EmptyTxtException() {
    }

    public EmptyTxtException(String message) {
        super(message);
    }
}
