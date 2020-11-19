package FactoryGame;

public class Player extends Entity {

	private float maxHealth;
	private float health = maxHealth;
	private float maxSaturation;
	private float saturation = maxSaturation;
	private CharacterSpritesheet spritesheet;
	
	protected Player(float x, float y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

}
