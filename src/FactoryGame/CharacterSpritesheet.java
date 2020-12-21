package FactoryGame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class CharacterSpritesheet {
	private File fileBody;
	private File fileHair;
	private File fileShirt;
	private File filePants;
	private File fileBoots;
	private List<BufferedImage> framesUp = new ArrayList<BufferedImage>();
	private List<BufferedImage> framesDown = new ArrayList<BufferedImage>();
	private List<BufferedImage> framesRight = new ArrayList<BufferedImage>();
	private List<BufferedImage> framesLeft = new ArrayList<BufferedImage>();
	private BufferedImage sheet;

	public CharacterSpritesheet(String filebody,String filehair,String fileshirt, String filepants, String fileboots) {
		String path = "src\\FactoryGame\\assets\\";
		fileBody = new File(path + filebody);
		fileHair = new File(path + filehair);
		fileShirt = new File(path + fileshirt);
		filePants = new File(path + filepants);
		fileBoots = new File(path + fileboots);
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		
		
	}

	public List<BufferedImage> getFramesUp() {
		return framesUp;
	}

	public List<BufferedImage> getFramesDown() {
		return framesDown;
	}

	public List<BufferedImage> getFramesRight() {
		return framesRight;
	}

	public List<BufferedImage> getFramesLeft() {
		return framesLeft;
	}

}
