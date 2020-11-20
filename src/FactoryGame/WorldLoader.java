package FactoryGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import FactoryGame.WorldUtils;

public class WorldLoader {

	private final int TAG = 0;
	private final int WIDTH = 1;
	private final int HEIGHT = 2;
	private final int DATA = 3;
	private String path;
	private World world;
	private int chunksize = Game.chunksize;
	private int blocksX;
	private int blocksY;
	private int chunksX;
	private int chunksY;
	private int blocksize = Game.blocksize;

	public WorldLoader(String path) {
		this.path = path;
	}

	public World getWorld() {
		return world;
	}

	public void load() throws Exception {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(new File(path)));
		JSONArray array = (JSONArray) obj;
		String key = (String) array.get(0);
		switch (key) {
		case "WORLD":
			int chunksX = Integer.parseInt(String.valueOf(array.get(WIDTH)));
			int chunksY = Integer.parseInt(String.valueOf(array.get(HEIGHT)));
			world = new World(chunksX,chunksY);
			world.fromJson(array.get(DATA),parser);
			break;
		}
	}

}
