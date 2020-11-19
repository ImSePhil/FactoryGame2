package FactoryGame;

import java.awt.Graphics2D;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
	public void fromJson() {
		
	}

	@Override
	public JSONArray toJson() {
		return null;
	}

	

	
}
