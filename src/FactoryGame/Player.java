package FactoryGame;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.List;

public class Player extends Entity {

	private float maxHealth;
	private float health = maxHealth;
	private float maxSaturation;
	private float saturation = maxSaturation;
	private CharacterSpritesheet spritesheet;
	private float vSpeed, hSpeed;
	private List<BufferedImage> framesUp;
	private List<BufferedImage> framesLeft;
	private List<BufferedImage> framesRight;
	private List<BufferedImage> framesDown;
	private List<BufferedImage> _frames;
	private int frame = 0;
	private int subframe = 0;
	private int frames;

	protected Player(float x, float y, int width, int height, float speed) {
		super(x, y, width, height, speed);
		this.framesDown = Game.sheet.getFramesDown();
		this.framesRight = Game.sheet.getFramesRight();
		this.framesLeft = Game.sheet.getFramesLeft();
		this.framesUp = Game.sheet.getFramesUp();
		frames = framesDown.size();
		_frames = framesDown;
	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			vSpeed = -speed;
			_frames = framesUp;
			break;
		case KeyEvent.VK_D:
			hSpeed = speed;
			_frames = framesRight;
			break;
		case KeyEvent.VK_A:
			hSpeed = -speed;
			_frames = framesLeft;
			break;
		case KeyEvent.VK_S:
			vSpeed = speed;
			_frames = framesDown;
			break;
		}
	}

	protected void update() {
		x += hSpeed;
		y += vSpeed;
		if (hSpeed != 0 || vSpeed != 0) {
			subframe++;
		} else {
			frame = 0;
			subframe = 0;
			_frames = framesDown;
		}

		if (subframe == 6) {
			subframe = 0;
			frame++;
			if (frame == frames) {
				frame = 0;
			}
		}
	}

	protected void render(Graphics2D g) {
		g.drawImage(_frames.get(frame), (int) x, (int) y, 64, 64, null);
	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			vSpeed = 0;
			break;
		case KeyEvent.VK_D:
			hSpeed = 0;
			break;
		case KeyEvent.VK_A:
			hSpeed = 0;
			break;
		case KeyEvent.VK_S:
			vSpeed = 0;
			break;

		}
	}
}
