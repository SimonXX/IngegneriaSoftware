package designPatterns.Flyweight.Game;

public class ParticleFactory {
    private static final Particle bulletParticle = new BulletParticle();
    private static final Particle missileParticle = new MissileParticle();
    private static final Particle shardParticle = new ShardParticle();

    public static Particle getBulletParticle() {
        return bulletParticle;
    }

    public static Particle getMissileParticle() {
        return missileParticle;
    }

    public static Particle getShardParticle() {
        return shardParticle;
    }
}
