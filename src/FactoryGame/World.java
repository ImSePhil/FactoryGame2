package FactoryGame;

import java.awt.Graphics2D;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class World implements Saveable, Renderable, Loadable, Updatable {

	private Chunk[][] chunks;
	private int chunksX;
	private int chunksY;
	private String path;

	public World(Chunk[] chunks, List<GameObject> objects) {

	}

	public World(int chunksX, int chunksY) {
		this.chunks = new Chunk[chunksY][chunksX];
		for (int y = 0; y < chunksY; y++) {
			for (int x = 0; x < chunksX; x++) {
				chunks[y][x] = new Chunk(Game.chunksize);
			}
		}
	}

	@Override
	public void update() {
		for (Chunk[] _chunks : chunks) {
			for (Chunk chunk : _chunks) {
				chunk.update();
			}
		}
	}

	@Override
	public void fromJson() {
		for (Chunk[] _chunks : chunks) {
			for (Chunk chunk : _chunks) {
				chunk.fromJson();
			}
		}
	}

	@Override
	public void render(Graphics2D g) {
		for (Chunk[] _chunks : chunks) {
			for (Chunk chunk : _chunks) {
				chunk.render(g);
			}
		}
	}

	@Override
	public JSONArray toJsonArray() {
		JSONArray array = new JSONArray();
		for (Chunk[] _chunks : chunks) {
			for (Chunk chunk : _chunks) {
				array.add(chunk.toJsonArray());
			}
		}
		System.out.println(array.toJSONString());
		
		return array;
	}

	public void generateBlockAt(int x, int y, int id) {
		int chunkX = x / Game.chunksize;
		int chunkY = y / Game.chunksize;
		int blockX = x - chunkX * Game.chunksize;
		int blockY = y - chunkY * Game.chunksize;
		
		chunks[chunkY][chunkX].generateBlockAt(x, y, id);
		

	}

	@Override
	public JSONObject toJsonObject() {
		// TODO Auto-generated method stub
		return null;
	}
}
