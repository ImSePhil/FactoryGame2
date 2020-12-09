package FactoryGame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PlayState extends State {
	private World world;
	private GUI gui;
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
		world = generateNewWorld("World.json", 64);
		gui = new GUI(Game.windowWidth, Game.windowHeight);
	}

	public World loadWorld(String filename) {
		WorldLoader loader = new WorldLoader(filename);
		try {
			loader.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loader.getWorld();
	}

	public void saveWorld() {
		WorldSaver saver = new WorldSaver(world, "World.json");
		try {
			saver.save();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public World generateNewWorld(String filename, int size) {
		WorldGenerator gen = new WorldGenerator();
		gen.generate(size, size, filename);
		return gen.getWorld();
	}

	@Override
	public void update() {
		world.update();
		gui.update();
	}

	@Override
	public void render(Graphics2D g) {
		g.setColor(Color.black);
		world.render(g);
		gui.render(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		world.keyPressed(e, e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		world.keyReleased(e,e.getKeyCode());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		world.mousePressed(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		world.mouseReleased(e);
	}

	@Override
	public void mouseMoved(MouseEvent e, Point p) {
		world.mouseMoved(e,p);
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		world.mouseWheelMoved(e);
		gui.mouseWheelMoved(e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		world.mouseExited(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		world.mouseEntered(e);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		world.mouseClicked(e);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		world.keyTyped(e);
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}
}
