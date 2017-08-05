
public class StaticExample1 {
	private String superHeroes;
	private static int noOfSuperHeroes;
	
	public StaticExample1(String name) {
		this.superHeroes = name;
		this.noOfSuperHeroes += 1;
		System.out.println("There are "+this.noOfSuperHeroes+" no of SuperHeroes");
	}
}
