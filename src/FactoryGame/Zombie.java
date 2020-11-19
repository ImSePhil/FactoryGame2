package FactoryGame;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Zombie extends Enemy {
	private int frame;
	private List<BufferedImage> framesDown = new ArrayList<BufferedImage>();
	private List<BufferedImage> framesLeft = new ArrayList<BufferedImage>();
	private List<BufferedImage> framesRight = new ArrayList<BufferedImage>();
	private List<BufferedImage> framesUp = new ArrayList<BufferedImage>();
	private CharacterSpritesheet spritesheet;
	private int subframe;
	
	protected Zombie(float x, float y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
}
