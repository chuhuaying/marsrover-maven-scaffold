import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void should_contain_on_area(){
        Point A = new Point(10, 10, Direction.SOUTH);
        Point B = new Point(-10, 10, Direction.SOUTH);
        Point C = new Point(-10, -10, Direction.SOUTH);
        Point D = new Point(10, -10, Direction.SOUTH);
        Area area = new Area(A, B, C, D);

        Assert.assertTrue(area.contains(new Point(2, 2, Direction.SOUTH)));
        Assert.assertTrue(area.contains(new Point(-12, 2, Direction.NORTH)));
    }
}
