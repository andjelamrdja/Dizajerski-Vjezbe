package command;

import mvc.DrawingModel;
import mvc.Point;

public class AddPointCommand implements Command {
	
	//mi ovu klasu pravimo na nivou Shape-a
	//tako i za remove
	//znaci AddShapeCmd i RemoveShapeCmd

	private DrawingModel model;
	private Point point;
	
	public AddPointCommand(DrawingModel model, Point point) {
		super();
		this.model = model;
		this.point = point;
	}

	@Override
	public void execute() {
		model.add(point);
	}

	@Override
	public void unexecute() {
		model.remove(point);
	}

}
