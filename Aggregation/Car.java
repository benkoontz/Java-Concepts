package halo;

final class Car {
	
	private final Engine engine; // composition
	//private Engine engine; // aggregation

	Car(Engine engine) {
		this.engine = engine;
	}
	
	public void move() {
		
		{
			engine.work();
			System.out.println("car is moving");
		}
	}
}
