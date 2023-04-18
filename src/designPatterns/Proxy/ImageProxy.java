package designPatterns.Proxy;

public class ImageProxy implements Graphic{

    private Image image;
    private String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new Image(filename);
        }
        image.display();
    }
}
