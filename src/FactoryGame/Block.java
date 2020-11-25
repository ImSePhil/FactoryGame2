package FactoryGame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Block extends GameObject {
	private BufferedImage image;
	private Material material;

	protected Block(float x, float y, int width, int height, Material material) {
		super(x, y, width, height);
		this.material = material;
		this.image = material.getSprite();
	}

	public void update() {

	}

	public void render(Graphics2D g) {
		g.setColor(Color.RED);
		g.drawImage(image, (int) x, (int) y, width, height, null);
	}

	@SuppressWarnings("unchecked")
	public JSONArray toJsonArray() {
		JSONArray array = new JSONArray();
		array.add("BLOCK");
		array.add(toJsonObject());
		return array;
	}

	@SuppressWarnings("unchecked")
	public JSONObject toJsonObject() {
		JSONObject block = new JSONObject();
		block.put("x", x);
		block.put("y", y);
		block.put("id", material.getId());
		block.put("height", height);
		block.put("width", width);
		return block;
	}

}
