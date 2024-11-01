package mvc;

import java.util.ArrayList;

public class DrawingModel {
	//model - skup podataka od znacaja za nasu aplikaciju
	//treba imati listu ili stek za skup oblika gdje cemo ih cuvati
	
	private ArrayList<Point> shapes = new ArrayList<Point>();
	//nasa lista ce biti zasnovana na Shapes - jer imamo apstraktnu klasu
	
	//ako imamo i listu sellectedShapes onda je isto mozemo staviti ovdje
	
	public void add(Point p) {
		shapes.add(p);
	}
	
	public void remove(Point p) {
		shapes.remove(p);
	}
	
	//pravimo jos dvije metode za preuzimanje oblika
	
	public Point get(int index) {
		return shapes.get(index);
	}
	
	public ArrayList<Point> getShapes(){
		return shapes;
	}
}
