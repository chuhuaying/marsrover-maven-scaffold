public class TurnLeft implements Instruction {

    public  Point execute(Point point) {
        switch (point.getDirection()) {
            case SOUTH:
                point.setDirection(Direction.WEST);
                break;
            case WEST:
                point.setDirection(Direction.NORTH);
                break;
            case NORTH:
                point.setDirection(Direction.EAST);
                break;
            case EAST:
                point.setDirection(Direction.SOUTH);
                break;
            default:
        }
        return point;
    }
}
