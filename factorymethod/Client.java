package factorymethod;


import factorymethod.manager.DynamicSchedulingElevatorManager;
import factorymethod.manager.ElevatorManager;
import factorymethod.manager.ResponseTimeSchedulingElevatorManager;
import factorymethod.manager.ThroughputSchedulingElevatorManager;

public class Client {
    public static void main(String[] args) {
        ElevatorManager emWithResponseTimeScheduler = new ResponseTimeSchedulingElevatorManager(2);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThroughputScheduler = new ThroughputSchedulingElevatorManager(2);
        emWithThroughputScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamicScheduler = new DynamicSchedulingElevatorManager(2);
        emWithDynamicScheduler.requestElevator(10, Direction.UP);
    }
}
