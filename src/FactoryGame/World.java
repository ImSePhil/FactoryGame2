import java.awt.Graphics2D;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class World implements Renderable, Updatable {

	private Chunk[][] chunks;
	private int chunksX;
	private int chunksY;
	private String path;

	public World(Chunk[] chunks, List<GameObject> objects) {

	}

	public World(int chunksX, int chunksY) {
		this.chunks = new Chunk[chunksY][chunksX];
		this.chunksX = chunksX;
		this.chunksY = chunksY;
		for (int y = 0; y < chunksY; y++) {
			for (int x = 0; x < chunksX; x++) {
				chunks[y][x] = new Chunk(Game.chunksize);
			}
		}
	}

	public int getChunksX() {
		return chunksX;
	}

	public int getChunksY() {
		return chunksY;
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
	public void render(Graphics2D g) {
		for (Chunk[] _chunks : chunks) {
			for (Chunk chunk : _chunks) {
				chunk.render(g);
			}
		}
	}

	@SuppressWarnings("unchecked")
	public JSONArray toJsonArray() {
		JSONArray array = new JSONArray();
		array.add("WORLD");
		array.add(chunksX);
		array.add(chunksY);
		JSONArray array2 = new JSONArray();
		for (Chunk[] _chunks : chunks) {
			for (Chunk chunk : _chunks) {
				array2.add(chunk.toJsonArray());
			}
		}
		array.add(array2);
		return array;
	}

	public void generateBlockAt(int x, int y, int id) {
		int chunkX = x / Game.chunksize;
		int chunkY = y / Game.chunksize;
		chunks[chunkY][chunkX].generateBlockAt(x, y, id);
	}

}
