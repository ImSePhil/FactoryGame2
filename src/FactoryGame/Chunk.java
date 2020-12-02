package FactoryGame;

import java.awt.Graphics2D;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Chunk{

	private Block[][] blocks;
	private int blocksX;
	private int blocksY;

	public Chunk(int chunksize) {
		this.blocks = new Block[chunksize][chunksize];
		this.blocksX = chunksize;
		this.blocksY = chunksize;
	}

	public void render(Graphics2D g, Camera camera) {
		for (Block[] _blocks : blocks) {
			for (Block block : _blocks) {
				block.render(g,camera);
			}
		}
	}

	public void update() {
		for (Block[] _blocks : blocks) {
			for (Block block : _blocks) {
				block.update();
			}
		}
	}

	public void generateBlockAt(int x, int y, int id) {
		int chunkX = x / Game.chunksize;
		int chunkY = y / Game.chunksize;
		int blockX = x - chunkX * Game.chunksize;
		int blockY = y - chunkY * Game.chunksize;
		blocks[blockY][blockX] = new Block(x * Game.blocksize, y * Game.blocksize, Game.blocksize, Game.blocksize,
				Material.values()[id]);
	}
}
