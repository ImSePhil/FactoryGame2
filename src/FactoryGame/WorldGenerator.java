package FactoryGame;

public class WorldGenerator {

	private int[] terrain;
	private int blocksX;
	private int blocksY;
	private World world;
	private int chunksize = Game.chunksize;

	public void generate(int blocksX, int blocksY, String filename) {
		world = new World(blocksX / chunksize, blocksY / chunksize);
		for (int y = 0; y < blocksY; y++) {
			for (int x = 0; x < blocksX; x++) {
				Noise n = new Noise();
				double value = Noise.noise(x*.1, y*.1);
				value = Math.abs(value);
				int intval = (int) (value*10);
				System.out.print(intval + " ");
				world.generateBlockAt(x,y,intval);				
			}
			System.out.println();
		}
	}

	public World getWorld() {
		return world;
	}
}
