package designPatterns.Flyweight.Game;

import java.awt.Color;

public class BulletParticle extends Particle {
    public BulletParticle() {
        super(Color.RED, "bullet.png");
    }
}