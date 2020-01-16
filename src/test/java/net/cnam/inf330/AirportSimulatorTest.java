package net.cnam.inf330;

import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import static org.junit.Assert.*;

/**
 * Class for testing Airport Simulator application.
 */
public class AirportSimulatorTest {

    // TODO 2. Write a method for testing the PriorityQueue
    public void compareTest(){
        Plane a = new NormalPlane(0, "a", false, 0);
        Plane b = new NormalPlane(0, "b", false, 1);
        Plane result = compare(a, b);
        assert(a, result);

    }

    /* TODO 5. Complete this method for testing the InvalidFuelCapacityException in the
        AirportSimulator::createPlane method
     */
    @Test
    public void testInvalidFuelCapacityException() {
        AirportSimulator simulator = new AirportSimulator();
        ThrowingRunnable tr = () -> simulator.simulateTurnWithNewPlanes(3, 3, new int[]{1, 1, -1});

        //assertThrows(...);
        assertThrows(fuelCapacityException.class, tr);

        try {
            simulator.createPlane(-1, false);
        }catch (fuelCapacityException e){
            assert(fuelCapacityException.class, e);
        }


    };


    }

    @Test
    public void testScenario1() throws fuelCapacityException {
        // Simulate scenario 1
        AirportSimulator simulator = new AirportSimulator();
        simulator.simulateTurnWithNewPlanes(3, 3, new int[]{1, 1, 1});
        simulator.simulateTurnWithNewPlanes(3, 3, new int[]{2, 2, 2});
        simulator.simulateTurnWithNewPlanes(0, 0, new int[]{0, 0, 0});
        simulator.simulateTurnWithNewPlanes(2, 3, new int[]{7, 5, 9});
        simulator.simulateTurnWithNewPlanes(2, 3, new int[]{6, 7, 5});
        simulator.simulateTurnWithNewPlanes(2, 3, new int[]{2, 9, 4});
        simulator.simulateTurnWithNewPlanes(3, 3, new int[]{1, 5, 0});
        simulator.simulateTurnWithNewPlanes(2, 3, new int[]{6, 2, 0});
        simulator.simulateTurnWithNewPlanes(1, 3, new int[]{0, 0, 0});

        // TODO 7. Test that scenario 1 does not cause any plane crashes
        // assert...
    }
}
