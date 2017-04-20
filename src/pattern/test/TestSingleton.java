package pattern.test;
import design_pattern.Singleton.*;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		printSingleton("s1", s1);
		
		Singleton s2 = Singleton.getInstance();
		printSingleton("s2", s2);

	}
	
	public static void printSingleton(String name, Singleton instance){
		System.out.println(String.format("Object name: %s, Object Hashcode: %d", name, instance.hashCode()));
	}

}
