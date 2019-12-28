public class Point {
    private Integer x;
    private Integer y;
    private Direction direction;

    public Point(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Integer getX() {
        return this.x;
    }
    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return this.y;
    }
    public void setY(Integer y) {
        this.y = y;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
