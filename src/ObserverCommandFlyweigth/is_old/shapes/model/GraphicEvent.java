package ObserverCommandFlyweigth.is_old.shapes.model;


public class GraphicEvent {
	
	/**
	 * @directed true
	 */
	
	private GraphicObject source;
	public GraphicEvent(GraphicObject src){
		source=src;
	}
	public GraphicObject getSource() {
		return source;
	}
}
