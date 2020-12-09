package FactoryGame;

import java.awt.event.KeyEvent;

public class Camera {
	private float x;
	private float y;
	private float vSpeed;
	private float hSpeed;

	public float getX() {
		return x;
	}

	public float getY() {
		return y;

	}

	public void update() {
		x += hSpeed;
		y += vSpeed;
	}
	
	public void keyReleased(KeyEvent e, int k) {
		switch (k) {
		case KeyEvent.VK_W:
			vSpeed = 0;
			break;
		case KeyEvent.VK_S:
			vSpeed = 0;
			break;
		case KeyEvent.VK_A:
			hSpeed = 0;
			break;
		case KeyEvent.VK_D:
			hSpeed = 0;
			break;
		}
	}

	public void keyPressed(KeyEvent e, int k) {
		switch (k) {
		case KeyEvent.VK_W:
			vSpeed = -3;
			break;
		case KeyEvent.VK_S:
			vSpeed = 3;
			break;
		case KeyEvent.VK_A:
			hSpeed = -3;
			break;
		case KeyEvent.VK_D:
			hSpeed = 3;
			break;
		}
	}
}