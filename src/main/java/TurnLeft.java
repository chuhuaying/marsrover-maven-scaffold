public class TurnLeft implements Instruction {

    public  Point execute(Point point) {
        switch (point.getDirection()) {
            case SOUTH:
                point.setDirection(Direction.EAST);
                break;
            case WEST:
                point.setDirection(Direction.SOUTH);
                break;
            case NORTH:
                point.setDirection(Direction.WEST);
                break;
            case EAST:
                point.setDirection(Direction.NORTH);
                break;
            default:
        }
        return point;
    }
}
