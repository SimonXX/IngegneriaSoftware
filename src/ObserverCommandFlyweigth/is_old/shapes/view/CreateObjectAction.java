package ObserverCommandFlyweigth.is_old.shapes.view;

import ObserverCommandFlyweigth.is_old.shapes.model.AbstractGraphicObject;
import ObserverCommandFlyweigth.is_old.shapes.model.GraphicObject;
import ObserverCommandFlyweigth.is_old.command.CommandHandler;
import ObserverCommandFlyweigth.is_old.shapes.specificcommand.NewObjectCmd;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class CreateObjectAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5399493440620423134L;
	AbstractGraphicObject prototype;
	GraphicObjectPanel panel;
	CommandHandler ch;

	public CreateObjectAction(AbstractGraphicObject prototype,
			GraphicObjectPanel panel, CommandHandler ch) {
		super();
		this.prototype = prototype;
		this.panel = panel;
		this.ch = ch;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		GraphicObject go = prototype.clone();
		ch.handle(new NewObjectCmd(panel, go));

	}

}
