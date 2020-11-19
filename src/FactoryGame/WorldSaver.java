package FactoryGame;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorldSaver {

	private String filename;
	private World world;

	public WorldSaver(World world, String filename) {
		this.world = world;
		this.filename = filename;
	}

	public void save() throws IOException {
		File f = new File(filename);
		FileWriter writer = new FileWriter(f);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		bufferedWriter.write(world.toJsonArray().toJSONString());
		bufferedWriter.close();
	}

}
