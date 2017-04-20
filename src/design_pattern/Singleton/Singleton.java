package design_pattern.Singleton;

public class Singleton {
	
	private static Singleton singletonInstance = null;
	
	private Singleton(){
		System.out.print("Singleton instance has been created!");
	}
	
	public static Singleton getInstance(){
		if(singletonInstance == null){
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}

}
