package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import composite.SremBanatBacka;


public class DrawingController {
	
	//vodimor acuna da ne pravimo nove objekte jer ih vec imamo u Application klasi
	private DrawingModel model;
	private DrawingFrame frame;
	
	//imamo i model i frame pa je bolje kontstruktor nego getteri i setteri
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}

	public void mouseClicked(MouseEvent e) {
	/*	Point p = new Point(e.getX(), e.getY(), Color.blue);
		model.add(p); //moramo dodati u listu da bi se iscrtalo
		frame.repaint(); //kroz konotrler se najbrze izvrsava
	*/
		
		//testiranje composite obrasca
		SremBanatBacka vojvodina = new SremBanatBacka();
		int x = e.getX();
		int y = e.getY();
		Point srem = new Point(x, y, Color.BLUE);
		Point banat = new Point(x+10,y, Color.BLUE);
		Point backa = new Point(x+5, y-8, Color.BLUE);
		
		vojvodina.add(srem);
		vojvodina.add(banat);
		vojvodina.add(backa);
		
		//objekar ove klase predstavlja kompoziciju
		//vojvodina - kompozicija tri tacke
		
		model.add(vojvodina);
		frame.repaint();
		
	}
	
	
	
}
