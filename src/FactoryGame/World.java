package FactoryGame;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class World {

	private Chunk[][] chunks;
	private int chunksX;
	private int chunksY;
	private String path;
	private Player player;
	private Camera camera;

	public World(int chunksX, int chunksY) {
		this.chunks = new Chunk[chunksY][chunksX];
		this.chunksX = chunksX;
		this.chunksY = chunksY;
		for (int y = 0; y < chunksY; y++) {
			for (int x = 0; x < chunksX; x++) {
				chunks[y][x] = new Chunk(Game.chunksize);
			}
		}
		player = new Player(64, 64, 64, 64, 4);
		camera = new Camera(player);
	}

	public int getChunksX() {
		return chunksX;
	}

	public int getChunksY() {
		return chunksY;
	}

	public void update() {
		for (Chunk[] _chunks : chunks) {
			for (Chunk chunk : _chunks) {
				chunk.update();
			}
		}
		player.update();
	}

	public void render(Graphics2D g) {
		for (Chunk[] _chunks : chunks) {
			for (Chunk chunk : _chunks) {
				chunk.render(g);
			}
		}
		player.render(g);
	}

	public void generateBlockAt(int x, int y, int id) {
		int chunkX = x / Game.chunksize;
		int chunkY = y / Game.chunksize;
		chunks[chunkY][chunkX].generateBlockAt(x, y, id);
	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseMoved(MouseEvent e, Point p) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseWheelMoved(MouseWheelEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void keyTyped(KeyEvent e) {

	}

	public void mouseClicked(MouseEvent e) {

	}

	public void keyPressed(KeyEvent e, int k) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_D:
		case KeyEvent.VK_W:
		case KeyEvent.VK_S:
		case KeyEvent.VK_A:
			player.keyPressed(e);
		}
	}

	public void keyReleased(KeyEvent e, int k) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_D:
		case KeyEvent.VK_W:
		case KeyEvent.VK_S:
		case KeyEvent.VK_A:
			player.keyReleased(e);
		}
	}

}
