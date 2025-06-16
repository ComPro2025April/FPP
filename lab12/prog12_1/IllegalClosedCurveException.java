package lab12.prog12_1;

public class IllegalClosedCurveException extends Exception{
    public IllegalClosedCurveException (){

    }
    public IllegalClosedCurveException (String msg){
        super("Illegal Closed Curve Exception thrown: " + msg);
    }
}
