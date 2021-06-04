package command;

import java.util.LinkedList;
import java.util.Queue;

class Agent {
    private Queue<Order> queue = new LinkedList<>();

    void placeOrder(Order order) {
        queue.offer(order);
        order.execute();
    }
}