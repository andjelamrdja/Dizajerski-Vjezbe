package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Line;


public class AddLineCmd implements Command {

	private DrawingModel model;
	private Line line;
	
	public AddLineCmd(DrawingModel model, Line line) {
		super();
		this.model = model;
		this.line = line;
	}

	@Override
	public void execute() {
		model.add(line);

	}

	@Override
	public void unexecute() {
		model.remove(line);

	}

}
