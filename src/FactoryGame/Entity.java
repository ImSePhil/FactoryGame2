package FactoryGame;

import java.awt.Graphics2D;

public class Entity extends GameObject {
	
	protected float speed;
	
	protected Entity(float x, float y, int width, int height, float speed) {
		super(x, y, width, height);
		this.speed = speed;
	}

}
