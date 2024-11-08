package command;

import mvc.DrawingModel;
import mvc.Line;

public class RemoveLineCmd implements Command {

	private DrawingModel model;
	private Line line;
	
	public RemoveLineCmd(DrawingModel model, Line line) {
		super();
		this.model = model;
		this.line = line;
	}
	
	@Override
	public void execute() {
		model.remove(line);

	}

	@Override
	public void unexecute() {
		model.add(line);
	}

}
