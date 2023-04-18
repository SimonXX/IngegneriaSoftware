package designPatterns.Proxy;

public class Image implements Graphic{

    private String filename;

    public Image(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying image " + filename);
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image " + filename + " from disk");
    }
}
