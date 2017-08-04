
public class Project {

	public static void main(String[] args) {
		Hero hero = new Hero("Superman");
		
		hero.runs();
		hero.fights();
		hero.showAbilities();
		
		Villan villan = new Villan("Sly-man");
		
		villan.runs();
		villan.steals();
		villan.fights();
		villan.showAbilities();
		
		Vigilante vigilante = new Vigilante("Batman");
		
		vigilante.runs();
		vigilante.fights();
		vigilante.steals();
		vigilante.showAbilities();
		
		CantAccess ca = new CantAccess();
		ca.increaseSpeed();
	}
}
