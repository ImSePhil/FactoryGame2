package FactoryGame;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Spritesheet {

	private BufferedImage spritesheet;
	int cols;
	private int size;
	private String path;

	public Spritesheet(String path, int size) {
		this.size = size;
		this.path = System.getProperty("user.dir") + path;
		loadImage();
	}

	private void loadImage() {
		File f = new File(path);
		try {
			System.out.println(f.getAbsolutePath());
			spritesheet = ImageIO.read(f);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(420);
		}
		cols = spritesheet.getWidth() / size;
	}

	public BufferedImage getSprite(int id) {
		int x = (id % cols) * size;
		int y = (id / cols) * size;
		try {
			return spritesheet.getSubimage(x, y, size, size);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
