package robot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RobotGUI implements ActionListener {
    JFrame frame;
    JPanel panel;
    RobotComponent component;

    public void go() {
        frame = new JFrame();
        JButton button1 = new JButton("LEFT");
        JButton button2 = new JButton("RIGHT");
        JButton button3 = new JButton("TOP");
        JButton button4 = new JButton("BOTTOM");

        component = new RobotComponent();

        panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(component);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Robot");
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("LEFT")) {
            component.move(Command.LEFT);
        } else if (action.equals("RIGHT")) {
            component.move(Command.RIGHT);
        } else if (action.equals("TOP")) {
            component.move(Command.TOP);
        } else {
            component.move(Command.BOTTOM);
        }
    }
}



