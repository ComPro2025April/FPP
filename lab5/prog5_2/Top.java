package lab5.prog5_2;

public class Top {
	int t = 1;
	Middle mid = new Middle();
	Middle.Bottom midBot = new Middle().new Bottom();
	//returns the value in the instance variable of Bottom
	int readBottom() {
		//implement
		return midBot.b;
	}
	class Middle {
		int m = 2;
		//returns sum of instance variable in Top and
		//instance variable in Bottom
		int addTopAndBottom() {
			//implement
			return Top.this.t + midBot.b;
		}
		class Bottom {
			int b = 3;
			//returns the product of the instance variables
			//in all three classes
			int multiplyAllThree() {
				//implement
				return Top.this.t * mid.m * b;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();

		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midBot.multiplyAllThree());

	}

}