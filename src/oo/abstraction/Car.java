package oo.abstraction;

public class Car {
		int id;
		String brand;
		int cc;
		String name;
		String type;
		float milage;
		int status;
		public Car (String brand,String name,int cc){
			this.brand = brand;
			this.cc = cc;
			this.name = name;
			}

		public void setMilage(int m){
			milage = m;
		}
		public float addMilage(int m){
			return milage = milage + m;
		}
		public void maintain(){
			status = 5;
		}
}
