package FactoryGame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class Renderer {
	public static void drawImage(Graphics2D g, Camera camera, Image image, int x, int y) {
		g.drawImage(image, x - camera.getX(), y - camera.getY(), null);
	}

	public static void drawImage(Graphics2D g, Camera camera, Image image, float x, float y) {
		g.drawImage(image, (int) x - camera.getX(), (int) y - camera.getY(), null);
	}
}