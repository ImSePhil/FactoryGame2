package FactoryGame;

public abstract class GameObject{

	protected float x;
	protected float y;
	protected int width;
	protected int height;

	protected GameObject(float x, float y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	protected int getWidth() {
		return width;
	}

	protected float getX() {
		return x;
	}
	
	protected float getY() {
		return y;
	};

	protected int getHeight() {
		return height;
	};

}
