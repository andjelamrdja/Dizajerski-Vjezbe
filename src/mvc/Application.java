package mvc;

import java.awt.Color;

import javax.swing.JFrame;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hej haj hoj");
		
		//ovo uvezivanje radimo isto na svojim projektima
		DrawingModel model = new DrawingModel();
		DrawingFrame frame = new DrawingFrame();
		frame.getView().setModel(model);
		DrawingController controller = new DrawingController(model,frame);
		frame.setController(controller);
		//
		
		//na objektnom smo ovo radili u javaswing
		//sve od tamo mozemo prebaciti u application ovdje
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 
		frame.setBackground(Color.PINK);
	
	
	}
	
	//ovdje dodati buttone, layoute, text polja
	
	
	
}
