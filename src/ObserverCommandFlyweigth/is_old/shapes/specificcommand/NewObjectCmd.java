package ObserverCommandFlyweigth.is_old.shapes.specificcommand;

import ObserverCommandFlyweigth.is_old.command.Command;
import ObserverCommandFlyweigth.is_old.shapes.model.GraphicObject;
import ObserverCommandFlyweigth.is_old.shapes.view.GraphicObjectPanel;

public class NewObjectCmd implements Command {

	private GraphicObjectPanel panel;
	private GraphicObject go;

	public NewObjectCmd(GraphicObjectPanel panel, GraphicObject go) {
		
		this.panel = panel;
		this.go = go;
		
	}

	@Override
	public boolean doIt() {
		double x = 10;
		double y =  10;
		go.moveTo(x, y);
		panel.add(go);

		return true;
	}

	@Override
	public boolean undoIt() {
		panel.remove(go);
		return true;
	}

}
