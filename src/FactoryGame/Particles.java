package FactoryGame;

import java.awt.image.BufferedImage;

public enum Particles {
	HeartFull(0),HeartEmpty(1),StaminaFull(2),StaminaEmpty(3);
	
	int id;
	private Particles(int id) {
		this.id = id;
	}
	
	public BufferedImage getSprite() {
		return Game.particleTextures.getSprite(id);
	}
	
}
