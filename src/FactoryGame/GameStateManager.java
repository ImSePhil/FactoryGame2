package FactoryGame;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class GameStateManager {

	public static final int MENUSTATE = 0;
	public static final int PLAYSTATE = 1;
	private int state;
	private State[] states;

	public GameStateManager(int state) {
		states = new State[2];
		states[1] = new PlayState(this);
		this.state = state;
	}

	public void render(Graphics2D g) {
		states[state].render(g);
	}

	public void mouseClicked(MouseEvent e) {
		states[state].mouseClicked(e);
	}

	public void mouseEntered(MouseEvent e) {
		states[state].mouseEntered(e);
	}

	public void mouseExited(MouseEvent e) {
		states[state].mouseExited(e);
	}

	public void mousePressed(MouseEvent e) {
		states[state].mousePressed(e);
	}

	public void update() {
		states[state].update();
	}

	public void keyTyped(KeyEvent e) {
		states[state].keyTyped(e);
	}

	public void mouseReleased(MouseEvent e) {
		states[state].mouseReleased(e);
	}

	public void keyReleased(KeyEvent e) {
		states[state].keyReleased(e);
	}

	public void keyPressed(KeyEvent e) {
		states[state].keyPressed(e);
	}

}
