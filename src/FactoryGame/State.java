package FactoryGame;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public abstract class State {

	protected GameStateManager gsm;

	public State(GameStateManager gsm) {
		this.gsm = gsm;
	}

	public abstract void update();

	public abstract void render(Graphics2D g);

	public abstract void keyPressed(KeyEvent e, int k);

	public abstract void keyReleased(KeyEvent e, int k);

	public abstract void mousePressed(MouseEvent e);

	public abstract void mouseReleased(MouseEvent e);

	public abstract void mouseMoved(MouseEvent e, Point p);

	public abstract void mouseWheelMoved(MouseWheelEvent e);

	public abstract void mouseExited(MouseEvent e);

	public abstract void mouseEntered(MouseEvent e);

	public abstract void mouseClicked(MouseEvent e);

	public abstract void keyTyped(KeyEvent e);

	public abstract void keyPressed(KeyEvent e);

	public abstract void keyReleased(KeyEvent e);

	public abstract void actionPerformed(ActionEvent e);

}
