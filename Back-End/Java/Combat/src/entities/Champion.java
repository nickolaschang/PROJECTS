package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armour;

	public Champion(String name, int life, int attack, int armour) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armour = armour;
	}

	public Champion() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmour() {
		return armour;
	}

	public void setArmour(int armour) {
		this.armour = armour;
	}

	public void takeDamage(int attack) {
		if (this.life > 0 && attack > armour) {
			this.life -= attack - armour;
		} else if (this.life > 0 && attack < armour) {
			this.life -= attack - attack + 1;
		} else
			System.out.println("(morreu)");

	}

}
