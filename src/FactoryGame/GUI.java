package FactoryGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.MouseWheelEvent;

public class GUI {
	private int width, height;
	private int selected = 0;

	public GUI(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void render(Graphics2D g) {
		// Zeit und Datum
		String time = "12:30 19 Dec. 1985";
		g.setFont(new Font(g.getFont().getFontName(), Font.PLAIN, 30)); 
		
		int timeWidth = g.getFontMetrics().stringWidth(time);
		int timeHeight = g.getFont().getSize();
		g.setColor(Game.darkGrey);
		g.fillRect(width/2-timeWidth/2-4,0 , timeWidth+8, timeHeight+8);
		g.setColor(Game.lightGrey);
		g.drawRect(width/2-timeWidth/2-3, 1, timeWidth+5, timeHeight+5);
		g.setColor(Color.black);
		g.drawString(time, width/2-timeWidth/2, timeHeight);
	}

	public void update() {
		width = Game.currentWindowWidth;
		height = Game.currentWindowHeight;
	}

	public void mouseWheelMoved(MouseWheelEvent e) {
		double dir = e.getPreciseWheelRotation();
		selected += dir;
		if (selected == -1) {
			selected = 9;
		}
		if (selected == 10) {
			selected = 0;
		}
	}

}
