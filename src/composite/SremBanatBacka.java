package composite;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import mvc.Shape;
//kompozicija -podlista oblika
//sluzi za kombinovanje oblika, da od vise mozemo napraviti jedan
//OVAJ OBRAZAC NE KORISTIMO U NASIM PROJEKTIMA
public class SremBanatBacka extends Shape{
	
		private ArrayList<Shape> sremBanatBacka = new ArrayList<Shape>();
		
		public void add(Shape s) {
			sremBanatBacka.add(s);
		}
		
		public void remove(Shape s) {
			sremBanatBacka.remove(s);
		}

	@Override
	public void draw(Graphics g) {
		Iterator<Shape> it = sremBanatBacka.iterator();
		while(it.hasNext()) {
			it.next().draw(g);
		}
		
	}
	
}
