import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static junit.framework.Assert.assertEquals;

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
        rover.deploy(new Point(0, 0, Direction.NORTH));
        Assert.assertEquals(rover.run(instruction).getDirection(), Direction.WEST);
    }

    @Test
    public void test_Rover_TurnRight_S() {
        Instruction instruction = new TurnRight();
        Rover rover = new Rover();
        rover.deploy(new Point(0, 0, Direction.NORTH));
        Assert.assertEquals(rover.run(instruction).getDirection(), Direction.EAST);
    }

    @Test
    public void test_batch_MoveForward_S() {
        Rover rover = new Rover();
        rover.deploy(new Point(0, 0, Direction.NORTH));

        Point A = new Point(10, 10, Direction.SOUTH);
        Point B = new Point(-10, 10, Direction.SOUTH);
        Point C = new Point(-10, -10, Direction.SOUTH);
        Point D = new Point(10, -10, Direction.SOUTH);
        Area area = new Area(A, B, C, D);

        LinkedList<Instruction> instructions = new LinkedList<Instruction>();
        Instruction ins1 = new MoveForward(area);
        Instruction ins2 = new TurnRight();
        instructions.add(ins1);
        instructions.add(ins2);

        Point point = rover.run(instructions);
        Assert.assertEquals(point.getDirection(), Direction.EAST);
        Assert.assertEquals(point.getX(), Integer.valueOf(0));
        Assert.assertEquals(point.getY(), Integer.valueOf(1));
    }
}
