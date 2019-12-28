public abstract class Move implements Instruction {
    private Area area;

    public Move(Area area) {
        this.area = area;
    }

    public boolean isCrossing(Point point) {
        return !area.contains(point);
    }

    /**
     * 执行移动指令,执行完后需要校验是否超出指定区域
     *
     * @param point
     * @return
     */
    public  Point execute(Point point) {
        switch (point.getDirection()) {
            case SOUTH:
                point.setY(point.getY() + 1);
                break;
            case NORTH:
                point.setY(point.getY() - 1);
                break;
            case EAST:
                point.setX(point.getX() + 1);
                break;
            case WEST:
                point.setX(point.getX() - 1);
            default:
        }

        // 是否超出区域
        if (isCrossing(point)) {
            throw new RuntimeException("Rover 超出探索区域" + point.toString());
        }

        return point;
    }

}
