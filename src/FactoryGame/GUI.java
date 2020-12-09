package FactoryGame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseWheelEvent;

public class GUI {
	private int width, height;
	private int slots = 10;
	private int selected = 0;
	private PlayState playState;

	public GUI(int width, int height, PlayState playState) {
		this.width = width;
		this.height = height;
		this.playState = playState;
	}

	public void render(Graphics2D g) {
		for (int i = 0; i < slots; i++) {
			g.drawImage(GuiAssets.Slot.getSprite(), width / 2 - 32 - 4 * 64 - 32 + i * 64, height - 64, null);
		}
		g.drawImage(GuiAssets.SlotSelected.getSprite(), width / 2 - 32 - 4 * 64 - 32 + selected * 64, height - 64,
				null);
		for (int i = 0; i < 10; i++) {
			if (i * 10 < playState.getPlayer().getHealth())
				g.drawImage(Particles.HeartFull.getSprite(), width / 2 - 32 - 4 * 64 - 32 + i * 32, height - 96, null);
			else
				g.drawImage(Particles.HeartEmpty.getSprite(), width / 2 - 32 - 4 * 64 - 32 + i * 32, height - 96, null);
			if (i * 10 < playState.getPlayer().getStamina())
				g.drawImage(Particles.StaminaFull.getSprite(), width / 2 - 32 - 4 * 64 - 32 + i * 32 + 320, height - 96,
						null);
			else
				g.drawImage(Particles.StaminaEmpty.getSprite(), width / 2 - 32 - 4 * 64 - 32 + i * 32 + 320,
						height - 96, null);

		}

	}

	public void update() {

	}

	public void mouseWheelMoved(MouseWheelEvent e) {
		double dir = e.getPreciseWheelRotation();
		selected += dir;
		if (selected == -1) {
			selected = 9;
		}
		if (selected == 10) {
			selected = 0;
		}
	}

}
