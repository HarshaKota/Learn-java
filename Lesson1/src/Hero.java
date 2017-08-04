
public class Hero {
	//Private variables
	protected int speed;
	private int strength;
	private int health;
	//Public variables
	public String name;
	
	//Getters	
	public int getSpeed() {
		return speed;
	}
	public int getStrength() {
		return strength;
	}
	public int getHealth() {
		return health;
	}
	
	//Constructor
	public Hero(String name) {
		this.name = name;
		this.generateAbilities();
	}
	
	//Methods
	private void generateAbilities() {
		this.speed = (int) (Math.random()*100+1);
		this.strength = (int) (Math.random()*100+1);
		this.health = (int) (Math.random()*100+1);
	}
	
	public void runs() {
		System.out.printf("%s runs at %d speed\n",this.name,this.speed);
	}
	public void fights() {
		System.out.printf("%s fights with %d strength\n",this.name,this.strength);
	}
	public void showAbilities() {
		System.out.println("*-------------------*");
		System.out.printf("%s,Your Strength is %d\n",this.name,this.strength);
		System.out.printf("%s,Your Speed    is %d\n",this.name,this.speed);
		System.out.printf("%s,Your Health   is %d\n",this.name,this.health);
		System.out.println("*-------------------*");
	}

	
}
