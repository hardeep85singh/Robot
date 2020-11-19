package robot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RobotImpl implements Robot {
    private List<Command> commands = new ArrayList<>();
    private Location current;
    private int length = 10;

    public RobotImpl() {
        current = new Location(0.0, 0.0);
    }

    public List<Command> initializeList() {
        for (int i = 0; i < length; i++) {
            commands.add(Command.getRandomCommand());
        }
        return commands;
    }

    @Override
    public Location getCurrentLocation() {
        return current;
    }

    @Override
    public void move(List<Command> commands) {
        int i = 0;
        while (i != commands.size()) {
            move(commands.get(i));
            i++;
        }
    }

    @Override
    public void move(Command command) {
        if (command == Command.LEFT) {
            current = new Location(current.getX() - 1, current.getY());
        } else if (command == Command.RIGHT) {
            current = new Location(current.getX() + 1, current.getY());
        } else if (command == Command.TOP) {
            current = new Location(current.getX(), current.getY() + 1);
        } else {
            current = new Location(current.getX(), current.getY() - 1);
        }

    }

}
