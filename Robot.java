public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

public class Robot {

    public static  int X = 0;
    public static  int Y = 0;
    public static  Direction Dir = Direction.UP;

    public Direction getDirection() {
        return this.Dir;
    }

    public int getX() {
        return this.Y;
    }

    public int getY() {
        return this.X;
    }

    public void turnLeft() {
        switch(this.Dir) {
           case Direction.UP : this.Dir = Direction.LEFT; break;
           case Direction.DOWN : this.Dir = Direction.RIGHT; break;
           case Direction.LEFT : this.Dir = Direction.DOWN; break;
           case Direction.RIGHT : this.Dir = Direction.UP; break;
       }
    }

    public void turnRight() {
         switch(this.Dir) {
           case Direction.UP : this.Dir = Direction.RIGHT; break;
           case Direction.DOWN : this.Dir = Direction.LEFT; break;
           case Direction.LEFT : this.Dir = Direction.UP; break;
           case Direction.RIGHT : this.Dir = Direction.DOWN; break;
       }
    }

    public void stepForward() {
       switch(this.Dir) {
           case Direction.UP : X +=1; break;
           case Direction.DOWN : X -=1; break;
           case Direction.LEFT : Y -=1; break;
           case Direction.RIGHT : Y +=1; break;
       }
    }
}


//robot.turnRight();
//robot.stepForward();
//robot.stepForward();
//robot.stepForward();

// X смотрит слева направо
// Y смотрит снизу вверх