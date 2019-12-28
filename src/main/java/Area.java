public class Area {
    public Area(Point a, Point b, Point c, Point d) {
        aA = a;
        bB = b;
        cC = c;
        dD = d;
    }

    private Point aA;

    private Point bB;

    private Point cC;

    private Point dD;

    public boolean contains(Point point) {
        boolean x = bB.getX() <= point.getX() && point.getX() <= aA.getX();
        boolean y = dD.getY() <= point.getY() && point.getY() <= aA.getY();

        if (x && y) {
            return true;
        } else {
            return false;
        }

    }
}
