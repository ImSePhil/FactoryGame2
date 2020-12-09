package FactoryGame;

import java.awt.image.BufferedImage;

public enum GuiAssets {
	Slot(0),SlotSelected(1),HeartsFull(2),HeartsHalf(3),HeartsEmpty(4),StaminaFull(5),StaminaHalf(6),StaminaEmpty(7);
	
	int id;
	private GuiAssets(int id) {
		this.id = id;
	}
	
	public BufferedImage getSprite() {
		return Game.guiTextures.getSprite(id);
	}
	
}
