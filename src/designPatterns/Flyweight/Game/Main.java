package designPatterns.Flyweight.Game;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numParticles = 100;

        Game game = new Game(numParticles);

        JFrame frame = new JFrame();
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                game.draw(g);
            }
        };
        panel.setPreferredSize(new Dimension(800, 600));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        for (int i = 0; i < 1000; i++) {
            game.update();
            panel.repaint();
            Thread.sleep(10);
        }
    }
}
