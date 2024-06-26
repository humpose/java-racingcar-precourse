import java.util.*;

class Car {
    private static final int MOVE_NUM = 4;
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() { return name; }

    public int getPosition() {
        return position;
    }

    public void move() {
        if (canMove()) {
            position++;
        }
    }

    private boolean canMove() {
        return new Random().nextInt(10) >= MOVE_NUM;
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(position);
    }
}