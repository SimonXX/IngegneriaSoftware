package ObserverCommandFlyweigth.is.shapes.view;

import ObserverCommandFlyweigth.is.shapes.model.GraphicObject;

import java.awt.Graphics2D;

public interface GraphicObjectView {
	void drawGraphicObject(GraphicObject go, Graphics2D g);
}
