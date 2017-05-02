package oo.abstraction;

public class Truck extends Car {
	
	int wheels;
	float tons;
	public Truck(String brand, String name, int cc,int wheels) {
		super(brand, name, cc);
		this.wheels = wheels;
	}
	
	public void setTons(float t){
		tons = t;
	}
	
	public float addTons(float t){
		return tons = tons + t;
	}

}
