package ObserverCommandFlyweigth.is_old;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

import ObserverCommandFlyweigth.is_old.command.HistoryCommandHandler;
import ObserverCommandFlyweigth.is_old.shapes.controller.GraphicObjectController;
import ObserverCommandFlyweigth.is_old.shapes.model.CircleObject;
import ObserverCommandFlyweigth.is_old.shapes.model.GraphicObject;
import ObserverCommandFlyweigth.is_old.shapes.model.ImageObject;
import ObserverCommandFlyweigth.is_old.shapes.model.RectangleObject;
import ObserverCommandFlyweigth.is_old.shapes.view.CircleObjectView;
import ObserverCommandFlyweigth.is_old.shapes.view.GraphicObjectLogger;
import ObserverCommandFlyweigth.is_old.shapes.view.GraphicObjectPanel;
import ObserverCommandFlyweigth.is_old.shapes.view.ImageObjectView;
import ObserverCommandFlyweigth.is_old.shapes.view.RectangleObjectView;

public class TestGraphics {

	public static void main(String[] args) {

		JFrame f = new JFrame();

		JToolBar toolbar = new JToolBar();
		JButton undoButt = new JButton("Undo");
		JButton redoButt = new JButton("Redo");

		final HistoryCommandHandler handler = new HistoryCommandHandler();

		undoButt.addActionListener(evt -> handler.handle(HistoryCommandHandler.NonExecutableCommands.UNDO));

		redoButt.addActionListener(evt -> handler.handle(HistoryCommandHandler.NonExecutableCommands.REDO));
		toolbar.add(undoButt);
		toolbar.add(redoButt);

		GraphicObjectLogger logger = new GraphicObjectLogger();

		GraphicObjectPanel gpanel = new GraphicObjectPanel();

		gpanel.setPreferredSize(new Dimension(400, 400));
		gpanel.installView(RectangleObject.class, new RectangleObjectView());
		gpanel.installView(CircleObject.class, new CircleObjectView());
		gpanel.installView(ImageObject.class, new ImageObjectView());

		GraphicObject go = new RectangleObject(new Point(80, 80), 20, 50);
		gpanel.add(go);
		go.addGraphicObjectListener(logger);
		GraphicObjectController goc1 = new GraphicObjectController(go, handler);

		go = new CircleObject(new Point(100, 100), 10);
		gpanel.add(go);
		go.addGraphicObjectListener(logger);
		GraphicObjectController goc2 = new GraphicObjectController(go, handler);

		go = new ImageObject(new ImageIcon(TestGraphics.class.getResource("shapes/model/NyaNya.gif")),
				new Point(40, 87));
		gpanel.add(go);
		go.addGraphicObjectListener(logger);
		GraphicObjectController goc3 = new GraphicObjectController(go, handler);

		f.add(toolbar, BorderLayout.NORTH);
		f.add(gpanel, BorderLayout.CENTER);

		JPanel controlPanel = new JPanel(new FlowLayout());
		controlPanel.add(goc1);
		controlPanel.add(goc2);
		controlPanel.add(goc3);

		f.getContentPane().add(new JScrollPane(controlPanel), BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);

	}
}