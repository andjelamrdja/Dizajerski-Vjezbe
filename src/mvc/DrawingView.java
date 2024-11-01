package mvc;

import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JPanel;

public class DrawingView extends JPanel {
	//DrawingView je panel naseg projekta
	//izuzetak od mvc strukture zbog iteratora i potencijalnog pucanja progama zbog prevelikog  broja objekata istvremeno
	private DrawingModel model = new DrawingModel(); // samo privremeno kreiranje objekta

	public void setModel(DrawingModel model) {
		this.model = model;
	}
	
	//nju zavrsavamo u potpunosti i mozemo je samo primijeniti na nas projekat
	//trebamo imati neku petlju koja prolazi kroz listu i svaki oblik iscrtava
	
	public void paint(Graphics g) {
		Iterator<Point> it = model.getShapes().iterator();
		while(it.hasNext())
			it.next().draw(g);
	}
	
	//u ovoj klasi vise nista ne treba pisati
	//njen zadatak je da prolazi kroz model i iscrtava svaki oblik koji se tamo nalazi
}
