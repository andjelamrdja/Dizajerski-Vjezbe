package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		DrawingModel model = new DrawingModel(); //kod kuce ne radimo ovo jer nam ne trebaju test klase, sve radimo u okviru mvc strukture
		Point p1 = new Point(10, 10, Color.BLACK);
		
		System.out.println("1. Duzina liste: " + model.getShapes().size());
		
		//testiranje dodavanja
		//model.add(p1) vise ne postoji kod nas ---> radimo preko cmd jer nam treba za redo i undo
		AddPointCommand addPointCmd = new AddPointCommand(model, p1); //ovdje kad radimo za add i remoce moramo raditi castovanje za svaki oblik (Point), (Line)...
		addPointCmd.execute();
		System.out.println("2. Duzina liste: " + model.getShapes().size());
		
		addPointCmd.unexecute();
		System.out.println("3. Duzina liste: " + model.getShapes().size());
		
		addPointCmd.execute();
		System.out.println("4. Duzina liste: " + model.getShapes().size());
		
		//testiranje brisanja
		Command removePointCmd = new RemovePointCmd(model, p1); //mozemo i ovako da kreiramo objekat tipa Command - svejedno je
		
		removePointCmd.execute();
		System.out.println("5. Duzina liste: " + model.getShapes().size());
		
		removePointCmd.unexecute();
		System.out.println("6. Duzina liste: " + model.getShapes().size());
		
		//testiranje modifikacije
		Point p2 = new Point(20,20,Color.black);
		
		UpdatePointCmd updatePointCmd = new UpdatePointCmd(p1, p2);
		
		updatePointCmd.execute();
		System.out.println(model.getShapes());
		
		updatePointCmd.unexecute();
		System.out.println(model.getShapes());
		
		
		
		
	}

}
