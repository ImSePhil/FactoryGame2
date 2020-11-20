package FactoryGame;

import java.awt.Graphics2D;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Entity extends GameObject {
	
	protected float speed;
	
	protected Entity(float x, float y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update() {
		
	}

	@Override
	public void render(Graphics2D g) {
		
	}

	@Override
	public JSONArray toJsonArray() {
		return null;
	}

	@Override
	public JSONObject toJsonObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fromJson(Object jsonString, JSONParser parser) {
		// TODO Auto-generated method stub
		
	}

}
