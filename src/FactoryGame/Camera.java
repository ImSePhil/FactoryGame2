package FactoryGame;

public class Camera {
	private Player player;

	public Camera(Player player) {
		this.player = player;
	}

	public int getX() {
		return (int) (player.getX() + player.getWidth() / 2 - GameManager.width / 2);
	}

	public int getY() {
		return (int) (player.getY() + player.getHeight() / 2 - GameManager.height / 2);

	}
}