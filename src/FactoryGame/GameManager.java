package FactoryGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GameManager extends JPanel implements ActionListener, KeyListener, MouseListener,MouseWheelListener{
	private static final long serialVersionUID = 1L;
	private GameStateManager gsm;
	public static int height;
	private Timer timer;
	public static int width;

	public GameManager() {
		super();
		setPreferredSize(new Dimension(Game.windowWidth,Game.windowHeight));
		addKeyListener(this);
		addMouseListener(this);
		addMouseWheelListener(this);
		setFocusable(true);
		requestFocus();
		setBackground(Color.WHITE);
		width = getPreferredSize().width;
		height = getPreferredSize().height;
		gsm = new GameStateManager(GameStateManager.PLAYSTATE);
	}
	
	@Override
	public void addNotify() {
		super.addNotify();
		timer = new Timer(8,this);
		timer.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setBackground(Color.black);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2.setColor(Color.black);
		g2.fillRect(0, 0, getWidth(), getHeight());
		gsm.render(g2);
		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		gsm.mouseClicked(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		gsm.mouseEntered(e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		gsm.mouseExited(e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		gsm.mousePressed(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		gsm.mouseReleased(e);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		gsm.keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		gsm.keyReleased(e);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		gsm.keyTyped(e);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}

	public void update() {
		gsm.update();
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		gsm.mouseWheelMoved(e);
	}
}
