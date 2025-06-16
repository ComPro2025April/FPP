package lab12.prog12_1;

public class IllegalTriangleException extends IllegalClosedCurveException{
    private String customMessage;

    @Override
    public String getMessage() {
        return "Illegal Triangle Exception thrown: " + customMessage;
    }

    public IllegalTriangleException (String msg){
        super();
        this.customMessage = msg;
    }
}
