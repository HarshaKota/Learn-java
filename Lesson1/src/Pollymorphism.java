
public class Pollymorphism {

	public static void main(String[] args) {
		Hero poly[] = new Hero[4];
		poly[0] = new Hero("Superman");
		poly[1] = new Villan("Megamind");
		poly[2] = new Vigilante("Batman");
		poly[3] = new Speedster("Flash");
		
		
		for (Hero x: poly) {
			x.runs();
		}
		
		System.out.println();
		
		Mayor mayor = new Mayor();
		for (Hero x: poly) {
			mayor.CallSuperHeroes(x);
		}
		
	}

}
