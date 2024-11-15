package adapter;

import java.awt.Graphics;

import mvc.Shape;

public class HexagonAdapter extends Shape{

	private Hexagon hexagon;
	
	
	public HexagonAdapter(Hexagon hexagon) {
		super();
		this.hexagon = hexagon;
	}

	@Override
	public void draw(Graphics g) {
		hexagon.drawHexagon();
	}

	
}
