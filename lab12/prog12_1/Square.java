package lab12.prog12_1;

public class Square extends ClosedCurve {
	double side;
	public Square(Double side) throws IllegalClosedCurveException {
		if(side < 0) throw new IllegalClosedCurveException("Square side is "+side);
		this(side.doubleValue());
	}

	public Square(double side) throws IllegalClosedCurveException {
		if(side < 0) throw new IllegalClosedCurveException("Square side is "+side);
		this.side = side;
	}

	double computeArea() {
		return(side*side);
	}

}
