package ObserverCommandFlyweigth.is_old.shapes.view;

import ObserverCommandFlyweigth.is_old.shapes.model.GraphicObject;

import java.awt.Graphics2D;

public interface GraphicObjectView {
	void drawGraphicObject(GraphicObject go, Graphics2D g);
}
