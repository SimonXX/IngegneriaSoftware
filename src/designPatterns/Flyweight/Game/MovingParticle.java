package designPatterns.Flyweight.Game;

import java.awt.Graphics;

public class MovingParticle {
    private final Particle particle;
    private int x, y;
    private int vx, vy;

    public MovingParticle(Particle particle, int x, int y, int vx, int vy) {
        this.particle = particle;
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    public void move() {
        // Aggiorna le coordinate in base alla velocità
        x += vx;
        y += vy;
    }

    public void draw(Graphics g) {
        // Disegna la particella utilizzando lo stato intrinseco
        // memorizzato nell'oggetto flyweight e lo stato estrinseco
        // memorizzato nella classe MovingParticle
        particle.draw(g, x, y);
    }
}
