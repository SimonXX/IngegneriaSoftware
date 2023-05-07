package designPatterns.Flyweight.Game;
import java.awt.Graphics;

public class Game {
    private final MovingParticle[] mps;
    private final Particle[] particles;

    public Game(int numParticles) {
        particles = new Particle[numParticles];
        mps = new MovingParticle[numParticles];
        for (int i = 0; i < numParticles; i++) {
            particles[i] = ParticleFactory.getBulletParticle(); // stato intrinseco condiviso
            mps[i] = new MovingParticle(particles[i], i*10, i*10, 1, 1); // stato estrinseco unico
            //associamo ad ogni oggetto in particles un oggetto in movimento (il riferimento in particles di un oggetto missile farà riferimento allo stesso oggetto in memoria, ma in
            //MovingParticle avremo stato estrinseco
        }
    }

    public void update() {
        for (MovingParticle mp : mps) {
            mp.move();
        }
    }

    public void draw(Graphics g) {
        for (MovingParticle mp : mps) {
            mp.draw(g);
        }
    }
}
