
public class Villan extends Hero {

	public Villan(String name) {
		super(name);
	}
	
	public void steals() {
		System.out.printf("%s is stealing\n",this.name);
	}
	
}
