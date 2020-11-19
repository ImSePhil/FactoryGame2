package FactoryGame;

import java.awt.Graphics2D;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Chunk implements Saveable, Updatable, Renderable, Loadable {

	private Block[][] blocks;

	public Chunk(int chunksize) {
		this.blocks = new Block[chunksize][chunksize];
	}

	@Override
	public void fromJson() {
		for (Block[] _blocks : blocks) {
			for (Block block : _blocks) {
				block.fromJson();
			}
		}
	}

	@Override
	public void render(Graphics2D g) {
		for (Block[] _blocks : blocks) {
			for (Block block : _blocks) {
				block.render(g);
			}
		}
	}

	@Override
	public void update() {
		for (Block[] _blocks : blocks) {
			for (Block block : _blocks) {
				block.update();
			}
		}
	}

	@Override
	public JSONArray toJsonArray() {
		JSONArray array = new JSONArray();
		for (Block[] _blocks : blocks) {
			for (Block block : _blocks) {
				array.add(block.toJsonObject());
				
			}
		}
		return array;
	}

	public void generateBlockAt(int x, int y, int id) {
		int chunkX = x / Game.chunksize;
		int chunkY = y / Game.chunksize;
		int blockX = x - chunkX * Game.chunksize;
		int blockY = y - chunkY * Game.chunksize;
		blocks[blockY][blockX] = new Block(x * Game.blocksize, y * Game.blocksize, Game.blocksize, Game.blocksize,
				Material.values()[id]);
	}

	@Override
	public JSONObject toJsonObject() {
		// TODO Auto-generated method stub
		return null;
	}

}
