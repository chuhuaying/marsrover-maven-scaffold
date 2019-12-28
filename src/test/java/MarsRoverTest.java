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
        Assert.assertFalse(area.contains(new Point(-12, 2, Direction.NORTH)));
    }

    @Test
    public void test_get_rover_point() {
        Rover rover = new Rover();
        Point point = new Point(0, 0, Direction.SOUTH);
        rover.deploy(point);
        Assert.assertEquals(rover.getPoint(), point);
    }

    @Test
    public void test_Rover_TurnLeft_S() {
        Instruction instruction = new TurnLeft();
        Rover rover = new Rover();
        rover.deploy(new Point(0, 0, Direction.SOUTH));
        Assert.assertEquals(rover.run(instruction).getDirection(), Direction.WEST);
    }

    @Test
    public void test_Rover_TurnRight_S() {
        Instruction instruction = new TurnRight();
        Rover rover = new Rover();
        rover.deploy(new Point(0, 0, Direction.SOUTH));
        Assert.assertEquals(rover.run(instruction).getDirection(), Direction.EAST);
    }

}
