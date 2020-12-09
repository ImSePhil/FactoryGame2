package FactoryGame;

import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Game extends JFrame {

	public static int blocksize = 64;
	public static int chunksize = 4;
	private boolean generate;
	private WorldGenerator generator;
	private static final long serialVersionUID = 1L;
	public static Spritesheet textures = new Spritesheet("\\src\\textures.png", 64);
	public static Spritesheet guiTextures = new Spritesheet("\\src\\gui.png", 64);
	public static CharacterSpritesheet sheet = new CharacterSpritesheet(64, 64, "PlayerSpriteSheet.png");
	public static int windowHeight = 800;
	public static int windowWidth = 1200;
	public static Spritesheet particleTextures = new Spritesheet("\\src\\particles.png", 32);

	public Game(boolean generate) {
		super("Factory Game");
		setLayout(new BorderLayout());
		add(new GameManager(), BorderLayout.CENTER);
		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Game(false);
	}
}
