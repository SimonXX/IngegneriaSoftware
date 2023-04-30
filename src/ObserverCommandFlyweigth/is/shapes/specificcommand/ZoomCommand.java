package ObserverCommandFlyweigth.is.shapes.specificcommand;

import ObserverCommandFlyweigth.is.command.Command;
import ObserverCommandFlyweigth.is.shapes.model.GraphicObject;

public class ZoomCommand implements Command {
	
	private GraphicObject object;
	private double factor;

	public ZoomCommand(GraphicObject obj, double factor) {
		object = obj;
		this.factor = factor;
		
	}

	@Override
	public boolean doIt() {
		object.scale(factor);
		return true;
	}

	@Override
	public boolean undoIt() {
		object.scale(1.0 / factor);
		return true;
	}

}
