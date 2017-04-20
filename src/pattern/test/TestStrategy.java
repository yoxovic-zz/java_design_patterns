package pattern.test;

//imports for Strategy pattern
import design_pattern.Strategy.*;

public class TestStrategy {

	public static void main(String[] args) {

		
		AbstractClass firstModelClass = new SubClass_1();
		firstModelClass.performBehavior();
		firstModelClass.setBehavior(new AlgSubClass_2());
		firstModelClass.performBehavior();
		
		AbstractClass secondModelClass = new SubClass_2();
		secondModelClass.performBehavior();
//		firstModelClass.setBehavior(new AlgSubClass_1());
//		firstModelClass.performBehavior();
	}

}
