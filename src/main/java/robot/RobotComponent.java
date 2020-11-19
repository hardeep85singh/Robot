package robot;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.List;

public class RobotComponent extends JComponent {
    private Robot robot;
    private final int DIA = 10;

    public RobotComponent() {
        robot = new RobotImpl();
    }

    public void paintComponent(Graphics g) {

        Ellipse2D.Double dot = new Ellipse2D.Double(robot.getCurrentLocation().getX(),
                robot.getCurrentLocation().getY(), DIA, DIA);
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(dot);

    }

    public void move(Command command) {
        robot.move(command);
        repaint();
    }

}
