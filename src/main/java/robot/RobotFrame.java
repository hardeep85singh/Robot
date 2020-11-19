//package robot;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.List;
//
//public class RobotFrame extends JFrame implements Robot{
//    private static final int FRAME_WIDTH = 300;
//    private static final int FRAME_HEIGHT = 400;
//
//    private RobotComponent robot;
//
//    public RobotFrame(){
//        robot = new RobotComponent();
//        add(robot);
//
//        setSize(FRAME_WIDTH, FRAME_HEIGHT);
//
//        ActionListener listener = new ButtonListener();
//    }
//
//    @Override
//    public Location getCurrentLocation() {
//        return null;
//    }
//
//    @Override
//    public void move(List<Command> commands) {
//
//    }
//
//    @Override
//    public void move(Command command) {
//
//    }
//
//    class ButtonListener implements ActionListener{
//        RobotImpl robot = new RobotImpl();
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }
//}
