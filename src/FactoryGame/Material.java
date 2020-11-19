package FactoryGame;

import java.awt.image.BufferedImage;

public enum Material {
	GRASS0(0, true), GRASS1(1, true), GRASS2(2, true), GRASS3(3, true), STONE0(4, true), STONE1(5, true),STONE2(6, true);

	private int id;
	private boolean walkable;

	private Material(int id, boolean walkable) {
		this.id = id;
		this.walkable = walkable;
	}

	public int getId() {
		return id;
	}

	public BufferedImage getSprite() {
		return Game.textures.getSprite(id);
	}

	public boolean isWalkable() {
		return walkable;
	}

}
