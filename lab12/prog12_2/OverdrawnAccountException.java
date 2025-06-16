package lab12.prog12_2;

public class OverdrawnAccountException extends Exception {
    public OverdrawnAccountException(String error) {
        super("OverdrawnAccountException thrown: "+error);
    }
}
