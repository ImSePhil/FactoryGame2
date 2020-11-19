package FactoryGame;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Block extends GameObject {
	private BufferedImage image;
	private Material material;

	protected Block(float x, float y, int width, int height, Material material) {
		super(x, y, width, height);
		this.material = material;
	}

	@Override
	public void update() {

	}

	@Override
	public void render(Graphics2D g) {

	}

	@Override
	public void fromJson() {

	}

	@Override
	public JSONArray toJsonArray() {
		return null;
	}

	@Override
	public JSONObject toJsonObject() {
		JSONObject block = new JSONObject();
		block.put("x", x);
		block.put("y", y);
		block.put("id", material.getId());
		block.put("height", height);
		block.put("width", width);
		System.out.println(block);
		return block;
	}

}
