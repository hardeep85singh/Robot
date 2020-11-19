package robot;

import java.util.List;

public interface Robot {

    Location getCurrentLocation(); // changed name of method as same name method clashes with java.awt.component class getLocation()

    void move(List<Command> commands);

    void move(Command command);
}
