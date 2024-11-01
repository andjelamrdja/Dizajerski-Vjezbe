package mvc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingFrame extends JFrame {
	
	private DrawingView view = new DrawingView();
	//ovaj view postavljamo u centralni dio
	//gdje god naidjemo na panel, mijenjamo u view u projektu
	
	private DrawingController controller;
	
	public DrawingFrame() {
		view.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.mouseClicked(e);
			}
		});
		//JPanel panel = new JPanel();
		getContentPane().add(view, BorderLayout.CENTER);
	}

	public DrawingView getView() {
		return view;
	}

	public void setController(DrawingController controller) {
		this.controller = controller;
	}
	
	
	

}
