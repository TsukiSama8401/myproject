package gun;

public class GunTester1 {

	public static void main(String[] args) {
		Gun sg1 = new Gun("KS-23", "shotgun", 3, 150, 1.040);
		System.out.println("Name:" + sg1.name);
		System.out.println("Type:" + sg1.type);
		System.out.println("rds:" + sg1.rds);
		System.out.println("Range:" + sg1.range + "m");
		System.out.println("Leight:" + sg1.leight + "mm");

	}

}
