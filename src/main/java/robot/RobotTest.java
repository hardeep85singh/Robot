package robot;

import java.util.ArrayList;
import java.util.List;

public class RobotTest {

    public static void main(String[] args) {
        RobotImpl robot = new RobotImpl();//component or frame create, pass robot to constructor

        robot.move(robot.initializeList());
        System.out.println(robot.getCurrentLocation());
    }

    //    static List<Command> commands = new ArrayList<>();
//
//    public static List<Command> initializeList() {
//        for (int i = 0; i < 6; i++) {
//            commands.add(Command.randomCommand());
//        }
//        return commands;
//    }

}
