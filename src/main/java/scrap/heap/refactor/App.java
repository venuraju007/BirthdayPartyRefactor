/**
 * Refactor Exercise
 * Feb 26, 2020
 */

package scrap.heap.refactor;

import scrap.heap.refactor.constants.*;
import scrap.heap.refactor.domain.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Main Application class for placing Birthday Orders.
 * All Order, Balloon, and Cake objects are built using builder pattern.
 * An Order is composed of Ballon and Cake objects.
 * Enum constants are used for majority of Balloon and Cake attributes.
 */

public class App {

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // Place birthday party orders
        // 1. Builder Orders
        // 2. Place Orders

        App app = new App();
        List<Order> orders = app.buildOrders();
        app.placeOrders(orders);
    }

    /**
     * Build and return a list of orders
     */
    private List<Order> buildOrders() {

        List<Order> orders = new ArrayList<>();

        Order order1 = new OrderBuilder()
                .withBalloon(new BalloonBuilder()
                        .withColor(Color.RED)
                        .withMaterial(Material.MYLAR)
                        .withCount(4)
                        .build())
                .withCake(new CakeBuilder()
                        .withFlavor(Flavor.CHOCOLATE)
                        .withFrostingFlavor(FrostingFlavor.CHOCOLATE)
                        .withShape(Shape.CIRCLE)
                        .withSize(Size.LARGE)
                        .withColor(Color.BROWN)
                        .build())
                .build();

        Order order2 = new OrderBuilder()
                .withBalloon(new BalloonBuilder()
                        .withColor(Color.BLUE)
                        .withMaterial(Material.LATEX)
                        .withCount(7)
                        .build())
                .withCake(new CakeBuilder()
                        .withFlavor(Flavor.VANILLA)
                        .withFrostingFlavor(FrostingFlavor.CHOCOLATE)
                        .withShape(Shape.SQUARE)
                        .withSize(Size.MEDIUM)
                        .withColor(Color.BROWN)
                        .build())
                .build();

        Order order3 = new OrderBuilder()
                .withBalloon(new BalloonBuilder()
                        .withColor(Color.YELLOW)
                        .withMaterial(Material.MYLAR)
                        .withCount(4)
                        .build())
                .withCake(new CakeBuilder()
                        .withFlavor(Flavor.VANILLA)
                        .withFrostingFlavor(FrostingFlavor.VANILLA)
                        .withShape(Shape.SQUARE)
                        .withSize(Size.SMALL)
                        .withColor(Color.YELLOW)
                        .build())
                .build();

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        return orders;
    }

    /**
     * Place Orders
     * @param orders
     */
    private void placeOrders(List<Order> orders) {
        orders.forEach(e -> e.order());
    }
}
