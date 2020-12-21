package FactoryGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Game extends JFrame{

	public static int blocksize = 64;
	public static int chunksize = 4;
	private boolean generate;
	private WorldGenerator generator;
	private static final long serialVersionUID = 1L;
	public static Spritesheet textures = new Spritesheet("\\src\\textures.png", 64);
	public static Spritesheet guiTextures = new Spritesheet("\\src\\gui.png", 64);
	public static int windowHeight = 800;
	public static int windowWidth = 1200;
	public static Spritesheet particleTextures = new Spritesheet("\\src\\particles.png", 32);
	public static int currentWindowWidth;
	public static int currentWindowHeight;
	public static Color lightGrey = new Color(166,166,166);
	public static Color darkGrey = new Color(89,89,89);
	

	public Game(boolean generate) {
		super("Factory Game");
		setLayout(new BorderLayout());
		add(new GameManager(), BorderLayout.CENTER);
		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		addComponentListener(new ComponentListener() {
			
			@Override
			public void componentShown(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void componentResized(ComponentEvent e) {
				currentWindowWidth = getWidth();
				currentWindowHeight = getHeight();
			}
			
			@Override
			public void componentMoved(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void componentHidden(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public static void main(String[] args) {
		new Game(false);
	}
}
