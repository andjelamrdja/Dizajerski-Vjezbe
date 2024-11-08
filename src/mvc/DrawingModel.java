package mvc;

import java.util.ArrayList;

public class DrawingModel {
	//model - skup podataka od znacaja za nasu aplikaciju
	//treba imati listu ili stek za skup oblika gdje cemo ih cuvati
	
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	//nasa lista ce biti zasnovana na Shapes - jer imamo apstraktnu klasu
	
	//ako imamo i listu sellectedShapes onda je isto mozemo staviti ovdje
	
	public void add(Shape shape) {
		shapes.add(shape);
	}
	
	public void remove(Shape shape) {
		shapes.remove(shape);
	}
	
	//pravimo jos dvije metode za preuzimanje oblika
	
	public Shape get(int index) {
		return shapes.get(index);
	}
	
	public ArrayList<Shape> getShapes(){
		return shapes;
	}
	
	//njega sto se tice i ovo smo zavrsili
}
