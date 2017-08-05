
public class StaticExample1 {
	
	private String superHeroes;
	private static int noOfSuperHeroes;
	
	public StaticExample1(String name) {
		this.superHeroes = name;
		increaseNoOfHeroesHelper();
		System.out.println("There are "+noOfSuperHeroes+" no of SuperHeroes "+this.superHeroes);
	}
	
	public static void increaseNoOfHeroesHelper() {
		noOfSuperHeroes += 1;
	}
	
	public void fight() {
		System.out.println("Fight the bad guys "+this.superHeroes);
	}
}
