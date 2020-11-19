package robot;

import java.util.Random;

public enum Command {

    LEFT, RIGHT, TOP, BOTTOM;

    public static Command getRandomCommand(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}

