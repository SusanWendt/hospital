package hospital;

public class Patient implements Bleedable {
	static final int DEFAULT_BLOODS = 42;
	static final int DEFAULT_HEALTH = 10;
	private int bloods = DEFAULT_BLOODS;
	private int health = DEFAULT_HEALTH;
	public int getBloods() {
		return bloods;
	}

	@Override
	public void removeBlood(int amount) {
		bloods -= amount;
	}

	public int getHealth() {
		return health;
	}

	public void giveHealth(int amount) {
		health +=amount;
	}

}
