package designPatterns.Flyweight.Game;
import java.awt.Color;
import java.awt.Graphics;
// Classe flyweight
public class Particle {
    private final Color color;
    private final String sprite;

    public Particle(Color color, String sprite) {
        this.color = color;
        this.sprite = sprite;
    }

    public void draw(Graphics g, int x, int y) {
        // Disegna la particella utilizzando il colore e lo sprite
        // memorizzati nello stato intrinseco
    }
}
