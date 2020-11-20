package FactoryGame;

import java.awt.Graphics2D;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Chunk implements Updatable, Renderable{

	private Block[][] blocks;
	private int blocksX;
	private int blocksY;

	public Chunk(int chunksize) {
		this.blocks = new Block[chunksize][chunksize];
		this.blocksX = chunksize;
		this.blocksY = chunksize;
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

	@SuppressWarnings("unchecked")
	public JSONArray toJsonArray() {
		JSONArray array = new JSONArray();
		array.add("CHUNK");
		JSONArray array2 = new JSONArray();
		for (Block[] _blocks : blocks) {
			for (Block block : _blocks) {
				array2.add(block.toJsonArray());
			}
		}
		array.add(array2);
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

	public void fromJson(Object jsonString, JSONParser parser) {
		JSONArray jsonArray = null;
		System.out.println(jsonString);
		try {
			jsonArray = (JSONArray) parser.parse(String.valueOf(jsonString));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(420);
		}
		JSONArray chunkData = (JSONArray) jsonArray.get(1);
		
		for (int y = 0; y < blocksY; y++) {
			for (int x = 0; x < blocksX; x++) {
				String data = (String) ((JSONArray)chunkData.get(y)).get(x);
				blocks[y][x] = Block.fromJson(data,parser);
			}
		}
	}
}
